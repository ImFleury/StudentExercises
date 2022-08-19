-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)
SELECT movie.tagline, movie.title from movie
INNER JOIN movie_genre ON movie.movie_id = movie_genre.movie_id
INNER JOIN genre ON movie_genre.genre_id = genre.genre_id
WHERE genre.genre_name = 'Fantasy'
ORDER BY movie.title;