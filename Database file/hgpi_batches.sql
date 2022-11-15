-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 26, 2020 at 05:36 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hgpi_batches`
--

-- --------------------------------------------------------

--
-- Table structure for table `batches`
--

CREATE TABLE IF NOT EXISTS `batches` (
  `bid` int(20) DEFAULT NULL,
  `bname` varchar(20) DEFAULT NULL,
  `totstu` int(20) DEFAULT NULL,
  `facid` int(20) DEFAULT NULL,
  `crsid` int(20) DEFAULT NULL,
  `starttime` int(20) DEFAULT NULL,
  `endtime` int(20) DEFAULT NULL,
  `meridian` varchar(20) DEFAULT NULL,
  `meridian_to` varchar(20) DEFAULT NULL,
  `ctopic` varchar(20) DEFAULT NULL,
  `frqncy` int(11) DEFAULT NULL,
  `maxcap` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `batches`
--

INSERT INTO `batches` (`bid`, `bname`, `totstu`, `facid`, `crsid`, `starttime`, `endtime`, `meridian`, `meridian_to`, `ctopic`, `frqncy`, `maxcap`) VALUES
(1, 'java', 20, 203, 103, 5, 6, 'pm', '', 'INHERITANCE', NULL, NULL),
(2, 'c++ basics', 21, 102, 102, 10, 11, 'AM', '5', 'inheritance', NULL, NULL),
(3, 'c++', 50, 201, 101, 10, 11, 'PM', '22', 'loops', NULL, NULL),
(4, 'final array', 10, 202, 102, 12, 1, 'PM', '7', 'array', 20, 'PM'),
(5, 'abb', 7, 201, 101, 10, 11, 'AM', '7', 'uu', 20, 'AM'),
(6, 'BASICS OF PYTHON', 1, 204, 104, 5, 6, 'PM', 'WEEKENDS', 'CODING', 20, 'PM'),
(7, 'over view', 4, 204, 104, 8, 9, 'AM', 'AM', 'basic', 20, '30'),
(8, 'intermediate', 5, 104, 104, 5, 7, 'PM', 'PM', 'BASICS', 56, '20'),
(9, 'PYTHON', 3, 204, 104, 7, 8, 'PM', 'PM', 'FRAMES', 7, '20'),
(10, 'CORE JAVA', 11, 203, 103, 10, 12, 'AM', 'AM', 'BASICS', 0, '30'),
(11, 'CSE', 12, 203, 103, 11, 12, 'AM', 'AM', 'BASICS', 7, '13'),
(12, 'CSE', 11, 17, 103, 11, 12, 'AM', 'AM', 'BASIC', 56, '12'),
(13, 'CSE', 17, 203, 103, 10, 11, 'AM', 'AM', 'BASICS', 7, '19');

-- --------------------------------------------------------

--
-- Table structure for table `batch_dates`
--

CREATE TABLE IF NOT EXISTS `batch_dates` (
  `bid` int(20) DEFAULT NULL,
  `dos` date DEFAULT NULL,
  `doec` date DEFAULT NULL,
  `doac` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `batch_dates`
--

INSERT INTO `batch_dates` (`bid`, `dos`, `doec`, `doac`) VALUES
(5, '2018-02-25', '2018-02-26', '2018-10-10'),
(10, '0000-00-00', '0000-00-00', NULL),
(11, '0000-00-00', '0000-00-00', NULL),
(12, '0000-00-00', '0000-00-00', NULL),
(12, '0000-00-00', '0000-00-00', NULL),
(13, '0000-00-00', '0000-00-00', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE IF NOT EXISTS `courses` (
  `crsid` int(20) DEFAULT NULL,
  `crsname` varchar(20) DEFAULT NULL,
  `dur` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`crsid`, `crsname`, `dur`) VALUES
(101, 'C\n', 2.5),
(102, 'C++', 2.5),
(103, 'Java', 3),
(104, 'PYTHON', 1);

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE IF NOT EXISTS `faculty` (
  `fid` int(20) DEFAULT NULL,
  `fname` varchar(20) DEFAULT NULL,
  `doj` date DEFAULT NULL,
  `crsname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`fid`, `fname`, `doj`, `crsname`) VALUES
(201, 'abc', '1992-06-20', ''),
(202, 'Manju', '2018-06-20', ''),
(203, 'vinod', '2015-05-07', 'java'),
(204, 'POOJA', '2013-11-29', '');

-- --------------------------------------------------------

--
-- Table structure for table `faculty_courses`
--

CREATE TABLE IF NOT EXISTS `faculty_courses` (
  `fid` int(20) DEFAULT NULL,
  `crsid` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty_courses`
--

INSERT INTO `faculty_courses` (`fid`, `crsid`) VALUES
(201, 101),
(202, 102),
(203, 103),
(204, 104);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE IF NOT EXISTS `students` (
  `sid` int(20) DEFAULT NULL,
  `sname` varchar(20) DEFAULT NULL,
  `crsid` int(20) DEFAULT NULL,
  `doa` date DEFAULT NULL,
  `phno` int(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `bid` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`sid`, `sname`, `crsid`, `doa`, `phno`, `email`, `bid`) VALUES
(1, 'zain', 102, '2018-05-01', 514684561, 'kjcdafhkun@hdfkahk', 2),
(2, 'Sahil', 101, '2018-01-25', 123456789, 'sahil@gmail.com', 5),
(3, 'ASIF', 104, '2018-10-18', 882502339, 'ZAINSAHIL042@GMAIL.COM', 6),
(4, 'JATIN', 104, '2018-10-18', 825151545, 'JAtin@GMAIL.COM', 6),
(5, 'SHABBU', 103, '0000-00-00', 123456789, 'HGFGGHV@HVGH.COM', 10),
(6, 'KIRTI', 103, '0000-00-00', 1234567890, 'WQERTY@GMAIL.COM', 11);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `uname` varchar(20) DEFAULT NULL,
  `upwd` int(20) DEFAULT NULL,
  `utype` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uname`, `upwd`, `utype`) VALUES
('anil', 789, 'staff'),
('anil', 789, 'admin'),
('sahil', 123, 'admin'),
('ZAIN', 123, 'admin'),
('GAMANI', 123, 'admin'),
('moti', 123, 'admin'),
('RAKHI', 123, 'admin'),
('SHABBU', 123, 'staff'),
('RIYA', 123, 'staff'),
('SHOW', 123, 'staff'),
('DIVYA', 123, 'staff');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
