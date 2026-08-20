#  TechStore – Catálogo

Frontend da aplicação **TechStore – Catálogo**, desenvolvido em HTML, CSS e JavaScript.

O projeto faz parte do **Projeto Final – Aplicação Full-Stack (Spring Boot + MySQL + HTML/JS)** e tem como objetivo consumir produtos de uma API pública e permitir que esses dados sejam enviados para uma API REST própria desenvolvida em Spring Boot.

---

## Sobre o projeto

O TechStore é uma aplicação de catálogo de produtos.

O frontend possui duas principais funções:

1. **Consumir produtos de uma API pública** utilizando JavaScript e `fetch()`;
2. **Enviar e gerenciar produtos através da API própria**, desenvolvida em Spring Boot.

Os produtos da API pública são apresentados na tela e podem ser utilizados para cadastrar produtos no banco de dados da aplicação.

Depois de cadastrados, os produtos são carregados através da API própria e podem ser:

* Listados;
* Cadastrados;
* Atualizados;
* Excluídos.

---

## Tecnologias utilizadas

* HTML5
* CSS3
* JavaScript
* Bootstrap
* Fetch API
* API REST
* Git e GitHub

---

##  API Pública

Para obter os produtos iniciais, o projeto utiliza a API pública **DummyJSON**.

API utilizada:

`https://dummyjson.com/products`

A aplicação realiza uma requisição utilizando JavaScript:

```javascript
fetch("https://dummyjson.com/products")
```

Os dados recebidos são utilizados para montar os cards de produtos na interface.

Entre as informações utilizadas estão:

* Título;
* Descrição;
* Preço;
* Categoria;
* Imagem.

---

##  Integração com o Backend

Além da API pública, o frontend se comunica com a API própria desenvolvida em Spring Boot.

Durante o desenvolvimento local, o backend é executado em:

```text
http://localhost:8080
```

A rota principal utilizada pelo frontend é:

```text
http://localhost:8080/api/produtos
```

A comunicação entre frontend e backend é realizada utilizando `fetch()`.

Exemplo:

```javascript
fetch("http://localhost:8080/api/produtos")
```

---

##  Operações CRUD

O frontend permite realizar as operações básicas de um CRUD através da API Spring Boot.

| Operação          | Método | Endpoint             |
| ----------------- | ------ | -------------------- |
| Listar produtos   | GET    | `/api/produtos`      |
| Buscar produto    | GET    | `/api/produtos/{id}` |
| Cadastrar produto | POST   | `/api/produtos`      |
| Atualizar produto | PUT    | `/api/produtos/{id}` |
| Excluir produto   | DELETE | `/api/produtos/{id}` |

---

##  Como executar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/souzamtech/techstore-frontend.git
```

Depois, entre na pasta:

```bash
cd techstore-frontend
```

### 2. Executar o frontend

Como o projeto utiliza HTML, CSS e JavaScript, não é necessário instalar Node.js ou outro framework.

Abra o arquivo:

```text
index.html
```

no navegador.

Também é possível utilizar uma extensão como **Live Server** no Visual Studio Code para executar o projeto.

---

##  Importante

Para que as operações de cadastro, atualização, consulta e exclusão funcionem corretamente, o **backend Spring Boot precisa estar em execução**.

O frontend espera encontrar a API em:

```text
http://localhost:8080/api/produtos
```

---

##  Estrutura do projeto

```text
techstore-frontend/
│
├── index.html
├── css/
│   └── style.css
├── js/
│   └── script.js
└── README.md
```

A estrutura pode variar de acordo com a organização final dos arquivos do projeto.

---

##  Repositório do Backend

O backend responsável pela API REST e pelo banco de dados MySQL está disponível em:

https://github.com/souzamtech/techstore-backend

---

##  Projeto

**TechStore – Catálogo**

Projeto desenvolvido para a disciplina como aplicação Full-Stack utilizando frontend HTML/JS, API pública, Spring Boot e MySQL.
