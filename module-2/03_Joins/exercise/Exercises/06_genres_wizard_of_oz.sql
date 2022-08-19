-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT genre.genre_name from movie
INNER JOIN movie_genre ON movie.movie_id = movie_genre.movie_id
INNER JOIN genre ON movie_genre.genre_id = genre.genre_id
WHERE movie.title = 'The Wizard of Oz'
