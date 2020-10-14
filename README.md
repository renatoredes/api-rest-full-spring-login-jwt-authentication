# Api Rest Full Spring boot com autenticação de Login 
#### API RESTful Cadastro de Usuario + Login

### Tecnologias
- Java 8, Maven,
- Hibernate, HSQLDB
- JUnit
- Spring Boot, Spring Security, Spring Data Rest
- JWT
- Continuous Integration - Heroku integrado com o GitHub

É possível acessar a aplicação rodando no Heroku em:
https://api-rest-full-spring-login-jwt.herokuapp.com/

Para rodar a aplicação basta fazer o clone dela e rodar o seguinte comando:
```
mvn clean package spring-boot:run
```

## Registro
Ao iniciar, é possível realizar um cadastro:
##### Exemplo: #####
```
URL: http://localhost:8080/signup
método: POST
```
##### Body: #####
```json
{
  "firstName": "Hello",
  "lastName": "World",
  "email": "hello@world.com",
  "password": "hunter2",
  "phones": [
    {
      "number": 817777888,
      "area_code": 81,
      "country_code": "+55"
    }
  ]
}
```
Isto retornará um JSON com o usuário e o token que dará acesso ao sistema.

*Obs.: O Token é válido por 30 minutos.*

![alt text](http://https://github.com/renatoredes/api-rest-full-spring-login-jwt-authentication/img/me.png)


## Consulta de usuário
Com o token, é possível fazer a consulta do usuário através da seguinte URL:
```
URL: /me
método: GET
```
No header da requisição é necessário informar o key: `Authorization`
No value é necessário informar `Bearer {token}`
Isto retornará os dados atualizados do usuário

![Registro](/img/2-me.png?raw=true "Registro")

## Login
Caso não possua o token e já tenha feito o cadastro, é possível realizar o login através da seguinte URL:
##### Exemplo: #####
```
URL: /auth
método: POST
```
##### Body: #####
```json
{
  "email": "hello@world.com",
  "password": "hunter2"
}
```
Isto retornará um JSON com o usuário e o token que dará acesso ao sistema.

![Login](/img/3-signin.PNG?raw=true "Login")

**As mensagens de erro seguem o seguinte padrão:**
```json
{ "mensagem": "mensagem de erro" }
```
