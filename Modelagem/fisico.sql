CREATE DATABASE Bookstore

CREATE TABLE `login` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `cpf` char(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 

CREATE TABLE `escolha` (
  `id` int NOT NULL AUTO_INCREMENT,
  `embarque` varchar(40) DEFAULT NULL,
  `desembarque` varchar(40) DEFAULT NULL,
  `horario` char(10) DEFAULT NULL,
  `datavoo` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) 

CREATE TABLE `pagamento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cartao` char(16) DEFAULT NULL,
  `parcela` varchar(40) DEFAULT NULL,
  `pix` char(40) DEFAULT NULL,
  `preco_viagem` char(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 