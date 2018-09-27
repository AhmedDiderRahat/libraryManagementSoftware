-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2018 at 07:51 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `librarymanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
`admin_id` int(11) NOT NULL,
  `user_name` varchar(256) NOT NULL,
  `password` varchar(256) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `user_name`, `password`) VALUES
(1, 'a', '1');

-- --------------------------------------------------------

--
-- Table structure for table `authors`
--

CREATE TABLE IF NOT EXISTS `authors` (
`au_id` int(11) NOT NULL,
  `au_name` varchar(256) NOT NULL,
  `contact` varchar(25) NOT NULL,
  `bio` varchar(256) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authors`
--

INSERT INTO `authors` (`au_id`, `au_name`, `contact`, `bio`) VALUES
(1, 'Prof. Dr. M. Zafar Ikbal', '01558-658542', 'He is an extra-ordinary writter.'),
(2, 'Kazi Nazrul Islam', '01985-000000', 'He is the national poeat of Bangladesh');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
`book_id` int(11) NOT NULL,
  `book_title` varchar(255) NOT NULL,
  `quentity` int(11) NOT NULL,
  `gener_id` int(11) DEFAULT NULL,
  `pub_id` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`book_id`, `book_title`, `quentity`, `gener_id`, `pub_id`) VALUES
(1, 'Programming with C', 100, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `geners`
--

CREATE TABLE IF NOT EXISTS `geners` (
`gener_id` int(11) NOT NULL,
  `gener_name` varchar(256) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `geners`
--

INSERT INTO `geners` (`gener_id`, `gener_name`) VALUES
(1, 'Action'),
(2, 'Drama');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE IF NOT EXISTS `member` (
  `member_id` int(11) NOT NULL,
  `member_name` varchar(256) NOT NULL,
  `address` varchar(256) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(256) NOT NULL,
  `dob` varchar(25) NOT NULL,
  `join_date` varchar(25) NOT NULL,
  `member_type` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`member_id`, `member_name`, `address`, `phone`, `email`, `dob`, `join_date`, `member_type`) VALUES
(1, 'Opu Bissas', 'Moulvibazar', '01982-254692', 'opu@yahoo.com', '03/Jan/1995', '06/Jan/2018', 'General'),
(2, 'sakib khan', 'Dhaka', '01789-658215', 'skhan@gmail.com', '03/Jan/1995', '06/Jan/2018', 'Premium');

-- --------------------------------------------------------

--
-- Table structure for table `publishers`
--

CREATE TABLE IF NOT EXISTS `publishers` (
`pub_id` int(11) NOT NULL,
  `pub_name` varchar(256) NOT NULL,
  `pub_address` varchar(256) NOT NULL,
  `description` varchar(256) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `publishers`
--

INSERT INTO `publishers` (`pub_id`, `pub_name`, `pub_address`, `description`) VALUES
(1, 'Adhunik prokashoni', '15-8/A, Motijil, Dhaka, Bangladesh', 'this is the description'),
(2, 'Panjeri', 'Dhaka, Bangladesh', 'Notebook company'),
(3, 'Islamic Fundation', 'Sylhet, Bangladesh', 'Islamic Book');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `authors`
--
ALTER TABLE `authors`
 ADD PRIMARY KEY (`au_id`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
 ADD PRIMARY KEY (`book_id`), ADD KEY `gener_id` (`gener_id`), ADD KEY `pub_id` (`pub_id`);

--
-- Indexes for table `geners`
--
ALTER TABLE `geners`
 ADD PRIMARY KEY (`gener_id`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
 ADD PRIMARY KEY (`member_id`);

--
-- Indexes for table `publishers`
--
ALTER TABLE `publishers`
 ADD PRIMARY KEY (`pub_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `authors`
--
ALTER TABLE `authors`
MODIFY `au_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
MODIFY `book_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `geners`
--
ALTER TABLE `geners`
MODIFY `gener_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `publishers`
--
ALTER TABLE `publishers`
MODIFY `pub_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `book`
--
ALTER TABLE `book`
ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`gener_id`) REFERENCES `geners` (`gener_id`),
ADD CONSTRAINT `book_ibfk_2` FOREIGN KEY (`pub_id`) REFERENCES `publishers` (`pub_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
