use stardapio;
create table item (
id bigint not null auto_increment,
nome varchar(255) not null,
preco numeric(6,2) not null,
descricao varchar(255) not null,
urlimage varchar(255) not null,
primary key(id)
)
ENGINE=InnoDB;
