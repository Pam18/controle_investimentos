drop schema if exists dbinvestimentos;

create database dbinvestimentos;

use dbinvestimentos;

create table empresa(
	id_empresa integer not null auto_increment primary key,
	nome varchar(100) not null,
	setor varchar(100) not null
);

create table categoria(
	id_categoria integer not null auto_increment primary key,
	tipo_investimento varchar(50) not null
);

create table ativo(
	id_ativo integer not null auto_increment primary key,
	sigla varchar(50) not null unique,
	quantidade integer not null,
	data_compra timestamp not null,
	cotacao_compra double not null,
	data_venda timestamp,
	cotacao_venda double,
	cotacao_trimestral double,
	dividend_yield_inicial double not null,
	dividend_yield_trimestral double,
	categoria integer,
	empresa integer,
	
	constraint fk_categoria foreign key(categoria) references categoria(id_categoria),
	constraint fk_empresa foreign key(empresa) references empresa(id_empresa)
);