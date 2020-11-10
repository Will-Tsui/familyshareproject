/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : devbase

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 10/11/2020 08:27:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ip_auth
-- ----------------------------
DROP TABLE IF EXISTS `ip_auth`;
CREATE TABLE `ip_auth`  (
  `userid` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户id',
  `pwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ip_auth
-- ----------------------------

-- ----------------------------
-- Table structure for ip_user
-- ----------------------------
DROP TABLE IF EXISTS `ip_user`;
CREATE TABLE `ip_user`  (
  `userid` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户编号',
  `username` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `userlogginname` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ip_user
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
