-- auto Generated on 2019-05-28
DROP TABLE IF EXISTS post;
CREATE TABLE post(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	user_id BIGINT (15) DEFAULT -1 COMMENT 'userId',
	commit_id BIGINT (15) DEFAULT -1 COMMENT '一个帖子的 commitId 统一',
	is_deleted TINYINT (3) DEFAULT 0 COMMENT 'isDeleted',
	create_time DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createTime',
	update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
INDEX `ix_user_id_commit_id`(user_id,commit_id),
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'post';
