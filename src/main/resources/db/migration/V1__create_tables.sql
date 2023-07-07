CREATE TABLE `testeFake`.`tb_professor` (
  `id`                  INT           NOT NULL  AUTO_INCREMENT,
  `nome`                VARCHAR(100)  NOT NULL,
  `data_nascimento`     DATE          NOT NULL,
  `carga_horaria`       TIME          NOT NULL,
  `valor_hora`          DECIMAL(5,2)  NOT NULL,
  `estrangeiro`         TINYINT       NOT NULL,
  `horas_disponiveis`    INT          NOT NULL,
  `biografia`           VARCHAR(255)  NOT NULL,
  `data_hora_cadastro`  DATETIME      NOT NULL,
  PRIMARY KEY (`id`)
  );
