SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

USE books_db;

--
-- Dumping data for table book
--

SET AUTOCOMMIT=0;
INSERT INTO book VALUES 
(1,'ABCD','GUINESS','action', 'CHASE', 210),
(2,'EFGH','DAVIS','advanture', 'JOHANSSON', 223),
(3,'IJKL','CAGE','science-fiction', 'BLOOM', 328),
(4,'MNOP','DAVIS','horror', 'MARKS', 430);
COMMIT;