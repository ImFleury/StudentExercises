-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)
SELECT DISTINCT person.person_name from person
INNER JOIN movie_actor ON movie_actor.actor_id = person.person_id
INNER JOIN movie ON movie_actor.movie_id = movie.movie_id
INNER JOIN collection ON collection.collection_id = movie.collection_id
WHERE collection.collection_name = 'Back to the Future Collection';
