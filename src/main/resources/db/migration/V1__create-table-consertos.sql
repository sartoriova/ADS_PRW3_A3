create table consertos (
    id bigint not null auto_increment,
    data_entrada varchar(10) not null,
    data_saida varchar(10) not null,
    nome_mecanico varchar(40) not null,
    anos_experiencia int not null,
    marca varchar(40) not null,
    modelo varchar(40) not null,
    ano int not null,

    primary key (id)
 );