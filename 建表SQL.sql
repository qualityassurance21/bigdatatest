-- 用户管理
-- DROP TABLE IF EXISTS `operator`;
CREATE TABLE `operator` (
  `operator_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT ' ' COMMENT '操作员编号',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT ' ' COMMENT '密码',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '操作员状态 0：正常，1：冻结，2：锁定',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT ' ' COMMENT '操作员姓名',
  `telephone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT ' ' COMMENT '电话号码',
  `remark` varchar(2000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT ' ' COMMENT '备注',
  PRIMARY KEY (`operator_no`),
  UNIQUE KEY `telephone` (`telephone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 功能测试


-- 性能测试


-- 自动化测试


-- 测试工具



-- 文章翻译
-- DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `article_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '唯一ID',
  `type` bigint(20) DEFAULT NULL COMMENT '文章类型：如功能测试、性能测试、自动化测试、测试工具、文章翻译',
  `article_title` VARCHAR(50) NOT NULL COMMENT '文章标题',
  `article_content` mediumtext CHARACTER SET utf8 COMMENT '内容',
  `viewpoint_img_audio` varchar(6000) CHARACTER SET utf8 DEFAULT NULL COMMENT '是否富文本图片和语音（json格式）',
  `upvote_num` int(6) DEFAULT NULL COMMENT '点赞数',
  `comment_num` int(6) DEFAULT NULL COMMENT '评论数量',
  `send_time` datetime DEFAULT NULL COMMENT '发送时间',
  `author` bigint(20) DEFAULT NULL COMMENT '创建人',
  `is_top` int(6) DEFAULT '0' COMMENT '是否置顶（0 否  1 是）',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间/保存时间',
  `read_num` int(11) DEFAULT '0' COMMENT '阅读数',
  `share_num` int(11) DEFAULT '0' COMMENT '分享数',
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=119039 DEFAULT CHARSET=utf8mb4 COMMENT='文章';




