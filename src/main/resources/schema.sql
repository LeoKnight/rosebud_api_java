CREATE TABLE city
(
  'id'      INT UNSIGNED AUTO_INCREMENT,
  'name'    VARCHAR(100) not null ,
  'state'   VARCHAR(20) not null ,
  'country' VARCHAR(100) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;