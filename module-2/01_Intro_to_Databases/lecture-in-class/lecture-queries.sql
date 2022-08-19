-- SELECT
-- Use a SELECT statement to return a literal string
SELECT 'Hello World!';

-- Use a SELECT statement to add two numbers together (and label the result "sum")
SELECT 3 + 5 as sum;



-- SELECT ... FROM
-- Write queries to retrieve...

-- The names from all the records in the state table
SELECT state.state_name
from state;

-- The names and populations of all cities
SELECT city_name, population
FROM city;

-- All columns from the park table
SELECT  *
FROM park;


-- SELECT __ FROM __ WHERE
-- Write queries to retrieve...

-- The names of cities in California (CA)
SELECT city_name, state_abbreviation
from city
where state_abbreviation = 'CA';

-- The names and state abbreviations of cities NOT in California
SELECT city_name, state_abbreviation
from city
where state_abbreviation <> 'CA';

-- The names and areas of cities smaller than 25 square kilometers 
SELECT city.city_name, city.area
from city
where area < 25;

-- The names from all records in the state table that have no assigned census region
select state.state_name, census_region 
from state
where census_region is null;


-- The names and census regions from all records in the state table that have an assigned census region
SELECT state.state_name, census_region
from state
WHERE census_region IS NOT NULL;


-- WHERE with AND/OR
-- Write queries to retrieve...

-- The names, areas, and populations of cities smaller than 25 sq. km. with more than 100,000 people
SELECT city.city_name, city.area, city.population
FROM city
WHERE city.area < 25 
AND city.population > 100000;

-- The names and census regions of all states (and territories and districts) not in the Midwest region (including those that don't have any census region)
select state.state_name, state.census_region
from state
WHERE state.census_region IS NULL
OR  state.census_region <> 'Midwest';


-- The names, areas, and populations of cities in California (CA) or Florida (FL)
select city_name, area, population
from city
where state_abbreviation = 'CA' 
or state_abbreviation = 'FL';


-- The names, areas, and populations of cities in New England -- Connecticut (CT), Maine (ME), Massachusetts (MA), New Hampshire (NH), Rhode Island (RI) and Vermont (VT)
select city_name, area, population
from city
where state_abbreviation = 'CT' 
or state_abbreviation = 'ME'
or state_abbreviation = 'MA'
or state_abbreviation = 'NH'
or state_abbreviation = 'RI'
or state_abbreviation = 'VT';

select city_name, area, population
from city
where state_abbreviation in ('CT','ME', 'MA', 'NH', 'RI', 'VT');

-- SELECT statements involving math
-- Write a query to retrieve the names and areas of all parks in square METERS
-- (the values in the database are stored in square kilometers)
-- Label the second column "area_in_square_meters"
SELECT park_name, (area * 1000000) as area_in_square_meters
FROM park;

-- All values vs. distinct values

-- Write a query to retrieve the names of all cities and notice repeats (like Springfield and Columbus)
SELECT city_name
from city


-- Do it again, but without the repeats (note the difference in row count)
SELECT DISTINCT city_name
from city
order by city_name


-- LIKE
-- Write queries to retrieve...

-- The names of all cities that begin with the letter "A"
SELECT city_name
from city
WHERE city_name LIKE '%a%';

-- The names of all cities that end with "Falls"
SELECT city_name
from city
WHERE city_name LIKE '%Falls';

-- The names of all cities that contain a space
SELECT city_name
from city
WHERE city_name LIKE '% %';



-- BETWEEN
-- Write a query to retrieve the names and areas of parks of at least 100 sq. kilometers but no more than 200 sq. kilometers
SELECT  park_name, 
		area as park_area
FROM park
where area >= 100
and area <= 200;


-- DATES
-- Write a query to retrieve the names and dates established of parks established before 1900

SELECT park_name, date_established
from park
where date_established < '1/1/1900';

