-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT state_name, population
FROM state
ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.

SELECT state_name,census_region
from state
ORDER BY census_region DESC, state_name;
-- The biggest park by area
SELECT park_name, area
from park
ORDER by area DESC
LIMIT 1;


SELECT park_name, MAX(area)
from park
group by park_name
ORDER by MAX(area) DESC
LIMIT 1;
-- LIMITING RESULTS
SELECT city_name, population
from city
order by population DESC
LIMIT 10
-- The 10 largest cities by populations



-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.

SELECT sortedList.*
FROM (
        SELECT park_name, date_established
        from park
        order by date_established asc, park_name asc
        limit 20) as sortedList
 order by sortedList.park_name

SELECT CURRENT_DATE - date_established AS age, park_name -- difference between the two dates is given in days
--SELECT (CURRENT_DATE - date_established) / 365 AS age, park_name -- divide difference by 365 to determine years
--SELECT (date_part('year', CURRENT_DATE) - date_part('year', date_established)) AS age, park_name
--SELECT (EXTRACT(year FROM CURRENT_DATE) - EXTRACT(year FROM date_established)) AS age, park_name
FROM park
ORDER BY age DESC, park_name ASC
LIMIT 20;


-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT city_name || ' ' || state_abbreviation
from city
order by  state_abbreviation desc, city_name asc;


SELECT CONCAT(city_name , ' ' ,state_abbreviation)
from city
order by  state_abbreviation desc, city_name asc;

-- The all parks by name and date established.
SELECT park_name || ' ' || date_established
from park

SELECT park_name ,to_char(date_established, 'MM/DD/YYYY HH:mm:ss') as NewDate
 from park

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT census_region || ' - ' || state_name
from state
WHERE census_region in ('West','Midwest')
ORDER BY census_region ASC , state_name ASC


-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.

SELECT to_char(
                AVG(population),
                'FM999999999.00'
              ) as average_population
from state;

-- Total population in the West and South census regions
SELECT SUM(population) as population_WestSouth
from state
WHERE census_region in ('West','South');


Select COALESCE(census_region, census_region,census_region, 'unknown'), SUM(population) as population
from state
group by census_region

-- The number of cities with populations greater than 1 million
SELECT COUNT(*)
from city
where population > 1000000

-- The number of state nicknames.
select COUNT(*)
from state
WHERE state_nickname IS NOT NULL;

SELECT COUNT(state_nickname)
from state;


-- The area of the smallest and largest parks.
SELECT MIN(area) as smallest, MAX area) as largest
from park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT state_abbreviation, count(city) as city_count
from city
GROUP BY state_abbreviation
ORDER BY city_count DESC


-- Determine the average park area depending upon whether parks allow camping or not.
SELECT has_camping, to_char(AVG(area), 'FM999999999.00') as average_park_area
from park
where has_camping = true
GROUP BY has_camping;



-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT  state_abbreviation,sum(population)
from city
GROUP BY state_abbreviation
ORDER BY state_abbreviation;

-- The smallest city population in each state ordered by city population.

SELECT  state_abbreviation, MIN(population) as smallest_city_population
from city
GROUP BY state_abbreviation
order by MIN(population), state_abbreviation

-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)
SELECT city_name, population
from city
ORDER BY city_name
OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY;


-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,
SELECT
        COUNT(c.city_name) as cities,
        c.state_abbreviation,
        (SELECT state.state_name from state WHERE state.state_abbreviation = c.state_abbreviation) as state_name 
from city as c
GROUP BY state_abbreviation
ORDER BY cities

-- Include the names of the smallest and largest parks
SELECT park_name, area
from park p

SELECT MIN(area) as smallest, MAX area) as largest
from park;


-- List the capital cities for the states in the Northeast census region.

