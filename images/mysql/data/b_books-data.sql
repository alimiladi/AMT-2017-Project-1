SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

USE books_db;

--
-- Dumping data for table book
--

SET AUTOCOMMIT=0;
INSERT INTO book VALUES 
(1,'7976c9f2-e5a','The black fog','action', 'Simone de Beauvoir', 210),
(2,'4539265a-5db','Forgive and Forget','adventure', 'Michael Chabon', 223),
(3,'bd400469-cf1','Smoke','science-fiction', 'Alan Garner', 328),
(4,'e43b2b41-97e','Broken','horror', 'Martin Gilbert', 430);
COMMIT;