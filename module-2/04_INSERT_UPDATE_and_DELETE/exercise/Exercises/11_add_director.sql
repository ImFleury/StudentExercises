-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet.
-- Add yourself to the person table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)
INSERT INTO person
VALUES (2984916, 'Austin Fleury', '1997-05-14', null, null, null, null);
UPDATE movie
SET director_id = 2984916
WHERE title = 'The Blob';


