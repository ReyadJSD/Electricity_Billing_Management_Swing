-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill_details`
--

DROP TABLE IF EXISTS `bill_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill_details` (
  `meter_no` int DEFAULT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `meter_type` varchar(45) DEFAULT NULL,
  `last_month_units` double DEFAULT NULL,
  `current_month_units` double DEFAULT NULL,
  `units` double DEFAULT NULL,
  `bill_per_unit` double DEFAULT NULL,
  `net_bill` double DEFAULT NULL,
  `meter_rent` double DEFAULT NULL,
  `tax` double DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  `total_bill` double DEFAULT NULL,
  `pay_status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_details`
--

LOCK TABLES `bill_details` WRITE;
/*!40000 ALTER TABLE `bill_details` DISABLE KEYS */;
INSERT INTO `bill_details` VALUES (225135,'Arifur','Mirpur','Business',0,150,150,8.2,1230,75,86.1,'January',1391,'Paid'),(225135,'Arifur','Mirpur','Business',150,265,115,8.2,943,75,66.01,'February',1084,'Not Paid'),(225136,'Robin','Mirpur 10','Residential',0,75,75,4.19,314.25,45,15.71,'January',375,'Not Paid'),(225136,'Robin','Mirpur 10','Residential',75,175,100,5.72,572,45,28.6,'February',646,'Not Paid'),(225137,'Shahidul Islam','Mirpur 2','Residential',0,125,125,5.72,715,45,35.75,'January',796,'Not Paid'),(225137,'Shahidul Islam','Mirpur 2','Residential',125,230,105,5.72,600.6,45,30.03,'February',676,'Not Paid'),(225138,'Sazzad Hossain','Jatrabari','Residential',0,201,201,6.34,1274.34,45,63.72,'February',1383,'Not Paid'),(225139,'Mohinur ','Mohammodpur','Business',0,201,201,9.2,1849.2,75,129.44,'February',2054,'Not Paid'),(225140,'Mahfuj','Mohammodpur','Small Industrial',0,110,110,8.53,938.3,150,93.83,'January',1182,'Not Paid'),(225140,'Mahfuj','Mohammodpur','Small Industrial',110,500,390,12.15,4738.5,150,473.85,'February',5362,'Not Paid');
/*!40000 ALTER TABLE `bill_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-07 18:54:42
