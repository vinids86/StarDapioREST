use stardapio;
CREATE TABLE `pedido` (
  `id_cliente` INT NOT NULL,
  `id_restaurant` INT NOT NULL,
  `item` INT NOT NULL,
  `mesa` INT NOT NULL,
   FOREIGN KEY (id_restaurant) REFERENCES restaurant(id_restaurant)
)ENGINE=InnoDB;
