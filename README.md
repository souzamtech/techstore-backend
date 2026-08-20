#  TechStore – Backend

Backend da aplicação **TechStore – Catálogo**, desenvolvido utilizando **Java e Spring Boot**.

O projeto faz parte do **Projeto Final – Aplicação Full-Stack (Spring Boot + MySQL + HTML/JS)** e tem como objetivo disponibilizar uma API REST responsável pelo cadastro e gerenciamento dos produtos da aplicação.

Os dados recebidos pelo frontend são armazenados em um banco de dados **MySQL**.

---

##  Sobre o projeto

O backend fornece uma API REST para realizar o gerenciamento dos produtos do TechStore.

A aplicação possui um CRUD completo, permitindo:

* Consultar produtos;
* Consultar um produto específico;
* Cadastrar produtos;
* Atualizar produtos;
* Excluir produtos.

Os produtos são persistidos em um banco de dados MySQL.

---

##  Tecnologias utilizadas

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* API REST
* Git e GitHub

---

##  Estrutura da aplicação

O backend segue uma estrutura básica utilizando as camadas:

```text
src/
└── main/
    └── java/
        └── .../
            ├── controller/
            ├── model/
            └── repository/
```

### Model

Representa a entidade de produto que será armazenada no banco de dados.

### Repository

Responsável pela comunicação entre a aplicação e o banco de dados utilizando Spring Data JPA.

### Controller

Responsável por disponibilizar os endpoints da API REST e receber as requisições realizadas pelo frontend.

---

#  API REST

A API é executada localmente na porta:

```text
http://localhost:8080
```

A rota principal dos produtos é:

```text
http://localhost:8080/api/produtos
```

---

##  Endpoints

###  GET – Listar todos os produtos

```http
GET /api/produtos
```

Retorna todos os produtos cadastrados no banco de dados.

Exemplo:

```text
GET http://localhost:8080/api/produtos
```

---

###  GET – Buscar produto por ID

```http
GET /api/produtos/{id}
```

Retorna um produto específico de acordo com seu ID.

Exemplo:

```text
GET http://localhost:8080/api/produtos/1
```

---

###  POST – Cadastrar produto

```http
POST /api/produtos
```

Cadastra um novo produto no banco de dados.

Exemplo de JSON:

```json
{
  "titulo": "Notebook",
  "descricao": "Notebook para uso profissional",
  "preco": 3500.00,
  "categoria": "Eletrônicos",
  "imagem": "https://exemplo.com/notebook.jpg"
}
```

---

###  PUT – Atualizar produto

```http
PUT /api/produtos/{id}
```

Atualiza as informações de um produto existente.

Exemplo:

```text
PUT http://localhost:8080/api/produtos/1
```

Exemplo de JSON:

```json
{
  "titulo": "Notebook Gamer",
  "descricao": "Notebook gamer atualizado",
  "preco": 4500.00,
  "categoria": "Eletrônicos",
  "imagem": "https://exemplo.com/notebook-gamer.jpg"
}
```

---

###  DELETE – Excluir produto

```http
DELETE /api/produtos/{id}
```

Remove um produto do banco de dados.

Exemplo:

```text
DELETE http://localhost:8080/api/produtos/1
```

---

#  Banco de Dados MySQL

O projeto utiliza o **MySQL** para armazenar os produtos.

Antes de executar o backend, é necessário criar o banco de dados.

## 1. Criar o banco de dados

Abra o MySQL e execute:

```sql
CREATE DATABASE techstore;
```

Depois, verifique se o banco foi criado:

```sql
SHOW DATABASES;
```

---

## 2. Configurar o `application.properties`

No projeto Spring Boot, localize o arquivo:

```text
src/main/resources/application.properties
```

Configure a conexão com o MySQL.

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/techstore_db
spring.datasource.username=root
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

###  Atenção

Substitua:

```text
SUA_SENHA
```

pela senha configurada no seu MySQL.

Também é importante verificar se o usuário e a porta do MySQL estão corretos.

---

## 3. Criação das tabelas

Com a seguinte configuração:

```properties
spring.jpa.hibernate.ddl-auto=update
```

o Hibernate poderá criar e atualizar as tabelas correspondentes às entidades da aplicação automaticamente.

Portanto, não é necessário criar manualmente a tabela de produtos antes da primeira execução.

O banco de dados, entretanto, precisa existir:

```sql
CREATE DATABASE techstore;
```

---

#  Como executar o projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/souzamtech/techstore-backend.git
```

Depois:

```bash
cd techstore-backend
```

---

## 2. Configurar o MySQL

Crie o banco:

```sql
CREATE DATABASE techstore;
```

Depois configure suas credenciais no:

```text
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/techstore
spring.datasource.username=root
spring.datasource.password=SUA_SENHA
```

---

## 3. Executar o Spring Boot

O projeto pode ser executado através da IDE, utilizando a classe principal do Spring Boot.

Também é possível utilizar o Maven:

```bash
mvn spring-boot:run
```

Após iniciar corretamente, a API estará disponível em:

```text
http://localhost:8080
```

---

#  Integração com o Frontend

O frontend do TechStore realiza requisições para esta API através do JavaScript utilizando `fetch()`.

A URL principal utilizada pelo frontend é:

```text
http://localhost:8080/api/produtos
```

Dessa forma, o fluxo da aplicação funciona da seguinte maneira:

```text
API Pública DummyJSON
        ↓
     Frontend
     HTML/JS
        ↓
      fetch()
        ↓
 API Spring Boot
        ↓
     Spring Data JPA
        ↓
       MySQL
```

---

#  Produto

Os dados utilizados pelo backend possuem os seguintes campos principais:

| Campo       | Descrição                |
| ----------- | ------------------------ |
| `id`        | Identificador do produto |
| `titulo`    | Nome/título do produto   |
| `descricao` | Descrição do produto     |
| `preco`     | Preço do produto         |
| `categoria` | Categoria do produto     |
| `imagem`    | URL da imagem do produto |

Os dados recebidos da API pública DummyJSON são adaptados para o modelo utilizado pela aplicação.

---

#  Testando a API

Os endpoints podem ser testados utilizando ferramentas como:

* Postman;
* Insomnia;
* Thunder Client;
* Navegador, para requisições GET;
* O próprio frontend do TechStore.

Exemplo para testar a listagem:

```text
GET http://localhost:8080/api/produtos
```

---

#  Repositório do Frontend

O frontend da aplicação está disponível em:

https://github.com/souzamtech/techstore-frontend

---

##  Projeto

**TechStore – Catálogo**

Projeto desenvolvido para a disciplina como aplicação Full-Stack utilizando **Spring Boot, MySQL, HTML, CSS, JavaScript e API pública**.
