-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 23, 2021 at 10:47 AM
-- Server version: 10.3.31-MariaDB-0+deb10u1
-- PHP Version: 7.3.31-1~deb10u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `organization`
--

-- --------------------------------------------------------

--
-- Table structure for table `asset`
--

CREATE TABLE `asset` (
  `assetid` int(11) NOT NULL,
  `asset_type` varchar(255) DEFAULT NULL,
  `isactive` bit(1) NOT NULL,
  `organizationid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `asset`
--

INSERT INTO `asset` (`assetid`, `asset_type`, `isactive`, `organizationid`) VALUES
(11, 'mike', b'1', NULL),
(12, 'mike', b'0', NULL),
(13, 'Headset', b'1', 4);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employeeid` int(11) NOT NULL,
  `age` varchar(255) DEFAULT NULL,
  `employeename` varchar(255) DEFAULT NULL,
  `isactive` bit(1) NOT NULL,
  `organizationid` int(11) DEFAULT NULL,
  `salary` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employeeid`, `age`, `employeename`, `isactive`, `organizationid`, `salary`) VALUES
(6, NULL, 'coushik', b'1', NULL, NULL),
(8, NULL, 'coushik', b'1', NULL, NULL),
(9, NULL, 'coushik', b'1', NULL, NULL),
(10, NULL, 'coushik', b'1', 4, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(15);

-- --------------------------------------------------------

--
-- Table structure for table `organization`
--

CREATE TABLE `organization` (
  `organizationid` int(11) NOT NULL,
  `isactive` bit(1) NOT NULL,
  `organizationname` varchar(255) DEFAULT NULL,
  `organizationtype` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `organization`
--

INSERT INTO `organization` (`organizationid`, `isactive`, `organizationname`, `organizationtype`) VALUES
(4, b'1', 'Siemen', 'Product'),
(5, b'0', 'Siemens', 'Product'),
(7, b'1', 'Siemens', 'Product'),
(14, b'1', 'Nttdata', 'Product');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `asset`
--
ALTER TABLE `asset`
  ADD PRIMARY KEY (`assetid`),
  ADD UNIQUE KEY `assetid` (`assetid`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employeeid`);

--
-- Indexes for table `organization`
--
ALTER TABLE `organization`
  ADD PRIMARY KEY (`organizationid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
