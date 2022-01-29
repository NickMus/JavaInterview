CREATE TABLE `Films`
(
    `idFilms`    int(11)     NOT NULL AUTO_INCREMENT,
    `Films_name` varchar(45) NOT NULL,
    `duration`   varchar(45) NOT NULL,
    PRIMARY KEY (`idFilms`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = latin1;

CREATE TABLE `Sold_tickets`
(
    `idSold_tickets`     int(11)     NOT NULL AUTO_INCREMENT,
    `Sold_tickets_numb`  varchar(45) NOT NULL,
    `Sold_tickets_seans` int(11)     NOT NULL,
    PRIMARY KEY (`idSold_tickets`),
    KEY `seans` (`Sold_tickets_seans`),
    CONSTRAINT `fk_time_table_sold_seans` FOREIGN KEY (`Sold_tickets_seans`) REFERENCES `Time_table` (`idTime_table`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = latin1;

CREATE TABLE `Tickets`
(
    `idTickets_price` int(11) NOT NULL AUTO_INCREMENT,
    `Tickets_price`   varchar(45) DEFAULT NULL,
    PRIMARY KEY (`idTickets_price`),
    CONSTRAINT `fk_tickets_time_table_id` FOREIGN KEY (`idTickets_price`) REFERENCES `Time_table` (`idTime_table`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT `fk_tickets_time_table_price` FOREIGN KEY (`idTickets_price`) REFERENCES `Time_table` (`Price`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = latin1;

CREATE TABLE `Time_table`
(
    `idTime_table` int(11)     NOT NULL AUTO_INCREMENT,
    `Time`         varchar(45) NOT NULL,
    `Price`        int(11)     NOT NULL,
    `idFilms`      int(11)     NOT NULL,
    PRIMARY KEY (`idTime_table`),
    KEY `price` (`Price`),
    KEY `idFilms` (`idFilms`),
    CONSTRAINT `fk_films_time_table_id` FOREIGN KEY (`idFilms`) REFERENCES `Films` (`idFilms`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB
  AUTO_INCREMENT = 9
  DEFAULT CHARSET = latin1;
