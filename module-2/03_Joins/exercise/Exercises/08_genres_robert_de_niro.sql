-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)
SELECT DISTINCT genre.genre_name from movie
INNER JOIN movie_genre ON movie.movie_id = movie_genre.movie_id
INNER JOIN genre ON movie_genre.genre_id = genre.genre_id
INNER JOIN movie_actor ON movie.movie_id = movie_actor.movie_id
INNER JOIN person ON movie_actor.actor_id = person.person_id
WHERE person.person_name = 'Robert De Niro' AND movie.release_date >= '1/01/2010';

