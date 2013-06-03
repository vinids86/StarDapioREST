use stardapio;
create table usuario (
id bigint not null auto_increment,
nome varchar(255) not null,
email varchar(255) not null,
sala Smallint not null,
curso varchar(255) not null,
senha varchar(255) not null,
primary key(id)
)
ENGINE=InnoDB;
