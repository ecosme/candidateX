--Create database on MySQL 
CREATE DATABASE Trades;
USE Trades;
--Create tables
CREATE TABLE Loan (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loanAmount` decimal(10,2) DEFAULT NULL,
  `term` date DEFAULT NULL,
  `name` varchar(60) DEFAULT NULL,
  `surname` varchar(60) DEFAULT NULL,
  `personalId` int(11) DEFAULT NULL,
  `approved` char(1) DEFAULT 'F',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

CREATE TABLE BlackList (personalId int, expires date );

--Create user and grant permissions
CREATE USER 'appuser'@'localhost' INDENTIFIED BY 'loquesea';
--Grant permissions to the application user
GRANT ALL PRIVILEGES ON Trades.* TO  'appuser'@'localhost';
