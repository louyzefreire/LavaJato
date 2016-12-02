create database lavajato;
use lavajato;

create table clientes(
	id bigint primary key auto_increment,
	telefone varchar(15) unique not null,
    nome varchar(255) not null
);

create table veiculos(
	placa varchar(8) primary key,
    modelo varchar(100) not null,
    tipo varchar(255) not null,
    cor varchar(50) not null,
    telefone varchar(15) not null,
    foreign key(telefone) references clientes(telefone)
);

create table servicos(
	id bigint primary key auto_increment,
    descricao varchar(30) not null,
    preco decimal(10,2) not null,
    previsao_entrega varchar(25) not null,
    data_servico timestamp default current_timestamp,
    placa varchar(8) not null,
    foreign key(placa) references veiculos(placa)
);
    