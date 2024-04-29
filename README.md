# Meetime Tech Case

O projeto consiste em uma aplicação fictícia possuindo apenas um CRUD de empresas e usuários.
Os candidatos serão desafiados a resolver uma série de problemas e implementar funcionalidades específicas dentro do contexto do projeto.
---
## Instalação

Para rodar o projeto, é necessário ter o Docker e Docker Compose instalados na máquina.
Acessar a pasta docker e rodar o comando abaixo:
```bash
docker-compose up --build -d
```
---
## Caso de uso

Alguns usuários da aplicação estão reportando erros ao utilizar a API e você foi designado para corrigir esses problemas. 
Em algum momento, um novo requisito foi solicitado e você também deve implementá-lo.
Abaixo estão listados os problemas que foram reportados:

---
1. Não está sendo possível criar uma empresa, os dados enviados na requisicão foram:
```json
{
    "name": "Empresa X",
    "cnpj": "12345678901234",
    "address": "Rua do Vies, nº 0",
    "phone": "11999999999"
}
```
Considerando que nem o usuário nem o suporte conseguiram identificar o problema, implemente um tratamento de erros no formulário de criação de empresas. Dessa forma, a API poderá retornar uma lista de mensagens de erro indicando os campos inválidos.

---
2. Surgiu uma demanda para que apenas seja possível criar usuários com emails que não sejam gratuitos. 
Caso o email seja gratuito, a API deve retornar um erro com a mensagem "Email inválido".
Para fins didáticos vamos considerar que os emails gratuitos são os que possuem os domínios gmail.com, hotmail.com e outlook.com.

---
3. Não está sendo possível criar um usuário, os dados enviados na requisicão foram:
```json
{
    "name": "Usuário X",
    "email": "x@gmail.com",
    "companyId": 1
}
```
obs: Substitua o companyId pelo id da empresa criada no passo 1.

---
4. Foi solicitado que ao deletar uma empresa, todos os usuários vinculados a ela sejam deletados também.

---

5. Foi solicitado que ao criar um usuário ou empresa, seja enviado o ID do registro criado no Header da resposta utilizando o campo "Location".

---

## Regras de negócio

- Uma empresa pode ter vários usuários.
- Um usuário pertence a uma empresa.
- Um usuário não pode ser criado sem uma empresa.
- Uma empresa não pode ser criada sem um CNPJ no formato correto. (XX.XXX.XXX/XXXX-XX)
- Uma empresa não pode ser criada sem um telefone no formato correto. (11 99999-9999)
- Os campos de nome e CNPJ são obrigatórios para a criação de uma empresa.
- O tamanho mínimo do campo de nome é 3 caracteres para a criação de uma empresa ou usuário.