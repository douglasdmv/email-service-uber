 ## 💻 Sobre o projeto

 Serviço de email criado a partir de um [desafio de backend da Uber](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md). A idéia foi basicamente um protótipo para um projeto que possui as informações necessárias e faz o envio de emails. Para isso, foi utilizado o provedor Amazon SES.

---

## ⚙️ Funcionamento

Para funcionamento do projeto, será necessário definir as credenciais na sua conta AWS. Essas credenciais são a accessKeyId e secretKey, que são definidas no application.properties do projeto. Lembrando também que o projeto está configurado para rodar na região us-east-2, caso sua conta AWS esteja configurada em outra, isso também deve ser alterado no application-properties e também na linha 24 do arquivo AwsSesConfig.java.

O email que está indicado na linha 30 do arquivo SesEmailSender.java, é o que irá realizar o envio do mesmo. Lembrando que, caso esteja no ambiente de testes da AWS, o envio de emails só funciona para as identidades verificadas, que são colocadas nas configurações do Amazon SES, ou seja, só podem receber os emails, esses endereços que estão lá.

Realizando essas configurações, o projeto já deve estar pronto para os testes.

O teste pode ser feito com o método POST no endpoint localhost:8080/api/email e utilizando o json abaixo:

```
{
    "to":"email@gmail.com",
    "subject":"teste",
    "body":"hello from test"
}
```

---

## 🛠 Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento da API Rest do projeto:

- Java 17;
- Spring Boot 3.1;
- Amazon SES(Send Email Service).
