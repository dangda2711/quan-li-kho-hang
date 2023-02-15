-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3325
-- Generation Time: Feb 06, 2023 at 06:56 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlikho`
--
CREATE DATABASE IF NOT EXISTS `quanlikho` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `quanlikho`;

-- --------------------------------------------------------

--
-- Table structure for table `khohang`
--

CREATE TABLE `khohang` (
  `id` int(11) NOT NULL,
  `tenhang` varchar(50) NOT NULL,
  `loaihang` varchar(15) DEFAULT NULL,
  `soluonghang` int(11) DEFAULT NULL,
  `motahang` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `khohang`
--

INSERT INTO `khohang` (`id`, `tenhang`, `loaihang`, `soluonghang`, `motahang`) VALUES
(1, 'Máy tính Lenovo', 'Điện tử', 12, 'máy tính lenovo core i9, ram 16gb, ssd 500gb'),
(5, 'Máy tính', 'Điện tử', 15, 'Máy tính sách tay (laptop Dell)'),
(7, 'Tai nghe ipod', 'Điện tử', 15, 'tai nghe ko dây'),
(8, 'Tai nghe Hoco', 'Điện tử', 100, 'Tai nghe hoco, có dây, 3.5mm công nghệ tai nghe mới'),
(9, 'chảo chống dính sunhouse', 'Đồ gia dụng', 19, 'chảo chống dính thương hiệu sunhouse , đường kính 30 cm'),
(10, 'Máy tính macbook', 'Điện tử', 150, 'Máy tính macbook 2022'),
(11, 'Kem dương da', 'Mĩ phẩm ', 14, 'kem dương da mặt'),
(12, 'Son môi YG', 'Mĩ phẩm ', 15, 'Son 7 màu'),
(13, 'Bếp ga mini', 'Đồ gia dụng', 14, 'bếp ga mini đun siêu nhanh'),
(14, 'Mì ăn liền Hảo Hảo', 'Thực phẩm', 20, 'Mì ăn liền hảo hảo siêu cay'),
(15, 'Máy lọc nước', 'Điện tử', 19, 'Máy lọc nước kagaru'),
(16, 'Keo dán ống nhựa', 'Khác', 19, 'môi trường');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `khohang`
--
ALTER TABLE `khohang`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `khohang`
--
ALTER TABLE `khohang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
