CREATE DATABASE  IF NOT EXISTS `myproodos` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `myproodos`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: myproodos
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `ergazomenoi.misthos`
--

DROP TABLE IF EXISTS `ergazomenoi.misthos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenoi.misthos` (
  `ErgazomenosID` int NOT NULL,
  `ThesiErgazomenouType` tinyint NOT NULL,
  `TiposMisthou` tinyint NOT NULL,
  `WresErgasiasMhna` int NOT NULL,
  `TrexonMisthos` varchar(20) NOT NULL,
  PRIMARY KEY (`ErgazomenosID`,`ThesiErgazomenouType`,`TiposMisthou`),
  UNIQUE KEY `ErgazomenosID_UNIQUE` (`ErgazomenosID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenoi.misthos`
--

LOCK TABLES `ergazomenoi.misthos` WRITE;
/*!40000 ALTER TABLE `ergazomenoi.misthos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenoi.misthos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.apousiatype`
--

DROP TABLE IF EXISTS `ergazomenos.apousiatype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.apousiatype` (
  `ApousiaTypeID` int NOT NULL AUTO_INCREMENT,
  `Onoma` varchar(20) NOT NULL,
  PRIMARY KEY (`ApousiaTypeID`),
  UNIQUE KEY `idErgazomenos.ApousiaType_UNIQUE` (`ApousiaTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.apousiatype`
--

LOCK TABLES `ergazomenos.apousiatype` WRITE;
/*!40000 ALTER TABLE `ergazomenos.apousiatype` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.apousiatype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.energos/anenergos`
--

DROP TABLE IF EXISTS `ergazomenos.energos/anenergos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.energos/anenergos` (
  `ErgazomenosID` int NOT NULL,
  `Katastash` tinyint NOT NULL,
  PRIMARY KEY (`ErgazomenosID`),
  UNIQUE KEY `_UNIQUE` (`Katastash`),
  UNIQUE KEY `Proslipsi/ApolisiID_UNIQUE` (`ErgazomenosID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.energos/anenergos`
--

LOCK TABLES `ergazomenos.energos/anenergos` WRITE;
/*!40000 ALTER TABLE `ergazomenos.energos/anenergos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.energos/anenergos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.energos/anenergostype`
--

DROP TABLE IF EXISTS `ergazomenos.energos/anenergostype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.energos/anenergostype` (
  `Energos/AnenergosID` int NOT NULL AUTO_INCREMENT,
  `Onoma` varchar(20) NOT NULL,
  PRIMARY KEY (`Energos/AnenergosID`),
  UNIQUE KEY `Energos/AnenergosID_UNIQUE` (`Energos/AnenergosID`),
  UNIQUE KEY `Onoma_UNIQUE` (`Onoma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.energos/anenergostype`
--

LOCK TABLES `ergazomenos.energos/anenergostype` WRITE;
/*!40000 ALTER TABLE `ergazomenos.energos/anenergostype` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.energos/anenergostype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.hmererominiaapousias`
--

DROP TABLE IF EXISTS `ergazomenos.hmererominiaapousias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.hmererominiaapousias` (
  `ErgazomenosID` int NOT NULL,
  `TyposApousias` tinyint NOT NULL,
  `HmerominiaApo` date NOT NULL,
  `HmerominiaEws` date NOT NULL,
  PRIMARY KEY (`ErgazomenosID`,`TyposApousias`),
  UNIQUE KEY `ErgazomenosID_UNIQUE` (`ErgazomenosID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.hmererominiaapousias`
--

LOCK TABLES `ergazomenos.hmererominiaapousias` WRITE;
/*!40000 ALTER TABLE `ergazomenos.hmererominiaapousias` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.hmererominiaapousias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.hmerominiaporiasmisthou`
--

DROP TABLE IF EXISTS `ergazomenos.hmerominiaporiasmisthou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.hmerominiaporiasmisthou` (
  `ErgazomenosID` int NOT NULL,
  `PosoMisthou` varchar(20) DEFAULT NULL,
  `HmerominiaApo` datetime DEFAULT NULL,
  `HmerominiaEws` datetime DEFAULT NULL,
  `Ergazomenoi.Misthos_ErgazomenosID` int NOT NULL,
  `Ergazomenoi.Misthos_ThesiErgazomenouType` tinyint NOT NULL,
  `Ergazomenoi.Misthos_TiposMisthou` tinyint NOT NULL,
  PRIMARY KEY (`ErgazomenosID`,`Ergazomenoi.Misthos_ErgazomenosID`,`Ergazomenoi.Misthos_ThesiErgazomenouType`,`Ergazomenoi.Misthos_TiposMisthou`),
  UNIQUE KEY `ErgazomenosID_UNIQUE` (`ErgazomenosID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.hmerominiaporiasmisthou`
--

LOCK TABLES `ergazomenos.hmerominiaporiasmisthou` WRITE;
/*!40000 ALTER TABLE `ergazomenos.hmerominiaporiasmisthou` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.hmerominiaporiasmisthou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.hmerominiaproslipsisapolisis`
--

DROP TABLE IF EXISTS `ergazomenos.hmerominiaproslipsisapolisis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.hmerominiaproslipsisapolisis` (
  `ErgazomenosID` int NOT NULL,
  `HmerominiaProslipsis` datetime NOT NULL,
  `HmerominiaApolisis` datetime DEFAULT NULL,
  PRIMARY KEY (`ErgazomenosID`),
  UNIQUE KEY `ErgazomenosID_UNIQUE` (`ErgazomenosID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.hmerominiaproslipsisapolisis`
--

LOCK TABLES `ergazomenos.hmerominiaproslipsisapolisis` WRITE;
/*!40000 ALTER TABLE `ergazomenos.hmerominiaproslipsisapolisis` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.hmerominiaproslipsisapolisis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.oresergasiasimerisios`
--

DROP TABLE IF EXISTS `ergazomenos.oresergasiasimerisios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.oresergasiasimerisios` (
  `ErgazomenosID` int NOT NULL,
  `EnarksiVardias` datetime DEFAULT NULL,
  `TelosVardias` datetime DEFAULT NULL,
  `Ergazomenoi.Misthos_ErgazomenosID` int NOT NULL,
  `Ergazomenoi.Misthos_ThesiErgazomenouType` tinyint NOT NULL,
  `Ergazomenoi.Misthos_TiposMisthou` tinyint NOT NULL,
  PRIMARY KEY (`ErgazomenosID`,`Ergazomenoi.Misthos_ErgazomenosID`,`Ergazomenoi.Misthos_ThesiErgazomenouType`,`Ergazomenoi.Misthos_TiposMisthou`),
  UNIQUE KEY `ErgazomenosID_UNIQUE` (`ErgazomenosID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.oresergasiasimerisios`
--

LOCK TABLES `ergazomenos.oresergasiasimerisios` WRITE;
/*!40000 ALTER TABLE `ergazomenos.oresergasiasimerisios` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.oresergasiasimerisios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.stoixeia`
--

DROP TABLE IF EXISTS `ergazomenos.stoixeia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.stoixeia` (
  `AFM` int NOT NULL,
  `Onoma` varchar(25) NOT NULL,
  `Eponimo` varchar(25) NOT NULL,
  `Patronimo` varchar(25) DEFAULT NULL,
  `Mitronimo` varchar(25) DEFAULT NULL,
  `AMKA` int NOT NULL,
  `Diefthinsi` varchar(100) NOT NULL,
  `Email 1` varchar(45) DEFAULT NULL,
  `Email 2` varchar(45) DEFAULT NULL,
  `Agamos/Eggamos` tinyint DEFAULT NULL,
  `Arithmos Paidiwn` smallint DEFAULT NULL,
  PRIMARY KEY (`AFM`),
  UNIQUE KEY `AFM_UNIQUE` (`AFM`),
  UNIQUE KEY `AMKA_UNIQUE` (`AMKA`),
  UNIQUE KEY `Email 1_UNIQUE` (`Email 1`),
  UNIQUE KEY `Email 2_UNIQUE` (`Email 2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.stoixeia`
--

LOCK TABLES `ergazomenos.stoixeia` WRITE;
/*!40000 ALTER TABLE `ergazomenos.stoixeia` DISABLE KEYS */;
INSERT INTO `ergazomenos.stoixeia` VALUES (123456789,'kwstas','koulai','artan','arta',1234567890,'androutsou 21','kwstas.kostas@yahoo.com',NULL,1,0);
/*!40000 ALTER TABLE `ergazomenos.stoixeia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.stoixeia_has_ergazomenoi.misthos`
--

DROP TABLE IF EXISTS `ergazomenos.stoixeia_has_ergazomenoi.misthos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.stoixeia_has_ergazomenoi.misthos` (
  `Ergazomenos.Stoixeia_AFM` int NOT NULL,
  `Ergazomenoi.Misthos_ErgazomenosID` int NOT NULL,
  `Ergazomenoi.Misthos_ThesiErgazomenouType` tinyint NOT NULL,
  `Ergazomenoi.Misthos_TiposMisthou` tinyint NOT NULL,
  PRIMARY KEY (`Ergazomenos.Stoixeia_AFM`,`Ergazomenoi.Misthos_ErgazomenosID`,`Ergazomenoi.Misthos_ThesiErgazomenouType`,`Ergazomenoi.Misthos_TiposMisthou`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.stoixeia_has_ergazomenoi.misthos`
--

LOCK TABLES `ergazomenos.stoixeia_has_ergazomenoi.misthos` WRITE;
/*!40000 ALTER TABLE `ergazomenos.stoixeia_has_ergazomenoi.misthos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.stoixeia_has_ergazomenoi.misthos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.stoixeiagamos`
--

DROP TABLE IF EXISTS `ergazomenos.stoixeiagamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.stoixeiagamos` (
  `Ergazomenos.StoixeiaGamosID` tinyint NOT NULL AUTO_INCREMENT,
  `Katastash` char(3) NOT NULL,
  `Ergazomenos.Stoixeia_AFM` int NOT NULL,
  PRIMARY KEY (`Ergazomenos.StoixeiaGamosID`),
  UNIQUE KEY `Ergazomenos.StoixeiaGamosID_UNIQUE` (`Ergazomenos.StoixeiaGamosID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.stoixeiagamos`
--

LOCK TABLES `ergazomenos.stoixeiagamos` WRITE;
/*!40000 ALTER TABLE `ergazomenos.stoixeiagamos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.stoixeiagamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.thesiergazomenoitype`
--

DROP TABLE IF EXISTS `ergazomenos.thesiergazomenoitype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.thesiergazomenoitype` (
  `ThesiID` int NOT NULL AUTO_INCREMENT,
  `Onoma` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ThesiID`),
  UNIQUE KEY `ThesiID_UNIQUE` (`ThesiID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.thesiergazomenoitype`
--

LOCK TABLES `ergazomenos.thesiergazomenoitype` WRITE;
/*!40000 ALTER TABLE `ergazomenos.thesiergazomenoitype` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.thesiergazomenoitype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.tilefono`
--

DROP TABLE IF EXISTS `ergazomenos.tilefono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.tilefono` (
  `ErgazomenosID` int NOT NULL,
  `TilefonoType` tinyint NOT NULL,
  `Tilefono` varchar(20) NOT NULL,
  `Ergazomenos.Stoixeia_AFM` int NOT NULL,
  PRIMARY KEY (`ErgazomenosID`,`TilefonoType`,`Ergazomenos.Stoixeia_AFM`),
  UNIQUE KEY `Tilefono_UNIQUE` (`Tilefono`),
  UNIQUE KEY `ErgazomenosID_UNIQUE` (`ErgazomenosID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.tilefono`
--

LOCK TABLES `ergazomenos.tilefono` WRITE;
/*!40000 ALTER TABLE `ergazomenos.tilefono` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.tilefono` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.tilefono_has_ergazomenos.tilefonotype`
--

DROP TABLE IF EXISTS `ergazomenos.tilefono_has_ergazomenos.tilefonotype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.tilefono_has_ergazomenos.tilefonotype` (
  `Ergazomenos.Tilefono_ErgazomenosID` int NOT NULL,
  `Ergazomenos.Tilefono_TilefonoType` tinyint NOT NULL,
  `Ergazomenos.TilefonoType_TilefonoTypeID` tinyint NOT NULL,
  PRIMARY KEY (`Ergazomenos.Tilefono_ErgazomenosID`,`Ergazomenos.Tilefono_TilefonoType`,`Ergazomenos.TilefonoType_TilefonoTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.tilefono_has_ergazomenos.tilefonotype`
--

LOCK TABLES `ergazomenos.tilefono_has_ergazomenos.tilefonotype` WRITE;
/*!40000 ALTER TABLE `ergazomenos.tilefono_has_ergazomenos.tilefonotype` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.tilefono_has_ergazomenos.tilefonotype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.tilefonotype`
--

DROP TABLE IF EXISTS `ergazomenos.tilefonotype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.tilefonotype` (
  `TilefonoTypeID` tinyint NOT NULL AUTO_INCREMENT,
  `Onoma` char(1) NOT NULL,
  PRIMARY KEY (`TilefonoTypeID`),
  UNIQUE KEY `Ergazomenos.TilefonoTypeID_UNIQUE` (`TilefonoTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.tilefonotype`
--

LOCK TABLES `ergazomenos.tilefonotype` WRITE;
/*!40000 ALTER TABLE `ergazomenos.tilefonotype` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.tilefonotype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ergazomenos.tiposmisthoutype`
--

DROP TABLE IF EXISTS `ergazomenos.tiposmisthoutype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ergazomenos.tiposmisthoutype` (
  `Ergazomenos.TiposMisthouTypeID` tinyint NOT NULL AUTO_INCREMENT,
  `Onoma` varchar(45) NOT NULL,
  `Ergazomenoi.Misthos_ErgazomenosID` int NOT NULL,
  `Ergazomenoi.Misthos_ThesiErgazomenouType` tinyint NOT NULL,
  `Ergazomenoi.Misthos_TiposMisthou` tinyint NOT NULL,
  PRIMARY KEY (`Ergazomenos.TiposMisthouTypeID`,`Ergazomenoi.Misthos_ErgazomenosID`,`Ergazomenoi.Misthos_ThesiErgazomenouType`,`Ergazomenoi.Misthos_TiposMisthou`),
  UNIQUE KEY `Ergazomenos.TiposMisthouTypeID_UNIQUE` (`Ergazomenos.TiposMisthouTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ergazomenos.tiposmisthoutype`
--

LOCK TABLES `ergazomenos.tiposmisthoutype` WRITE;
/*!40000 ALTER TABLE `ergazomenos.tiposmisthoutype` DISABLE KEYS */;
/*!40000 ALTER TABLE `ergazomenos.tiposmisthoutype` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-02 20:58:45
