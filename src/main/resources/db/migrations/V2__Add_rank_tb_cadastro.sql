 -- V2: Migrations para adioconar a coluna de DEPARTAMENTO na tabela de cadastros
 ALTER TABLE tb_cadastro
 ADD COLUMN departamento VARCHAR(255);

