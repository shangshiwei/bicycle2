/*
Navicat MySQL Data Transfer

Source Server         : work
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : bicycle

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-11-29 16:09:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bicycle_catagory
-- ----------------------------
DROP TABLE IF EXISTS `bicycle_catagory`;
CREATE TABLE `bicycle_catagory` (
  `CATAGORY_ID` int(11) NOT NULL,
  `CATAGORY_NAME` varchar(30) NOT NULL,
  `FRAME_TYPE` varchar(30) DEFAULT NULL,
  `TIRE_TYPE` varchar(30) DEFAULT NULL,
  `WEIGHT` decimal(3,0) DEFAULT NULL,
  `HEIGHT` decimal(3,0) DEFAULT NULL,
  `LENGTH` decimal(3,0) DEFAULT NULL,
  `RING_TYPE` varchar(30) DEFAULT NULL,
  `BASKET` varchar(30) DEFAULT NULL,
  `BACKSEAT` varchar(30) DEFAULT NULL,
  `BICYCLE_SEAT` varchar(30) DEFAULT NULL,
  `HANDBRAKE` varchar(30) DEFAULT NULL,
  `REMARK` varchar(300) DEFAULT NULL,
  `USER_ID` int(11) NOT NULL,
  `OPERATOR_TIME` varchar(32) NOT NULL,
  PRIMARY KEY (`CATAGORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bicycle_catagory
-- ----------------------------
INSERT INTO `bicycle_catagory` VALUES ('1', '小红车', '铝合金', '空心', '20', '1', '2', '手拨铃铛', '有', '无', '自动调节', '有', null, '1', '2019-06-13');
INSERT INTO `bicycle_catagory` VALUES ('2', '电动车', '铁', '充气轮胎', '30', '1', '2', '按压铃铛', '有', '有', null, null, null, '1', '2019-06-13');

-- ----------------------------
-- Table structure for bicycle_deal
-- ----------------------------
DROP TABLE IF EXISTS `bicycle_deal`;
CREATE TABLE `bicycle_deal` (
  `DEAL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CREATE_TIME` varchar(32) NOT NULL,
  `DEAL_NAME` varchar(32) DEFAULT NULL,
  `DEAL_TYPE` int(11) NOT NULL,
  `RECORD_ID` int(11) NOT NULL,
  `CARD_ID` int(11) DEFAULT NULL,
  `IS_FEE` int(11) NOT NULL,
  `CHG_MONEY` decimal(13,2) DEFAULT NULL,
  `FEE_TYPE` int(11) DEFAULT NULL,
  `BICYCLE_ID` int(11) DEFAULT NULL,
  `PILE_ID` int(11) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`DEAL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bicycle_deal
-- ----------------------------
INSERT INTO `bicycle_deal` VALUES ('1', '2019-06-14 09:35:04', '车辆购入', '1', '5', null, '1', '200.00', '2', '4', null, '1');
INSERT INTO `bicycle_deal` VALUES ('2', '2019-06-14 09:41:37', '车辆购入', '1', '7', null, '1', '350.00', '2', '8', null, '1');
INSERT INTO `bicycle_deal` VALUES ('3', '2019-06-14 09:41:37', '车辆购入', '1', '7', null, '1', '350.00', '2', '9', null, '1');
INSERT INTO `bicycle_deal` VALUES ('4', '2019-06-14 09:41:37', '车辆购入', '1', '7', null, '1', '200.00', '2', '10', null, '1');
INSERT INTO `bicycle_deal` VALUES ('5', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '11', null, '1');
INSERT INTO `bicycle_deal` VALUES ('6', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '12', null, '1');
INSERT INTO `bicycle_deal` VALUES ('7', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '13', null, '1');
INSERT INTO `bicycle_deal` VALUES ('8', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '14', null, '1');
INSERT INTO `bicycle_deal` VALUES ('9', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '15', null, '1');
INSERT INTO `bicycle_deal` VALUES ('10', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '16', null, '1');
INSERT INTO `bicycle_deal` VALUES ('11', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '17', null, '1');
INSERT INTO `bicycle_deal` VALUES ('12', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '18', null, '1');
INSERT INTO `bicycle_deal` VALUES ('13', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '19', null, '1');
INSERT INTO `bicycle_deal` VALUES ('14', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '20', null, '1');
INSERT INTO `bicycle_deal` VALUES ('15', '2019-06-14 09:42:52', '车辆购入', '1', '8', null, '1', '210.00', '2', '21', null, '1');
INSERT INTO `bicycle_deal` VALUES ('16', '2019-06-21 16:09:02', '车辆购入', '1', '9', null, '1', '100.00', '2', '22', null, '1');
INSERT INTO `bicycle_deal` VALUES ('17', '2019-06-21 16:09:02', '车辆购入', '1', '9', null, '1', '200.00', '2', '23', null, '1');
INSERT INTO `bicycle_deal` VALUES ('18', '2019-06-21 16:09:02', '车辆购入', '1', '9', null, '1', '200.00', '2', '24', null, '1');
INSERT INTO `bicycle_deal` VALUES ('19', '2019-06-21 16:09:02', '车辆购入', '1', '9', null, '1', '100.00', '2', '25', null, '1');
INSERT INTO `bicycle_deal` VALUES ('20', '2019-06-21 16:09:02', '车辆购入', '1', '9', null, '1', '200.00', '2', '26', null, '1');
INSERT INTO `bicycle_deal` VALUES ('21', '2019-06-25 18:54:19', '车辆购入', '1', '10', null, '1', '100.00', '2', '27', null, '1');
INSERT INTO `bicycle_deal` VALUES ('22', '2019-06-25 18:54:38', '车辆购入', '1', '10', null, '1', '200.00', '2', '28', null, '1');
INSERT INTO `bicycle_deal` VALUES ('23', '2019-06-25 18:54:38', '车辆购入', '1', '10', null, '1', '300.00', '2', '29', null, '1');
INSERT INTO `bicycle_deal` VALUES ('24', '2019-06-25 18:54:38', '车辆购入', '1', '10', null, '1', '200.00', '2', '30', null, '1');
INSERT INTO `bicycle_deal` VALUES ('25', '2019-07-10 09:55:54', '车辆购入', '1', '11', null, '1', '122.00', '2', '31', null, '1');
INSERT INTO `bicycle_deal` VALUES ('26', '2019-07-10 09:55:54', '车辆购入', '1', '11', null, '1', '1212.00', '2', '32', null, '1');
INSERT INTO `bicycle_deal` VALUES ('27', '2019-07-10 09:55:54', '车辆购入', '1', '11', null, '1', '1212.00', '2', '33', null, '1');
INSERT INTO `bicycle_deal` VALUES ('28', '2019-07-10 11:07:25', '车辆购入', '1', '12', null, '1', '200.00', '2', '34', null, '1');
INSERT INTO `bicycle_deal` VALUES ('29', '2019-07-10 11:07:25', '车辆购入', '1', '12', null, '1', '12121.00', '2', '35', null, '1');
INSERT INTO `bicycle_deal` VALUES ('30', '2019-08-12 10:31:00', '车辆购入', '1', '13', null, '1', '100.00', '2', '36', null, '1');
INSERT INTO `bicycle_deal` VALUES ('31', '2019-08-12 10:31:00', '车辆购入', '1', '13', null, '1', '100.00', '2', '37', null, '1');

-- ----------------------------
-- Table structure for bicycle_deploy
-- ----------------------------
DROP TABLE IF EXISTS `bicycle_deploy`;
CREATE TABLE `bicycle_deploy` (
  `DEPLOY_ID` int(11) NOT NULL,
  `BICYCLE_ID` int(11) DEFAULT NULL,
  `FROM_PILE_ID` int(11) DEFAULT NULL,
  `TO_PILE_ID` int(11) DEFAULT NULL,
  `FROM_CARD_ID` int(11) DEFAULT NULL,
  `FROM_TIME` varchar(32) DEFAULT NULL,
  `TO_CARD_ID` int(11) DEFAULT NULL,
  `TO_TIME` varchar(32) DEFAULT NULL,
  `TO_REASON` varchar(128) DEFAULT NULL,
  `FROM_REASON` varchar(128) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  `STATUS` char(1) DEFAULT NULL,
  PRIMARY KEY (`DEPLOY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bicycle_deploy
-- ----------------------------

-- ----------------------------
-- Table structure for bicycle_info
-- ----------------------------
DROP TABLE IF EXISTS `bicycle_info`;
CREATE TABLE `bicycle_info` (
  `BICYCLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `BICYCLE_CODE` varchar(15) NOT NULL,
  `STATUS` int(11) NOT NULL,
  `PILE_ID` int(11) DEFAULT NULL,
  `DESTORY_DATE` varchar(15) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `OPERATOR_TIME` varchar(32) DEFAULT NULL,
  `CARD_ID` int(11) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`BICYCLE_ID`),
  UNIQUE KEY `BICYCLE_CODE` (`BICYCLE_CODE`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bicycle_info
-- ----------------------------
INSERT INTO `bicycle_info` VALUES ('4', '10000000', '1', null, null, '1', '2019-06-14 09:35:04', null, '');
INSERT INTO `bicycle_info` VALUES ('8', '10000001', '1', null, null, '1', '2019-06-14 09:41:37', null, '');
INSERT INTO `bicycle_info` VALUES ('9', '10000002', '1', null, null, '1', '2019-06-14 09:41:37', null, '');
INSERT INTO `bicycle_info` VALUES ('10', '10000003', '1', null, null, '1', '2019-06-14 09:41:37', null, '');
INSERT INTO `bicycle_info` VALUES ('11', '10000004', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('12', '10000005', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('13', '10000006', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('14', '10000007', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('15', '10000008', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('16', '10000009', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('17', '10000010', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('18', '10000011', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('19', '10000012', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('20', '10000013', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('21', '10000014', '1', null, null, '1', '2019-06-14 09:42:52', null, '');
INSERT INTO `bicycle_info` VALUES ('22', '10000015', '1', null, null, '1', '2019-06-21 16:09:02', null, '');
INSERT INTO `bicycle_info` VALUES ('23', '10000016', '1', null, null, '1', '2019-06-21 16:09:02', null, '');
INSERT INTO `bicycle_info` VALUES ('24', '10000017', '1', null, null, '1', '2019-06-21 16:09:02', null, '');
INSERT INTO `bicycle_info` VALUES ('25', '10000018', '1', null, null, '1', '2019-06-21 16:09:02', null, '');
INSERT INTO `bicycle_info` VALUES ('26', '10000019', '1', null, null, '1', '2019-06-21 16:09:02', null, '');
INSERT INTO `bicycle_info` VALUES ('27', '10000020', '1', null, null, '1', '2019-06-25 18:54:02', null, '');
INSERT INTO `bicycle_info` VALUES ('28', '10000021', '1', null, null, '1', '2019-06-25 18:54:27', null, '');
INSERT INTO `bicycle_info` VALUES ('29', '10000022', '1', null, null, '1', '2019-06-25 18:54:38', null, '');
INSERT INTO `bicycle_info` VALUES ('30', '10000023', '1', null, null, '1', '2019-06-25 18:54:38', null, '');
INSERT INTO `bicycle_info` VALUES ('31', '10000024', '1', null, null, '1', '2019-07-10 09:55:53', null, '');
INSERT INTO `bicycle_info` VALUES ('32', '10000025', '1', null, null, '1', '2019-07-10 09:55:54', null, '');
INSERT INTO `bicycle_info` VALUES ('33', '10000026', '1', null, null, '1', '2019-07-10 09:55:54', null, '');
INSERT INTO `bicycle_info` VALUES ('34', '10000027', '1', null, null, '1', '2019-07-10 11:07:25', null, '');
INSERT INTO `bicycle_info` VALUES ('35', '10000028', '1', null, null, '1', '2019-07-10 11:07:25', null, '');
INSERT INTO `bicycle_info` VALUES ('36', '10000029', '1', null, null, '1', '2019-08-12 10:31:00', null, '');
INSERT INTO `bicycle_info` VALUES ('37', '10000030', '1', null, null, '1', '2019-08-12 10:31:00', null, '');

-- ----------------------------
-- Table structure for bicycle_order
-- ----------------------------
DROP TABLE IF EXISTS `bicycle_order`;
CREATE TABLE `bicycle_order` (
  `ORDER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ORDER_CODE` varchar(20) DEFAULT NULL,
  `VENDER_ID` int(11) DEFAULT NULL,
  `BUY_DATE` varchar(32) NOT NULL,
  `BUY_NUM` decimal(5,0) NOT NULL,
  `BUY_PRICE` decimal(10,2) NOT NULL,
  `PERSON_IN_CHARGE` varchar(15) DEFAULT NULL,
  `INVOICE_NO` varchar(20) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `OPERATOR_TIME` varchar(32) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bicycle_order
-- ----------------------------
INSERT INTO `bicycle_order` VALUES ('5', 'GC000001', '1', '2019-05-27', '1', '200.00', '张三', '1212923232323233', '1', null, null);
INSERT INTO `bicycle_order` VALUES ('7', 'GC000002', '1', '2000-09-09', '3', '900.00', '苏明玉', '23123131312313', '1', null, null);
INSERT INTO `bicycle_order` VALUES ('8', 'GC000003', '1', '2019-05-27', '11', '2310.00', '苏大强', '1212121212121212', '1', null, null);
INSERT INTO `bicycle_order` VALUES ('9', 'GC000004', '1', '2019-05-31', '5', '800.00', 'QWQ', '121212', '1', null, '1212');
INSERT INTO `bicycle_order` VALUES ('10', 'GC000006', '1', '2019-05-28', '4', '800.00', '李四', '121212', '1', null, '1212');
INSERT INTO `bicycle_order` VALUES ('11', 'GC0000006', '1', '2019-07-02', '3', '2546.00', '1212', '121212', '1', null, '12121');
INSERT INTO `bicycle_order` VALUES ('12', 'GC000001', '1', '2019-05-27', '2', '12321.00', '张三', '1212923232323233', '1', null, null);
INSERT INTO `bicycle_order` VALUES ('13', 'GC000012', '2', '2019-07-29', '2', '200.00', 'dfd', 'ddew343432', '1', null, 'd');

-- ----------------------------
-- Table structure for bicycle_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `bicycle_order_detail`;
CREATE TABLE `bicycle_order_detail` (
  `DETAIL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CATAGORY_ID` int(11) DEFAULT NULL,
  `ORDER_ID` int(11) DEFAULT NULL,
  `BICYCLE_ID` int(11) NOT NULL,
  `CREATE_DATE` varchar(32) NOT NULL,
  `BATCH_NO` varchar(20) NOT NULL,
  `PRICE` decimal(10,2) NOT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`DETAIL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bicycle_order_detail
-- ----------------------------
INSERT INTO `bicycle_order_detail` VALUES ('2', '1', '5', '4', '2019-06-14 09:35:04', '1001', '200.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('3', '2', '7', '8', '2019-06-14 09:41:37', '201901', '350.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('4', '2', '7', '9', '2019-06-14 09:41:37', '201901', '350.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('5', '1', '7', '10', '2019-06-14 09:41:37', '201902', '200.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('6', '1', '8', '11', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('7', '1', '8', '12', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('8', '1', '8', '13', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('9', '1', '8', '14', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('10', '1', '8', '15', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('11', '1', '8', '16', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('12', '1', '8', '17', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('13', '1', '8', '18', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('14', '1', '8', '19', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('15', '1', '8', '20', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('16', '1', '8', '21', '2019-06-14 09:42:52', '201903', '210.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('17', '1', '9', '22', '2019-06-21 16:09:02', '1001', '100.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('18', '2', '9', '23', '2019-06-21 16:09:02', '1002', '200.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('19', '1', '9', '24', '2019-06-21 16:09:02', '1', '200.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('20', '1', '9', '25', '2019-06-21 16:09:02', '2', '100.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('21', '1', '9', '26', '2019-06-21 16:09:02', '3', '200.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('22', '1', '10', '27', '2019-06-25 18:54:17', '1', '100.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('23', '2', '10', '28', '2019-06-25 18:54:38', '2', '200.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('24', '1', '10', '29', '2019-06-25 18:54:38', '2', '300.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('25', '1', '10', '30', '2019-06-25 18:54:38', '3', '200.00', null);
INSERT INTO `bicycle_order_detail` VALUES ('26', '2', '11', '31', '2019-07-10 09:55:54', '1', '122.00', '121');
INSERT INTO `bicycle_order_detail` VALUES ('27', '1', '11', '32', '2019-07-10 09:55:54', '2', '1212.00', '121');
INSERT INTO `bicycle_order_detail` VALUES ('28', '1', '11', '33', '2019-07-10 09:55:54', '2', '1212.00', '1212');
INSERT INTO `bicycle_order_detail` VALUES ('29', '1', '12', '34', '2019-07-10 11:07:25', '1001', '200.00', '1212');
INSERT INTO `bicycle_order_detail` VALUES ('30', '2', '12', '35', '2019-07-10 11:07:25', '121212', '12121.00', '121');
INSERT INTO `bicycle_order_detail` VALUES ('31', '1', '13', '36', '2019-08-12 10:31:00', '1', '100.00', '1');
INSERT INTO `bicycle_order_detail` VALUES ('32', '1', '13', '37', '2019-08-12 10:31:00', '2', '100.00', '1');

-- ----------------------------
-- Table structure for bicycle_pile
-- ----------------------------
DROP TABLE IF EXISTS `bicycle_pile`;
CREATE TABLE `bicycle_pile` (
  `PILE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STATION_ID` int(11) NOT NULL,
  `VENDER_ID` int(11) NOT NULL,
  `PILE_CODE` varchar(20) NOT NULL,
  `STATUS` int(11) NOT NULL,
  `INSTALL_TIME` varchar(32) NOT NULL,
  `DISASSEMBLY_TIME` varchar(32) DEFAULT NULL,
  `USER_ID` int(11) NOT NULL,
  `OPERATOR_TIME` varchar(32) DEFAULT NULL,
  `BICYCLE_ID` int(11) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PILE_ID`),
  KEY `STATION_ID` (`STATION_ID`),
  CONSTRAINT `bicycle_pile_ibfk_1` FOREIGN KEY (`STATION_ID`) REFERENCES `bicycle_station` (`STATION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bicycle_pile
-- ----------------------------
INSERT INTO `bicycle_pile` VALUES ('9', '6', '1', 'CZ01', '1', '2019-05-29', null, '1', '2019-08-12 10:22:21', null, '');
INSERT INTO `bicycle_pile` VALUES ('11', '6', '1', 'CZ02', '1', '2019-05-31', null, '1', '2019-08-12 10:22:21', null, '');
INSERT INTO `bicycle_pile` VALUES ('12', '7', '1', 'CZ01', '2', '2019-05-30', null, '1', '2019-06-13 14:05:40', null, '');
INSERT INTO `bicycle_pile` VALUES ('13', '7', '1', 'CZ02', '2', '2019-05-30', null, '1', '2019-06-13 14:05:40', null, '');
INSERT INTO `bicycle_pile` VALUES ('14', '7', '1', 'CZ03', '2', '2019-05-30', null, '1', '2019-06-13 14:05:40', null, '');
INSERT INTO `bicycle_pile` VALUES ('15', '7', '1', 'CZ04', '2', '2019-05-30', null, '1', '2019-06-13 14:05:40', null, '');
INSERT INTO `bicycle_pile` VALUES ('16', '7', '1', 'CZ05', '2', '2019-05-30', null, '1', '2019-06-13 14:05:40', null, '');
INSERT INTO `bicycle_pile` VALUES ('17', '7', '1', 'CZ06', '2', '2019-05-30', null, '1', '2019-06-13 14:05:40', null, '');
INSERT INTO `bicycle_pile` VALUES ('18', '8', '1', 'CZ01', '2', '2019-05-28', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('19', '8', '1', 'CZ02', '2', '2019-05-26', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('20', '8', '1', 'CZ03', '2', '2019-04-09', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('21', '8', '1', 'CZ04', '2', '2019-05-14', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('22', '8', '1', 'CZ05', '2', '2019-05-21', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('23', '8', '1', 'CZ06', '2', '2019-05-06', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('24', '8', '1', 'CZ07', '2', '2019-05-07', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('25', '9', '1', 'CZ01', '2', '2019-05-26', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('26', '9', '1', 'CZ02', '2', '2019-04-15', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('27', '9', '1', 'CZ03', '2', '2019-04-15', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('28', '9', '1', 'CZ04', '2', '2019-02-26', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('29', '9', '1', 'CZ05', '2', '2019-03-12', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('30', '9', '1', 'CZ06', '2', '2019-05-01', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('31', '9', '1', 'CZ07', '2', '2019-03-20', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('32', '9', '1', 'CZ08', '2', '2019-02-26', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('33', '9', '1', 'CZ09', '2', '2019-04-15', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('34', '9', '1', 'CZ10', '2', '2019-04-09', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('35', '9', '1', 'CZ11', '2', '2019-05-06', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('36', '9', '1', 'CZ12', '2', '2019-04-17', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('37', '10', '1', 'CZ01', '2', '2019-05-28', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('38', '10', '1', 'CZ02', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('39', '10', '1', 'CZ03', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('40', '10', '1', 'CZ04', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('41', '10', '1', 'CZ05', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('42', '10', '1', 'CZ06', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('43', '10', '1', 'CZ07', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('44', '10', '1', 'CZ08', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('45', '10', '1', 'CZ09', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('46', '10', '1', 'CZ10', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('47', '10', '1', 'CZ11', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('48', '10', '1', 'CZ12', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('49', '10', '1', 'CZ13', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('50', '10', '1', 'CZ14', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('51', '10', '1', 'CZ15', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('52', '11', '1', 'CZ01', '2', '2019-04-10', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('53', '12', '1', 'CZ01', '2', '2019-05-26', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('54', '12', '2', 'CZ02', '2', '2019-05-26', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('55', '12', '3', 'CZ03', '2', '2019-05-26', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('56', '13', '2', 'CZ01', '2', '2019-05-07', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('57', '13', '3', 'CZ02', '2', '2019-04-10', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('58', '13', '1', 'CZ03', '2', '2019-05-09', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('59', '13', '1', 'CZ04', '2', '2019-05-29', null, '1', null, null, '');
INSERT INTO `bicycle_pile` VALUES ('60', '6', '2', 'CZ03', '2', '2019-05-28', null, '1', '2019-08-12 10:22:21', null, '');
INSERT INTO `bicycle_pile` VALUES ('61', '6', '1', 'CZ04', '2', '2019-08-05', null, '1', '2019-08-12 10:22:21', null, '');
INSERT INTO `bicycle_pile` VALUES ('62', '6', '1', 'CZ05', '2', '2019-08-07', null, '1', '2019-08-12 10:22:21', null, '');

-- ----------------------------
-- Table structure for bicycle_record
-- ----------------------------
DROP TABLE IF EXISTS `bicycle_record`;
CREATE TABLE `bicycle_record` (
  `RECORD_ID` int(11) NOT NULL AUTO_INCREMENT,
  `BICYCLE_ID` int(11) NOT NULL,
  `CARD_ID` int(11) NOT NULL,
  `RENT_TIME` varchar(32) NOT NULL,
  `RENT_PILE_ID` int(11) NOT NULL,
  `RETURN_TIME` varchar(32) DEFAULT NULL,
  `RETURN_PILE_ID` int(11) DEFAULT NULL,
  `MONEY` decimal(13,2) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`RECORD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bicycle_record
-- ----------------------------

-- ----------------------------
-- Table structure for bicycle_station
-- ----------------------------
DROP TABLE IF EXISTS `bicycle_station`;
CREATE TABLE `bicycle_station` (
  `STATION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STATION_CODE` varchar(20) NOT NULL,
  `STATION_NAME` varchar(50) NOT NULL,
  `LONGITUDE` decimal(10,6) NOT NULL,
  `LATITUDE` decimal(10,6) NOT NULL,
  `BICYCLE_PILE_NUM` decimal(2,0) NOT NULL,
  `ADDRESS` varchar(100) NOT NULL,
  `PERSON_IN_CHARGE` varchar(15) DEFAULT NULL,
  `BUILD_TIME` varchar(32) NOT NULL,
  `RUN_TIME` varchar(32) NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `CREATE_TIME` varchar(32) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`STATION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bicycle_station
-- ----------------------------
INSERT INTO `bicycle_station` VALUES ('6', 'CD00000001', '西湖区龙井路2号租车点', '120.129933', '30.252236', '5', '浙江省杭州市西湖区龙井路2号', '张三', '2019-05-26', '2019-06-01', '1', '2019-08-12 10:22:21', '第一个租车点');
INSERT INTO `bicycle_station` VALUES ('7', 'CD00000002', '杭州公共自行车8009杭州动物园租赁点', '120.142532', '30.221011', '6', '浙江省杭州市西湖区虎跑路37号', '李四', '2019-05-01', '2019-06-01', '1', '2019-06-13 14:05:40', '第二个租车点');
INSERT INTO `bicycle_station` VALUES ('8', 'CD00000003', '灵隐中心站自行车租赁点', '120.114508', '30.248177', '7', '浙江省杭州市西湖区西湖风景名胜区灵隐景区', '王五', '2019-02-05', '2019-06-05', '1', '2019-06-11 17:08:23', null);
INSERT INTO `bicycle_station` VALUES ('9', 'CD00000004', '和平家私城自行车租赁点', '120.183644', '30.295155', '12', '浙江省杭州市下城区东新路世纪联华和平购物城南', '张三', '2019-01-07', '2019-03-14', '1', '2019-06-11 17:11:09', null);
INSERT INTO `bicycle_station` VALUES ('10', 'CD00000005', '8012苏堤南口租车点', '120.151034', '30.235033', '15', '浙江省杭州市西湖区南山路2号', '张三', '2019-05-26', '2019-05-28', '1', '2019-06-11 17:20:02', null);
INSERT INTO `bicycle_station` VALUES ('11', 'CD00000006', '省妇保西门自行车租赁点', '120.174739', '30.263142', '1', '浙江省杭州市上城区浙江大学医学院附属妇产科医院', '张三', '2019-04-02', '2019-04-28', '1', '2019-06-12 10:59:43', null);
INSERT INTO `bicycle_station` VALUES ('12', 'CD00000007', '永华街八十一号自行车租赁点', '120.205805', '30.351324', '3', '浙江省杭州市下城区永华街81号', '张大强', '2019-04-04', '2019-05-29', '1', '2019-06-12 12:01:47', null);
INSERT INTO `bicycle_station` VALUES ('13', 'CD00000008', '西湖区西园路3号', '120.071111', '30.327135', '4', '西湖区西园路3号', '王五', '2019-02-02', '2019-05-30', '1', '2019-06-13 12:58:41', null);

-- ----------------------------
-- Table structure for card
-- ----------------------------
DROP TABLE IF EXISTS `card`;
CREATE TABLE `card` (
  `CARD_ID` int(11) NOT NULL,
  `CARD_CODE` varchar(15) DEFAULT NULL,
  `CARD_TYPE` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `IDCARD` varchar(18) NOT NULL,
  `SEX` char(1) NOT NULL,
  `TELPHONE` varchar(20) DEFAULT NULL,
  `MOBILE` varchar(15) NOT NULL,
  `EMAIL` varchar(30) NOT NULL,
  `ADDRESS` varchar(100) DEFAULT NULL,
  `WORK` varchar(100) DEFAULT NULL,
  `ZXBJ` char(1) DEFAULT NULL,
  `MONTHLY_MONEY` decimal(13,2) DEFAULT NULL,
  `FROZEN_MONEY` decimal(13,2) DEFAULT NULL,
  `WALLET_MONEY` decimal(13,2) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`CARD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of card
-- ----------------------------

-- ----------------------------
-- Table structure for card_info_record
-- ----------------------------
DROP TABLE IF EXISTS `card_info_record`;
CREATE TABLE `card_info_record` (
  `RECORD_ID` int(11) NOT NULL,
  `CARD_ID` int(11) NOT NULL,
  `INFO_TYPE` decimal(1,0) NOT NULL,
  `CREATE_TIME` varchar(32) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`RECORD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of card_info_record
-- ----------------------------

-- ----------------------------
-- Table structure for card_record
-- ----------------------------
DROP TABLE IF EXISTS `card_record`;
CREATE TABLE `card_record` (
  `RECORD_ID` int(11) NOT NULL,
  `CARD_ID` int(11) NOT NULL,
  `FEE_TYPE` int(11) NOT NULL,
  `CHG_MONTHLY_MONEY` decimal(13,2) DEFAULT NULL,
  `CHG_WALLET_MONEY` decimal(13,2) DEFAULT NULL,
  `CHG_FROZEN_MONEY` decimal(13,2) DEFAULT NULL,
  `CREATE_TIME` varchar(32) NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  `ZXBJ` int(11) DEFAULT NULL,
  PRIMARY KEY (`RECORD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of card_record
-- ----------------------------

-- ----------------------------
-- Table structure for msphase
-- ----------------------------
DROP TABLE IF EXISTS `msphase`;
CREATE TABLE `msphase` (
  `PHASEID` int(11) NOT NULL AUTO_INCREMENT,
  `URL` varchar(200) DEFAULT NULL,
  `DESCRIPTION` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`PHASEID`),
  UNIQUE KEY `URL` (`URL`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msphase
-- ----------------------------
INSERT INTO `msphase` VALUES ('1', '/msphase', '权限管理');
INSERT INTO `msphase` VALUES ('2', '/role', '角色管理');
INSERT INTO `msphase` VALUES ('3', '/syuser', '人员管理');
INSERT INTO `msphase` VALUES ('4', '/vender', '供应商管理');
INSERT INTO `msphase` VALUES ('5', '/card', '办卡');
INSERT INTO `msphase` VALUES ('6', '/charge', '充值');
INSERT INTO `msphase` VALUES ('7', '/station', '车辆车桩管理');
INSERT INTO `msphase` VALUES ('8', '/bicycletype', '车辆类型管理');
INSERT INTO `msphase` VALUES ('9', '/buy', '车辆购入登记');
INSERT INTO `msphase` VALUES ('10', '/instation', '新车入桩登记');
INSERT INTO `msphase` VALUES ('11', '/repaire', '维修登记');
INSERT INTO `msphase` VALUES ('13', '/user', '随便写');
INSERT INTO `msphase` VALUES ('14', '/abc', '中文权限');
INSERT INTO `msphase` VALUES ('15', '/url', '权限');
INSERT INTO `msphase` VALUES ('16', '/dsf', '你好');
INSERT INTO `msphase` VALUES ('22', '/fail', '新增权限');

-- ----------------------------
-- Table structure for repair_record
-- ----------------------------
DROP TABLE IF EXISTS `repair_record`;
CREATE TABLE `repair_record` (
  `RECORD_ID` int(11) NOT NULL,
  `BICYCLE_ID` int(11) NOT NULL,
  `REPAIR_TYPE` char(1) NOT NULL,
  `REPAIR_PART` varchar(100) DEFAULT NULL,
  `REPAIR_RESULT` char(1) NOT NULL,
  `FEE` decimal(7,3) DEFAULT NULL,
  `REPAIRER` varchar(15) NOT NULL,
  `REPAIR_DATE` varchar(15) NOT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `OPERATOR_TIME` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`RECORD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repair_record
-- ----------------------------

-- ----------------------------
-- Table structure for sypermission
-- ----------------------------
DROP TABLE IF EXISTS `sypermission`;
CREATE TABLE `sypermission` (
  `PERMISSIONID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLEID` int(11) NOT NULL,
  `PHASEID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`PERMISSIONID`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sypermission
-- ----------------------------
INSERT INTO `sypermission` VALUES ('4', '5', '7');
INSERT INTO `sypermission` VALUES ('5', '5', '4');
INSERT INTO `sypermission` VALUES ('6', '6', '7');
INSERT INTO `sypermission` VALUES ('7', '6', '10');
INSERT INTO `sypermission` VALUES ('8', '7', '1');
INSERT INTO `sypermission` VALUES ('9', '7', '3');
INSERT INTO `sypermission` VALUES ('10', '7', '4');
INSERT INTO `sypermission` VALUES ('11', '7', '5');
INSERT INTO `sypermission` VALUES ('12', '7', '6');
INSERT INTO `sypermission` VALUES ('13', '7', '7');
INSERT INTO `sypermission` VALUES ('14', '7', '12');
INSERT INTO `sypermission` VALUES ('15', '7', '11');
INSERT INTO `sypermission` VALUES ('16', '7', '10');
INSERT INTO `sypermission` VALUES ('17', '7', '9');
INSERT INTO `sypermission` VALUES ('18', '7', '8');
INSERT INTO `sypermission` VALUES ('28', '8', '1');
INSERT INTO `sypermission` VALUES ('29', '8', '3');
INSERT INTO `sypermission` VALUES ('30', '8', '9');
INSERT INTO `sypermission` VALUES ('31', '8', '10');
INSERT INTO `sypermission` VALUES ('33', '1', '1');
INSERT INTO `sypermission` VALUES ('34', '1', '3');
INSERT INTO `sypermission` VALUES ('35', '1', '4');
INSERT INTO `sypermission` VALUES ('36', '1', '10');
INSERT INTO `sypermission` VALUES ('37', '9', '1');
INSERT INTO `sypermission` VALUES ('38', '9', '3');
INSERT INTO `sypermission` VALUES ('39', '9', '10');
INSERT INTO `sypermission` VALUES ('40', '9', '4');
INSERT INTO `sypermission` VALUES ('41', '9', '9');
INSERT INTO `sypermission` VALUES ('42', '10', '1');
INSERT INTO `sypermission` VALUES ('43', '10', '3');
INSERT INTO `sypermission` VALUES ('44', '10', '4');
INSERT INTO `sypermission` VALUES ('45', '10', '10');
INSERT INTO `sypermission` VALUES ('46', '10', '11');
INSERT INTO `sypermission` VALUES ('52', '11', '1');
INSERT INTO `sypermission` VALUES ('53', '11', '3');
INSERT INTO `sypermission` VALUES ('54', '11', '4');
INSERT INTO `sypermission` VALUES ('55', '11', '5');
INSERT INTO `sypermission` VALUES ('56', '11', '6');
INSERT INTO `sypermission` VALUES ('57', '11', '10');
INSERT INTO `sypermission` VALUES ('58', '11', '11');
INSERT INTO `sypermission` VALUES ('59', '7', '2');

-- ----------------------------
-- Table structure for syrole
-- ----------------------------
DROP TABLE IF EXISTS `syrole`;
CREATE TABLE `syrole` (
  `ROLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(50) NOT NULL,
  `ROLE_DESCRIBE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of syrole
-- ----------------------------
INSERT INTO `syrole` VALUES ('1', '办卡人员', '负责办卡挂失注销充值等功能');
INSERT INTO `syrole` VALUES ('5', '车点维护人员', '车点车桩新增修改删除等操作');
INSERT INTO `syrole` VALUES ('6', '车点管理员', '管理车点车桩登记');
INSERT INTO `syrole` VALUES ('7', '超级管理员', '超级管理员');
INSERT INTO `syrole` VALUES ('8', '角色信', '角色描述');
INSERT INTO `syrole` VALUES ('9', '测试呢', '测试大幅度');
INSERT INTO `syrole` VALUES ('10', '测试角色', '测试角色');
INSERT INTO `syrole` VALUES ('11', '角色', '描述');

-- ----------------------------
-- Table structure for syuser
-- ----------------------------
DROP TABLE IF EXISTS `syuser`;
CREATE TABLE `syuser` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_ID` int(11) DEFAULT NULL,
  `LOGINNAME` varchar(255) NOT NULL,
  `USERNAME` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `ACTIVE_FLAG` decimal(1,0) NOT NULL COMMENT '1:激活\r\n            2：禁用',
  `ZXBJ` char(1) NOT NULL COMMENT '1:未删除\r\n            2：删除',
  `OFFICE_PHONE` varchar(20) DEFAULT NULL,
  `MOBILE_PHONE` varchar(15) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `LOGIN_NAME` (`LOGINNAME`) USING BTREE,
  KEY `ROLE_ID` (`ROLE_ID`),
  CONSTRAINT `syuser_ibfk_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `syrole` (`ROLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of syuser
-- ----------------------------
INSERT INTO `syuser` VALUES ('1', '7', 'lisi', '李四', 'e10adc3949ba59abbe56e057f20f883e', '1', '1', '', '13472286379', null);

-- ----------------------------
-- Table structure for vender
-- ----------------------------
DROP TABLE IF EXISTS `vender`;
CREATE TABLE `vender` (
  `VENDER_ID` int(11) NOT NULL,
  `VENDER_CODE` varchar(10) NOT NULL,
  `VENDER_TYPE` char(1) DEFAULT NULL,
  `VENDER_NAME` varchar(200) NOT NULL,
  `ADDRESS` varchar(200) NOT NULL,
  `TELPHONE` varchar(20) NOT NULL,
  `CONTACTS` varchar(20) NOT NULL,
  `PRODUCT_LICENSE` varchar(20) NOT NULL,
  `BUSSINESS_REGISTRATION_NO` varchar(20) NOT NULL,
  `REGISTERED_CAPITAL` decimal(12,2) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `CREATE_TIME` varchar(32) DEFAULT NULL,
  `ZXBJ` char(1) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`VENDER_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vender
-- ----------------------------
INSERT INTO `vender` VALUES ('1', '1001', '1', '飞鸽车业制造有限公司', '天津', '12121212', '1', '1212', '1212', null, null, null, null, null);
INSERT INTO `vender` VALUES ('2', '1002', '2', '11', '1', '1', '1', '1', '1', null, null, null, null, null);
INSERT INTO `vender` VALUES ('3', '1003', '1', '2', '1', '1', '1', '1', '1', null, null, null, null, null);

-- ----------------------------
-- View structure for order_detail_view
-- ----------------------------
DROP VIEW IF EXISTS `order_detail_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `order_detail_view` AS select `bo`.`ORDER_CODE` AS `order_code`,`bo`.`BUY_DATE` AS `buy_date`,`bod`.`BICYCLE_ID` AS `bicycle_id`,`bod`.`PRICE` AS `price` from (`bicycle_order` `bo` join `bicycle_order_detail` `bod`) where (`bo`.`ORDER_ID` = `bod`.`ORDER_ID`) ;
