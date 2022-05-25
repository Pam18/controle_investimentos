USE dbinvestimentos;
CREATE TABLE IF NOT EXISTS empresa (
      id_empresa BIGINT AUTO_INCREMENT PRIMARY KEY,
      nome VARCHAR(100),
      setor VARCHAR(100)       
);

CREATE TABLE IF NOT EXISTS ativo (
      id_ativo BIGINT AUTO_INCREMENT PRIMARY KEY,
      sigla VARCHAR(100) UNIQUE,
      categoria BIGINT,
      empresa BIGINT,
      quantidade DOUBLE,
      data_compra DATE,
      cotacao_compra DOUBLE,
      data_venda DATE,
      cotacao_venda DOUBLE,
      cotacao_trimestral DOUBLE,
      dividend_yield_inicial DOUBLE,
      dividend_yield_trimestral DOUBLE,    
      
      FOREIGN KEY (categoria) REFERENCES categoria(id_categoria),
      FOREIGN KEY (empresa) REFERENCES empresa(id_empresa)
);

CREATE TABLE IF NOT EXISTS categoria (
      id_categoria BIGINT AUTO_INCREMENT PRIMARY KEY,
      tipo_investimento VARCHAR(100) NOT NULL	       
);