exemplo-jdbc
============
Exemplo de aplicação JDBC simples

Download
--------
Através do botão "Download ZIP" ou através de um comando ```git clone https://github.com/regispires/exemplo-dao-jdbc.git```
O 'git clone' pode ser realizado diretamente através do Eclipse:
- Mudar para a perspectiva para "Git Repository Exploring".
- Clicar no botão Clone Git repository.
- Colar a URI do repositório em Location -> URI.

Importar o projeto para o Eclipse
---------------------------------
- Faça: File -> Import -> General -> Existing Projects into Workspace
- Clique em 'Next >'
- Selecione o diretório raiz (Root directory) do projeto baixado
- Clique em "Finish"

Criar o esquema relacional no PostgreSQL
----------------------------------------
```sql
create database trabalho1;

create table cliente (
  id int primary key,
  nome varchar(50),
  idade int
);
```
