# api-cidades-no-azure


### Base de estados e municipos:
https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL

TUTORIAL MICROSOFT
https://docs.microsoft.com/pt-br/azure/developer/java/spring-framework/configure-spring-data-jpa-with-azure-postgresql


COMANDO PARA CRIAR SERVIDOR DB POSTGRES
az postgres server create --resource-group github-lznunes --name srv-api-cidades --location eastus --sku-name B_Gen5_1 --storage-size 5120 --admin-user postgres --admin-password Senh@2020


CRIANDO DB
az postgres db create --resource-group github-lznunes --name api-cidades --server-name srv-api-cidades




spring.datasource.url=jdbc:postgresql://srv-api-cidades.postgres.database.azure.com:5432/api-cidades
spring.datasource.username=usuario@srv-api-cidades
spring.datasource.password=senha

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop


https://github.com/lznunes/api-cidades-no-azure
