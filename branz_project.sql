-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2020 at 07:29 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `branz_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `master_access`
--

CREATE TABLE `master_access` (
  `Username` text NOT NULL,
  `Password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_access`
--

INSERT INTO `master_access` (`Username`, `Password`) VALUES
('master_root', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `owner_detail_apart`
--

CREATE TABLE `owner_detail_apart` (
  `Id_Number` text NOT NULL,
  `Name` text NOT NULL,
  `Address` varchar(200) NOT NULL,
  `No_Handphone` text NOT NULL,
  `RP_Tower` text NOT NULL,
  `RP_Bed` text NOT NULL,
  `RP_Unit_Style` text NOT NULL,
  `Used_KWH` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `report_kwh`
--

CREATE TABLE `report_kwh` (
  `Id_Number` text NOT NULL,
  `Name` text NOT NULL,
  `No_Handphone` text NOT NULL,
  `Usage_KWH` text NOT NULL,
  `Total` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `owner_detail_apart`
--
ALTER TABLE `owner_detail_apart`
  ADD PRIMARY KEY (`Id_Number`(7));

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
