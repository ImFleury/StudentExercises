-- 21. The census region, and the average, minimum, and maximum population of states and districts in each census region. Exclude ones that don't have a census region.
-- Name the population columns 'average_population, 'min_population', and 'max_population'.
-- Order the results from lowest to highest average population.
-- (4 rows)
SELECT census_region, AVG(population) as average_population, MIN(population) as min_population, MAX(population) as max_population
FROM state
WHERE census_region IS NOT null
GROUP by census_region
ORDER by average_population ASC


