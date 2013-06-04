use stardapio;
CREATE TABLE `item` (
  `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  `name` VARCHAR( 60 ) NOT NULL ,
  `price` VARCHAR( 80 ) NOT NULL ,
  `descriptiion` VARCHAR(300 ) NOT NULL ,
  `urlImage` VARCHAR(300 ) NOT NULL ,
  `id_restaurant` INT NOT NULL,
   FOREIGN KEY (id_restaurant) REFERENCES restaurant(id_restaurant)
)ENGINE=InnoDB;

