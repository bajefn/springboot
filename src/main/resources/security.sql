-- 创建用户表sys_user：
DROP TABLE IF EXISTS sys_user;
CREATE TABLE `sys_user` (
`id` INT(11) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255) NOT NULL,
`password` VARCHAR(255) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
-- 创建权限表sys_role：\
DROP TABLE IF EXISTS sys_role;
CREATE TABLE `sys_role` (
`id` INT(11) NOT NULL,
`name` VARCHAR(255) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
-- 创建用户-角色表sys_user_role：
DROP TABLE IF EXISTS  sys_user_role;
CREATE TABLE `sys_user_role` (
`user_id` INT(11) NOT NULL,
`role_id` INT(11) NOT NULL,
PRIMARY KEY (`user_id`,`role_id`),
KEY `fk_role_id` (`role_id`),
CONSTRAINT `fk_role_id` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB DEFAULT CHARSET=utf8;
-- 初始化一下数据：
INSERT INTO `sys_role` VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `sys_role` VALUES ('2', 'ROLE_USER');

INSERT INTO `sys_user` VALUES ('1', 'admin', '$2a$10$ZCNiRNc0T55PzdFWCiJDX.9F/VeWgU1fM.Izvb4kvDGBY8Qoh6BuG');
-- 通过bcrype加密后的密码(123),每次加密的密码都不一样
INSERT INTO `sys_user` VALUES ('2', 'jitwxs', '$2a$10$ZCNiRNc0T55PzdFWCiJDX.9F/VeWgU1fM.Izvb4kvDGBY8Qoh6BuG');

INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '2');
