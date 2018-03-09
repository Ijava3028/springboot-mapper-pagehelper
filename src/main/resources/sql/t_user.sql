-- MySQL dump 10.13  Distrib 5.6.39, for Linux (x86_64)
--
-- Host: localhost    Database: mytest
-- ------------------------------------------------------
-- Server version	5.6.39

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `t_user`
--

INSERT INTO `t_user` VALUES (1,'萧炎','123456','12345678901'),(2,'唐三','123456','12345678901'),(3,'小舞','123456','12345678901'),(4,'马红俊','123456','12345678901'),(5,'萧熏儿','123456','12345678901'),(6,'菜牙','123456','12345678901'),(7,'周杰','123456','12345678901'),(8,'王菲','123456','12345678901'),(9,'叶秋','123456','12345678901');