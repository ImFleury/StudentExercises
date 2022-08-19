-- INSERT

-- Add Disneyland to the park table. (It was established on 7/17/1955, has an area of 2.1 square kilometers and does not offer camping.)
Select * from park;
INSERT INTO park (park_name, date_established, area, has_camping)
VALUES ('Disneyland', '7/17/1955', 2.1, false);


-- Add Hawkins, IN (with a population of 30,000 and an area of 38.1 square kilometers) and Cicely, AK (with a popuation of 839 and an area of 11.4 square kilometers) to the city table.
INSERT INTO city (city_name, state_abbreviation, population, area)
VALUES ('Hawkins', 'IN',   30000, 38.1),
	   ('Cicely', 'AK',   839, 11.4);
-- Since Disneyland is in California (CA), add a record representing that to the park_state table.
INSERT INTO park_state(park_id, state_abbreviation)
Select park_id, 'CA'
from park
where park_name = 'Disneyland'
limit 1;

select * from park_state;




-- UPDATE

-- Change the state nickname of California to "The Happiest Place on Earth."
UPDATE state
set state_nickname = 'The Happiest Place on Earth'
WHERE state_abbreviation = 'CA';
select * from state;


-- Increase the population of California by 1,000,000.
UPDATE state
	set population = population + 1000000
Where state_abbreviation = 'CA';


-- Change the capital of California to Anaheim.
UPDATE state
	set capital = (SELECT city_id from city where city_name = 'Anaheim' and state_abbreviation = 'CA' LIMIT 1)
WHERE state_abbreviation = 'CA';


-- Change California's nickname back to "The Golden State", reduce the population by 1,000,000, and change the capital back to Sacramento.
UPDATE state
	set population = population - 1000000,
		state_nickname = 'The Golden State',
		capital = (SELECT city_id from city where city_name = 'Sacramento' and state_abbreviation = 'CA' LIMIT 1)
WHERE state_abbreviation = 'CA';

SELECT * from state;
-- DELETE

-- Delete Hawkins, IN from the city table.
SELECT * 
from city
where city_name = 'Hawkins'
and state_abbreviation = 'IN';


-- Delete all cities with a population of less than 1,000 people from the city table.

DELETE 
from city
where population < 1000;



-- REFERENTIAL INTEGRITY

-- Try adding a city to the city table with "XX" as the state abbreviation.
select * from state order by state_abbreviation;
 INSERT INTO City(city_name, state_abbreviation, population, area)
 VALUES ('Hobo town', 'XX', 100,1)


-- Try deleting California from the state table.
Delete
from state
where state_abbreviation = 'CA'


-- Try deleting Disneyland from the park table. Try again after deleting its record from the park_state table.
Delete
from park_state
WHERE park_state.park_id in (select park.park_id 
							 from park
							 where park.park_id = park_state.park_id 
							 and park.park_name = 'Disneyland');

	
Delete
from park
where park_name = 'Disneyland';


-- CONSTRAINTS

-- NOT NULL constraint
-- Try adding Smallville, KS to the city table without specifying its population or area.
INSERT INTO city(city_name, state_abbreviation)
VALUES ('Smallville','KS');


-- DEFAULT constraint
-- Try adding Smallville, KS again, specifying an area but not a population.
INSERT INTO city(city_name, state_abbreviation, area)
VALUES ('Smallville','KS', 200);


-- Retrieve the new record to confirm it has been given a default, non-null value for population.
SELECT * from city where city_name = 'Smallville';

-- UNIQUE constraint
-- Try changing California's nickname to "Vacationland" (which is already the nickname of Maine).
UPDATE state
	set state_nickname = 'VacationLand'
WHERE state.state_abbreviation = 'CA';


-- CHECK constraint
-- Try changing the census region of Florida (FL) to "Southeast" (which is not a valid census region).
UPDATE state
	set census_region = 'Southeast'
WHERE state.state_abbreviation = 'FL'



-- TRANSACTIONS

-- Delete the record for Smallville, KS within a transaction.
BEGIN TRANSACTION 
DELETE from city
WHERE city_name = 'Smallville';

select * from city WHERE city_name = 'Smallville';
COMMIT;


-- Delete all of the records from the park_state table, but then "undo" the deletion by rolling back the transaction.
BEGIN TRANSACTION
 	select count(*) from park_state;
	delete from park_state;
	select count(*) from park_state;
	
ROllBACK;
COMMIT;



-- Update all of the cities to be in the state of Texas (TX), but then roll back the transaction.
START TRANSACTION;

	UPDATE city
		set state_abbreviation = 'TX'
		
select count(*) from city where state_abbreviation = 'TX';

ROLLBACK;


-- Demonstrate two different SQL connections trying to access the same table where one is inside of a transaction but hasn't committed yet.
