-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.52-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema bhaghya
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ bhaghya;
USE bhaghya;

--
-- Table structure for table `bhaghya`.`acc_project`
--

DROP TABLE IF EXISTS `acc_project`;
CREATE TABLE `acc_project` (
  `apid` int(11) NOT NULL AUTO_INCREMENT,
  `aid` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`apid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`acc_project`
--

/*!40000 ALTER TABLE `acc_project` DISABLE KEYS */;
/*!40000 ALTER TABLE `acc_project` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`accounts`
--

DROP TABLE IF EXISTS `accounts`;
CREATE TABLE `accounts` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `vou_no` varchar(20) DEFAULT NULL,
  `adate` date DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `vou_type` varchar(20) DEFAULT NULL,
  `st` varchar(5) DEFAULT NULL,
  `category` varchar(50) DEFAULT 'Other',
  `toperson` int(11) DEFAULT '0',
  `project` int(11) DEFAULT '0',
  `paytype` varchar(50) DEFAULT 'Cash',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`accounts`
--

/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` (`aid`,`vou_no`,`adate`,`description`,`amount`,`vou_type`,`st`,`category`,`toperson`,`project`,`paytype`) VALUES 
 (1,'V01','2018-05-01','sds',100,'C','A','Other',NULL,NULL,'cash'),
 (2,'V01','2018-05-01','xaxa',100,'D','A','Other',2,1,'cheque'),
 (3,'V02','2018-05-01','xzxz',50000,'D','A','Salary',2,1,'credit'),
 (4,'V03','2018-06-20','xzxz',22000,'D','A','Salary',2,1,'cash'),
 (5,'V01','2018-05-01','sds',1000,'C','A','Other',0,0,'cash'),
 (7,'V01','2018-05-01','sds',1000,'C','A','Other',0,0,'credit'),
 (8,'V01','2018-05-01','sds',1000,'C','D','Other',0,0,'cash'),
 (9,'V01','2018-05-01','sds',1000,'C','A','Other',0,0,'cheque');
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `idlogin` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `isactive` int(11) DEFAULT NULL,
  `usertype` int(11) DEFAULT NULL,
  `user_iduser` int(11) NOT NULL,
  PRIMARY KEY (`idlogin`),
  UNIQUE KEY `iduser_UNIQUE` (`username`),
  KEY `fk_login_user1` (`user_iduser`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`idlogin`,`username`,`password`,`isactive`,`usertype`,`user_iduser`) VALUES 
 (1,'s','123',1,1,1),
 (2,'demo','demo',1,2,2);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`map_boq_item`
--

DROP TABLE IF EXISTS `map_boq_item`;
CREATE TABLE `map_boq_item` (
  `mbiid` int(11) NOT NULL AUTO_INCREMENT,
  `bid` int(11) DEFAULT NULL,
  `iid` int(11) DEFAULT NULL,
  `st` varchar(5) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`mbiid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`map_boq_item`
--

/*!40000 ALTER TABLE `map_boq_item` DISABLE KEYS */;
INSERT INTO `map_boq_item` (`mbiid`,`bid`,`iid`,`st`,`qty`) VALUES 
 (1,5,2,'D',100),
 (2,5,1,'A',500),
 (5,5,3,'A',100),
 (6,5,2,'A',265),
 (7,7,1,'A',10),
 (8,10,2,'A',10),
 (9,11,3,'A',10),
 (10,13,1,'A',12),
 (11,14,1,'A',10),
 (12,15,1,'A',12),
 (13,15,3,'A',25),
 (14,15,2,'A',26),
 (15,15,4,'A',27);
/*!40000 ALTER TABLE `map_boq_item` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`map_proj_client`
--

DROP TABLE IF EXISTS `map_proj_client`;
CREATE TABLE `map_proj_client` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `st` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`map_proj_client`
--

/*!40000 ALTER TABLE `map_proj_client` DISABLE KEYS */;
INSERT INTO `map_proj_client` (`mid`,`pid`,`cid`,`st`) VALUES 
 (1,1,1,'A'),
 (3,1,2,'A');
/*!40000 ALTER TABLE `map_proj_client` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`map_proj_supplier`
--

DROP TABLE IF EXISTS `map_proj_supplier`;
CREATE TABLE `map_proj_supplier` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `sid` int(11) DEFAULT NULL,
  `st` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`map_proj_supplier`
--

/*!40000 ALTER TABLE `map_proj_supplier` DISABLE KEYS */;
INSERT INTO `map_proj_supplier` (`mid`,`pid`,`sid`,`st`) VALUES 
 (1,1,1,'A'),
 (3,1,2,'A');
/*!40000 ALTER TABLE `map_proj_supplier` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`map_proj_tool`
--

DROP TABLE IF EXISTS `map_proj_tool`;
CREATE TABLE `map_proj_tool` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `tid` int(11) DEFAULT NULL,
  `st` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`map_proj_tool`
--

/*!40000 ALTER TABLE `map_proj_tool` DISABLE KEYS */;
INSERT INTO `map_proj_tool` (`mid`,`pid`,`tid`,`st`) VALUES 
 (1,1,1,'A'),
 (3,1,3,'A');
/*!40000 ALTER TABLE `map_proj_tool` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`map_proj_vehicle`
--

DROP TABLE IF EXISTS `map_proj_vehicle`;
CREATE TABLE `map_proj_vehicle` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `vid` int(11) DEFAULT NULL,
  `st` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`map_proj_vehicle`
--

/*!40000 ALTER TABLE `map_proj_vehicle` DISABLE KEYS */;
/*!40000 ALTER TABLE `map_proj_vehicle` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`map_store_item`
--

DROP TABLE IF EXISTS `map_store_item`;
CREATE TABLE `map_store_item` (
  `msiid` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) DEFAULT NULL,
  `iid` int(11) DEFAULT NULL,
  `qty` double DEFAULT NULL,
  `st` varchar(2) DEFAULT 'A',
  PRIMARY KEY (`msiid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`map_store_item`
--

/*!40000 ALTER TABLE `map_store_item` DISABLE KEYS */;
INSERT INTO `map_store_item` (`msiid`,`sid`,`iid`,`qty`,`st`) VALUES 
 (6,11,2,10,'A'),
 (7,11,4,10,'A'),
 (9,10,2,150,'A'),
 (10,11,1,50,'A');
/*!40000 ALTER TABLE `map_store_item` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`mapproj_employee`
--

DROP TABLE IF EXISTS `mapproj_employee`;
CREATE TABLE `mapproj_employee` (
  `peid` int(11) NOT NULL AUTO_INCREMENT,
  `projectid` int(11) DEFAULT NULL,
  `employeeid` int(11) DEFAULT NULL,
  `st` varchar(2) DEFAULT 'A',
  PRIMARY KEY (`peid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`mapproj_employee`
--

/*!40000 ALTER TABLE `mapproj_employee` DISABLE KEYS */;
INSERT INTO `mapproj_employee` (`peid`,`projectid`,`employeeid`,`st`) VALUES 
 (9,1,2,'A'),
 (12,1,5,'A'),
 (13,1,7,'A');
/*!40000 ALTER TABLE `mapproj_employee` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_activity`
--

DROP TABLE IF EXISTS `reg_activity`;
CREATE TABLE `reg_activity` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `comment` varchar(200) DEFAULT NULL,
  `st` varchar(2) DEFAULT 'A',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_activity`
--

/*!40000 ALTER TABLE `reg_activity` DISABLE KEYS */;
INSERT INTO `reg_activity` (`aid`,`name`,`date`,`comment`,`st`) VALUES 
 (1,'Test','2018-05-30','test description','D'),
 (2,'Test 2','2018-05-10','Homagama Project','A');
/*!40000 ALTER TABLE `reg_activity` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_boq`
--

DROP TABLE IF EXISTS `reg_boq`;
CREATE TABLE `reg_boq` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `st` varchar(5) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_boq`
--

/*!40000 ALTER TABLE `reg_boq` DISABLE KEYS */;
INSERT INTO `reg_boq` (`bid`,`st`,`name`) VALUES 
 (4,'A','TestBOQ'),
 (5,'A','Test'),
 (6,'A',''),
 (7,'D',''),
 (8,'A',''),
 (9,'A',''),
 (10,'A','Boq test 2'),
 (11,'A','test 3'),
 (12,'A','test 4'),
 (13,'A','test 5'),
 (14,'A','test 6'),
 (15,'A','test 7');
/*!40000 ALTER TABLE `reg_boq` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_client`
--

DROP TABLE IF EXISTS `reg_client`;
CREATE TABLE `reg_client` (
  `clid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `dob` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `cli_type` varchar(100) DEFAULT NULL,
  `contactno` varchar(20) DEFAULT NULL,
  `st` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`clid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_client`
--

/*!40000 ALTER TABLE `reg_client` DISABLE KEYS */;
INSERT INTO `reg_client` (`clid`,`name`,`address`,`email`,`sex`,`dob`,`cli_type`,`contactno`,`st`) VALUES 
 (1,'Test Client','Address ','mail@gmail.com','F','2018-05-12 12:23:09','Adz Worker','0112123123','A'),
 (2,'Test Client2','Address test','email2@mail.com','M','1993-12-26 00:00:00','Air Breaker Operator','+94-XXXXXXXXXX','A');
/*!40000 ALTER TABLE `reg_client` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_employee`
--

DROP TABLE IF EXISTS `reg_employee`;
CREATE TABLE `reg_employee` (
  `empid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `dob` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `emp_type` varchar(100) DEFAULT NULL,
  `contactno` varchar(20) DEFAULT NULL,
  `st` varchar(2) DEFAULT NULL,
  `salary` double DEFAULT '0',
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_employee`
--

/*!40000 ALTER TABLE `reg_employee` DISABLE KEYS */;
INSERT INTO `reg_employee` (`empid`,`name`,`address`,`email`,`sex`,`dob`,`emp_type`,`contactno`,`st`,`salary`) VALUES 
 (1,'name','XXX','live@mail.com','M','2018-05-06 09:20:31','Adz Worker','+94-12345678','D',0),
 (2,'menaka','XXXx','live@mail.com','M','2017-12-31 00:00:00','Air Breaker Operator','+94-12345678','A',10000),
 (3,'A','B','C','M','2018-05-06 09:08:21','Aluminum Pool Installer','VVVVVVV','D',0),
 (4,'uuuuuuuuuu','uuu','uu','M','2018-05-05 13:00:28','Aluminum Pool Installer','u','D',0),
 (5,'sujatha','navinna','liv','F','2017-12-31 00:00:00','Air Gun Operator','+9','A',0),
 (6,'yyt','Addressty','ty','M','2018-05-06 09:08:18','Adz Worker','+94-XXXXXXXXXX','D',0),
 (7,'viraj','anuradapura','live@mail.com','M','2018-05-09 22:51:05','Adz Worker','+94-12345678','A',0);
/*!40000 ALTER TABLE `reg_employee` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_item`
--

DROP TABLE IF EXISTS `reg_item`;
CREATE TABLE `reg_item` (
  `iid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `itype` varchar(45) NOT NULL DEFAULT '',
  `igroup` varchar(45) NOT NULL DEFAULT '',
  `icode` varchar(45) NOT NULL DEFAULT '',
  `iname` varchar(45) NOT NULL DEFAULT '',
  `iuoh` varchar(45) NOT NULL DEFAULT '',
  `ireoq` varchar(45) NOT NULL DEFAULT '',
  `idesc` varchar(45) NOT NULL DEFAULT '',
  `iqonhand` varchar(45) NOT NULL DEFAULT '',
  `icost` varchar(45) NOT NULL DEFAULT '',
  `idep` varchar(45) NOT NULL DEFAULT '',
  `idate` varchar(45) NOT NULL DEFAULT '',
  `st` varchar(5) NOT NULL DEFAULT '',
  PRIMARY KEY (`iid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_item`
--

/*!40000 ALTER TABLE `reg_item` DISABLE KEYS */;
INSERT INTO `reg_item` (`iid`,`itype`,`igroup`,`icode`,`iname`,`iuoh`,`ireoq`,`idesc`,`iqonhand`,`icost`,`idep`,`idate`,`st`) VALUES 
 (1,'type','group','code','name','unit','reorder qty','desc','on hand','100','dep','2018-05-06','A'),
 (2,'work in progress','Anti Cutter','eeeeee','eeeeeeee','Kg','eeeeeeee','eeeeeeeeee','eeeeeeee','100','work in progress','2018-05-03','A'),
 (3,'work in progress','Anti Cutter','eeeeee','eeeeeeee','Kg','eeeeeeee','eeeeeeeeee','eeeeeeee','100','tttttttt','2018-05-03','A'),
 (4,'row','','I01','Test Item','Kg','10','Test Description','10000','250','Test Store','2018-05-21','A');
/*!40000 ALTER TABLE `reg_item` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_projects`
--

DROP TABLE IF EXISTS `reg_projects`;
CREATE TABLE `reg_projects` (
  `proid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `noofemp` int(11) DEFAULT NULL,
  `noofveh` int(11) DEFAULT NULL,
  `noofofficers` int(11) DEFAULT NULL,
  `storeid` int(11) DEFAULT NULL,
  `value` double DEFAULT '0',
  `st` varchar(5) DEFAULT 'A',
  PRIMARY KEY (`proid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_projects`
--

/*!40000 ALTER TABLE `reg_projects` DISABLE KEYS */;
INSERT INTO `reg_projects` (`proid`,`name`,`location`,`type`,`noofemp`,`noofveh`,`noofofficers`,`storeid`,`value`,`st`) VALUES 
 (1,'ds','sda','Item 2',1,1,1,10,10,'A');
/*!40000 ALTER TABLE `reg_projects` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_stores`
--

DROP TABLE IF EXISTS `reg_stores`;
CREATE TABLE `reg_stores` (
  `stores_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `dor` datetime DEFAULT NULL,
  `stores_type` varchar(50) DEFAULT NULL,
  `contactno` varchar(20) DEFAULT NULL,
  `ofz_incharge` varchar(100) DEFAULT NULL,
  `st` varchar(5) NOT NULL DEFAULT '',
  PRIMARY KEY (`stores_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_stores`
--

/*!40000 ALTER TABLE `reg_stores` DISABLE KEYS */;
INSERT INTO `reg_stores` (`stores_id`,`name`,`address`,`dor`,`stores_type`,`contactno`,`ofz_incharge`,`st`) VALUES 
 (10,'tttttttt','tttttttt','2018-05-04 00:00:00','Adz Worker','tttttttt','ttttt','A'),
 (11,'Test Store','Address','2018-05-01 00:00:00','Adz Worker','+94-XXXXXXXXXX','Name','A');
/*!40000 ALTER TABLE `reg_stores` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_sup`
--

DROP TABLE IF EXISTS `reg_sup`;
CREATE TABLE `reg_sup` (
  `supid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL DEFAULT '',
  `nic` varchar(45) NOT NULL DEFAULT '',
  `address` varchar(45) NOT NULL DEFAULT '',
  `email` varchar(45) NOT NULL DEFAULT '',
  `sex` varchar(45) NOT NULL DEFAULT '',
  `dob` varchar(45) NOT NULL DEFAULT '',
  `contactno` varchar(45) NOT NULL DEFAULT '',
  `bank` varchar(45) NOT NULL DEFAULT '',
  `branch` varchar(45) NOT NULL DEFAULT '',
  `acountno` varchar(45) NOT NULL DEFAULT '',
  `st` varchar(5) NOT NULL DEFAULT '',
  `sup_type` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`supid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_sup`
--

/*!40000 ALTER TABLE `reg_sup` DISABLE KEYS */;
INSERT INTO `reg_sup` (`supid`,`name`,`nic`,`address`,`email`,`sex`,`dob`,`contactno`,`bank`,`branch`,`acountno`,`st`,`sup_type`) VALUES 
 (1,'ll','777','777','77','null','2018-05-06','2020','2020','2020','2020','A','Whole-Sale'),
 (2,'llUUUUUUUUU','777','777','77','null','2018-05-06','2020','2020','2020','2020','A','Whole-Sale');
/*!40000 ALTER TABLE `reg_sup` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_tool`
--

DROP TABLE IF EXISTS `reg_tool`;
CREATE TABLE `reg_tool` (
  `tid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `store_incharge` varchar(200) DEFAULT NULL,
  `tlno` varchar(50) DEFAULT NULL,
  `dob` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tool_type` varchar(100) DEFAULT NULL,
  `contactno` varchar(20) DEFAULT NULL,
  `st` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_tool`
--

/*!40000 ALTER TABLE `reg_tool` DISABLE KEYS */;
INSERT INTO `reg_tool` (`tid`,`name`,`address`,`store_incharge`,`tlno`,`dob`,`tool_type`,`contactno`,`st`) VALUES 
 (1,'multy meter','fffd','fdf','dfd','2018-05-06 00:00:00','455','55','A'),
 (2,'multy plug','fffd','fdf','dfd','2018-05-06 13:01:47','Whole-Sale','55','D'),
 (3,'multy meter','fffd','fdf','dfd','2018-05-06 00:00:00','Whole-Sale','55','A');
/*!40000 ALTER TABLE `reg_tool` ENABLE KEYS */;


--
-- Table structure for table `bhaghya`.`reg_vehicle`
--

DROP TABLE IF EXISTS `reg_vehicle`;
CREATE TABLE `reg_vehicle` (
  `vid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `licence` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `dname` varchar(50) DEFAULT NULL,
  `dlnum` varchar(50) DEFAULT NULL,
  `dob` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `vehicle_type` varchar(100) DEFAULT NULL,
  `contactno` varchar(20) DEFAULT NULL,
  `st` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bhaghya`.`reg_vehicle`
--

/*!40000 ALTER TABLE `reg_vehicle` DISABLE KEYS */;
INSERT INTO `reg_vehicle` (`vid`,`name`,`licence`,`address`,`dname`,`dlnum`,`dob`,`vehicle_type`,`contactno`,`st`) VALUES 
 (1,'mmm','mm','mmm','mmm','mmm','2018-05-06 12:24:50','kkk','kk','A'),
 (2,'mmm','mm','mmm','mmm','mmm','2018-05-06 12:35:15','Whole-Sale','kk','D'),
 (3,'mmm','mm','mmm','mmm','mmm','2018-05-06 12:35:17','Whole-Sale','kk','D'),
 (4,'car van','15-5252','45','mmm','mmm','2018-05-06 00:00:00','Whole-Sale','kk','A');
/*!40000 ALTER TABLE `reg_vehicle` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
