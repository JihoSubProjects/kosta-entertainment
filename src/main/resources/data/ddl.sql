CREATE TABLE `agency` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '소속사명',
  `ceo` varchar(50) DEFAULT NULL COMMENT 'CEO',
  `address` varchar(100) DEFAULT NULL COMMENT '주소',
  `img` text DEFAULT NULL COMMENT '이미지 주소',
  PRIMARY KEY (`id`)
);

CREATE TABLE `artist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '그룹명',
  `debut_date` date DEFAULT NULL COMMENT '데뷔일자',
  `img` text DEFAULT NULL COMMENT '아티스트 이미지',
  `description` text DEFAULT NULL COMMENT '그룹 소개란',
  `agency_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `artist_FK` (`agency_id`),
  CONSTRAINT `artist_FK` FOREIGN KEY (`agency_id`) REFERENCES `agency` (`id`)
);

CREATE TABLE `member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '멤버이름',
  `age` smallint(6) DEFAULT NULL COMMENT '나이',
  `gender` varchar(5) DEFAULT NULL COMMENT '성별',
  `position` varchar(100) DEFAULT NULL COMMENT '포지션',
  `img` text DEFAULT NULL COMMENT '멤버이미지',
  `artist_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `member_FK` (`artist_id`),
  CONSTRAINT `member_FK` FOREIGN KEY (`artist_id`) REFERENCES `artist` (`id`)
);

CREATE TABLE `album` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '앨범명',
  `relese_date` date DEFAULT NULL COMMENT '발매일',
  `artist_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `album_FK` (`artist_id`),
  CONSTRAINT `album_FK` FOREIGN KEY (`artist_id`) REFERENCES `artist` (`id`)
);

CREATE TABLE `music` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `track` smallint(6) DEFAULT NULL COMMENT '트랙 No',
  `name` varchar(100) DEFAULT NULL COMMENT '곡명',
  `title` tinyint(4) DEFAULT NULL COMMENT '타이틀 여부',
  `play_time` time DEFAULT NULL COMMENT '재생시간',
  `album_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `music_FK` (`album_id`),
  CONSTRAINT `music_FK` FOREIGN KEY (`album_id`) REFERENCES `album` (`id`)
);