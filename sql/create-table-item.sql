use stardapio;
CREATE TABLE `item` (
  `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  `name` VARCHAR( 60 ) NOT NULL ,
  `price` NUMERIC( 6, 2 ) NOT NULL ,
  `description` VARCHAR( 300 ) NOT NULL ,
  `urlImage` VARCHAR( 300 ) NOT NULL ,
  `id_restaurant` INT NOT NULL,
  `id_type` INT NOT NULL,
   FOREIGN KEY (id_restaurant) REFERENCES restaurant(id_restaurant),
   FOREIGN KEY (id_type) REFERENCES type(id_type)
)ENGINE=InnoDB;

