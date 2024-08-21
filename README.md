# Blog API

Este é um projeto de uma API RESTful desenvolvido como parte do curso da Digital Innovation One (DIO). A API é construída utilizando Spring Boot e permite realizar operações CRUD (Criar, Ler, Atualizar e Deletar) em posts de blog armazenados em memória.

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação utilizada.
- **Spring Boot**: Framework utilizado para criar a aplicação.
- **Maven**: Gerenciador de dependências.

## Funcionalidades

A API permite as seguintes operações em posts de blog:

- **Criar um novo post**: Você pode criar um novo post fornecendo o título e o conteúdo.
- **Listar todos os posts**: Recupera todos os posts existentes na memória.
- **Atualizar um post**: Atualiza as informações de um post existente, como título ou conteúdo.
- **Deletar um post**: Remove um post específico através de seu ID.

## Endpoints

Aqui estão os principais endpoints da API:

- `GET /posts`: Lista todos os posts.
- `POST /posts`: Cria um novo post.
- `PUT /posts/{id}`: Atualiza um post existente.
- `DELETE /posts/{id}`: Deleta um post.
## Como Executar o Projeto

Siga os passos abaixo para executar o projeto localmente:

### Pré-requisitos

Antes de começar, você precisará ter as seguintes ferramentas instaladas em sua máquina:

- [Java 21 JDK](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- Um editor de código, como o [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) ou [VS Code](https://code.visualstudio.com/)

### Passos para Executar

1. **Clone o Repositório**

   Primeiro, clone o repositório do projeto para sua máquina local utilizando o comando abaixo:

   ```bash
   [git clone https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/nika565/crud_blog_api.git)
Navegue até o Diretório do Projeto

Após clonar o repositório, navegue até o diretório do projeto:

```bash
cd crud_blog_api
Execute o Projeto com Maven

Para rodar o projeto, utilize o Maven para executar a aplicação Spring Boot. No terminal, dentro do diretório do projeto, execute:

```bash
./mvnw spring-boot:run
Ou, se estiver utilizando Windows:

```bash
mvnw.cmd spring-boot:run
Acesse a API

Após a aplicação iniciar, você poderá acessar a API através do endereço:

```arduino
http://localhost:8080
Testando a API
Você pode testar os endpoints da API utilizando ferramentas como Postman ou cURL.

## Exemplo de Requisição com cURL
### Criar um novo post:

```bash
curl -X POST http://localhost:8080/posts -H "Content-Type: application/json" -d '{"title":"Meu Segundo Post","content":"Este é o conteúdo do meu segundo post."}'
### Listar todos os posts:

```bash
curl -X GET http://localhost:8080/posts
### Atualizar um post existente:

```bash
curl -X PUT http://localhost:8080/posts/1 -H "Content-Type: application/json" -d '{"title":"Meu Post Atualizado","content":"Conteúdo atualizado."}'
### Deletar um post:

```bash
curl -X DELETE http://localhost:8080/posts/1

