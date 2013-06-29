use stardapio;
CREATE TABLE `sub_type` (
  `id_sub_type` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `type` VARCHAR ( 80 ) NOT NULL,
  `id_type` INT NOT NULL,
   FOREIGN KEY (id_type) REFERENCES type(id_type)
)ENGINE=InnoDB;
