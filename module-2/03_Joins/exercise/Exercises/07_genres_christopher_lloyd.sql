-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.
SELECT DISTINCT genre.genre_name from movie
INNER JOIN movie_genre ON movie.movie_id = movie_genre.movie_id
INNER JOIN genre ON movie_genre.genre_id = genre.genre_id
INNER JOIN movie_actor ON movie.movie_id = movie_actor.movie_id
INNER JOIN person ON movie_actor.actor_id = person.person_id
WHERE person.person_name = 'Christopher Lloyd';