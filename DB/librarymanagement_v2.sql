-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2018 at 07:13 PM
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authors`
--

INSERT INTO `authors` (`au_id`, `au_name`, `contact`, `bio`) VALUES
(1, 'Prof. Dr. M. Zafar Ikbal', '01558-658542', 'He is an extra-ordinary writter.'),
(2, 'Kazi Nazrul Islam', '01985-000000', 'He is the national poeat of Bangladesh'),
(3, 'Tamim Shahriar Subin', '018220-957810', 'He wrote various proramming book'),
(4, 'Hasan Saif', '01892-985425', 'He is a history writter');

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
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`book_id`, `book_title`, `quentity`, `gener_id`, `pub_id`) VALUES
(1, 'Programming with C', 200, 4, 1),
(2, 'Mukti Juddher Itihas', 200, 3, 1),
(12, 'History Of Indian Subcontinat', 100, 3, 2),
(13, 'Bangladeshe Islam', 100, 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `book_issue`
--

CREATE TABLE IF NOT EXISTS `book_issue` (
`issue_id` int(11) NOT NULL,
  `book_id` int(11) DEFAULT NULL,
  `member_id` int(11) DEFAULT NULL,
  `issue_date` varchar(40) NOT NULL,
  `return_date` varchar(40) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book_issue`
--

INSERT INTO `book_issue` (`issue_id`, `book_id`, `member_id`, `issue_date`, `return_date`) VALUES
(1, 2, 2, '06/Jan/2018', '12/Jan/2018'),
(2, 12, 3, '09/Jan/2018', '16/Jan/2018'),
(3, 2, 1, '04/Jan/2018', '17/Jan/2018');

-- --------------------------------------------------------

--
-- Table structure for table `book_writter`
--

CREATE TABLE IF NOT EXISTS `book_writter` (
`bw_id` int(11) NOT NULL,
  `book_id` int(11) DEFAULT NULL,
  `au_id` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book_writter`
--

INSERT INTO `book_writter` (`bw_id`, `book_id`, `au_id`) VALUES
(15, 1, 3),
(16, 2, 1),
(17, 12, 1),
(18, 12, 4),
(19, 13, 4);

-- --------------------------------------------------------

--
-- Table structure for table `geners`
--

CREATE TABLE IF NOT EXISTS `geners` (
`gener_id` int(11) NOT NULL,
  `gener_name` varchar(256) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `geners`
--

INSERT INTO `geners` (`gener_id`, `gener_name`) VALUES
(1, 'Action'),
(2, 'Drama'),
(3, 'Historic'),
(4, 'Text Book');

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
(2, 'sakib khan', 'Dhaka', '01789-658215', 'skhan@gmail.com', '03/Jan/1995', '06/Jan/2018', 'General'),
(3, 'Shahruk Khan', 'Mumbai, India', '01882-095112', 'king_khan@gmail.com', '16/Dec/1771', '04/Jan/2018', 'Premium'),
(4, 'Tom Cruse', 'Los Angeles, USA', '121254582468', 'tc@gmail.com', '07/Aug/1966', '04/Jan/2018', 'Premium');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
`payment_id` int(11) NOT NULL,
  `pay_date` varchar(25) NOT NULL,
  `amount` int(11) NOT NULL,
  `member_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `publishers`
--

CREATE TABLE IF NOT EXISTS `publishers` (
`pub_id` int(11) NOT NULL,
  `pub_name` varchar(256) NOT NULL,
  `pub_address` varchar(256) NOT NULL,
  `description` varchar(256) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

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
-- Indexes for table `book_issue`
--
ALTER TABLE `book_issue`
 ADD PRIMARY KEY (`issue_id`), ADD KEY `book_id` (`book_id`), ADD KEY `member_id` (`member_id`);

--
-- Indexes for table `book_writter`
--
ALTER TABLE `book_writter`
 ADD PRIMARY KEY (`bw_id`), ADD KEY `book_id` (`book_id`), ADD KEY `au_id` (`au_id`);

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
-- Indexes for table `payment`
--
ALTER TABLE `payment`
 ADD PRIMARY KEY (`payment_id`), ADD KEY `member_id` (`member_id`);

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
MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `authors`
--
ALTER TABLE `authors`
MODIFY `au_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
MODIFY `book_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `book_issue`
--
ALTER TABLE `book_issue`
MODIFY `issue_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `book_writter`
--
ALTER TABLE `book_writter`
MODIFY `bw_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `geners`
--
ALTER TABLE `geners`
MODIFY `gener_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
MODIFY `payment_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `publishers`
--
ALTER TABLE `publishers`
MODIFY `pub_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `book`
--
ALTER TABLE `book`
ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`gener_id`) REFERENCES `geners` (`gener_id`),
ADD CONSTRAINT `book_ibfk_2` FOREIGN KEY (`pub_id`) REFERENCES `publishers` (`pub_id`);

--
-- Constraints for table `book_issue`
--
ALTER TABLE `book_issue`
ADD CONSTRAINT `book_issue_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`),
ADD CONSTRAINT `book_issue_ibfk_2` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`);

--
-- Constraints for table `book_writter`
--
ALTER TABLE `book_writter`
ADD CONSTRAINT `book_writter_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`),
ADD CONSTRAINT `book_writter_ibfk_2` FOREIGN KEY (`au_id`) REFERENCES `authors` (`au_id`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
