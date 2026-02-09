# 📍 Points of Interest (POI) API

Esta é uma API REST desenvolvida em **Java** e **Spring Boot** para gerenciar Pontos de Interesse (POIs) baseados em coordenadas X e Y. A aplicação permite cadastrar pontos e realizar buscas por proximidade utilizando o cálculo de distância euclidiana.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3**
* **Spring Data JPA** (Persistência de dados)
* **H2 Database** (Banco de dados em memória para testes rápidos)
* **Maven** (Gerenciamento de dependências)

---

## 🚀 O Desafio

O objetivo é auxiliar uma empresa de GPS a localizar pontos de interesse próximos a uma localização específica.

**Exemplo de funcionamento:**
Dado um conjunto de POIs cadastrados e um ponto de referência (X, Y) com um raio de distância (D), a API deve retornar todos os POIs cuja distância até o ponto de referência seja menor ou igual a D.

A distância é calculada pela fórmula:
`d = √((x2 - x1)² + (y2 - y1)²)`

---

## ✨ Funcionalidades

* **Cadastro de POI:** Salva um ponto com nome e coordenadas (X, Y) não negativas.
* **Listagem de POIs:** Retorna todos os pontos cadastrados no sistema.
* **Busca por Proximidade:** Filtra os pontos que estão dentro de um raio de distância de uma coordenada informada.

---

## 🛣️ Endpoints da API

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **POST** | `/pois` | Cadastra um novo Ponto de Interesse |
| **GET** | `/pois` | Lista todos os POIs cadastrados (com paginação opcional) |
| **GET** | `/near-me?x={val}&y={val}&dmax={val}` | Busca pontos próximos a uma coordenada |

### Exemplo de JSON para Cadastro:
```json
{
  "name": "Lanchonete",
  "x": 27,
  "y": 12
}
