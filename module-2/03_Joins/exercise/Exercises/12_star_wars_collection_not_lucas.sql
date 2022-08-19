-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)
SELECT movie.title from movie
INNER JOIN collection ON collection.collection_id = movie.collection_id
INNER JOIN person ON movie.director_id = person.person_id
WHERE person.person_name <> 'George Lucas' AND collection.collection_name = 'Star Wars Collection';

