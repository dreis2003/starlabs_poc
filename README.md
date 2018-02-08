# starlabs_poc

POC para persistir multiplos objetos encadeados em uma mesma tabela utilizando o JPA.


Nesta POC utilizei:
- Mysql
- Spring Boot
- Spring DATA
- JUnit

Para validar a POC é necessario os seguintes procedimentos:

- Criar um banco na instancia local do Mysql (localhost) com o nome "poc_jpa"
- Alterar a senha do Mysql do Datasource do projeto nos arquivos application.properties e test.properties

executar no path do projeto o comando do maven:

$mvn test

O Maven deve rodar a classe de testes PessoaServiceImplTest.class sem nenhum erro.

na execução do Spring ele criará automaticamente a tabela Pessoa no banco de dados poc_jpa

Para validar a persistencia, utilize MysqlWorkbench ou DBeaver ou SQL Developer para dar um select na tabela Pessoa e confirmar a estrutura da tabela e a persistencia de 1 registro.



