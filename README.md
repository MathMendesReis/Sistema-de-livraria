# Sistema de Livraria

Bem-vindo ao projeto **Sistema de Livraria**, desenvolvido como parte do desafio da formação de Java.

Este projeto tem como objetivo criar um sistema simples para gerenciar o empréstimo de livros em uma biblioteca. O sistema permite que o usuário veja livros disponíveis, realize o empréstimo de livros e consulte informações sobre eles, tudo por meio de um menu interativo no console.

## Funcionalidades

### 1. **Gerenciamento de Livros**
- **Adicionar um novo livro**: Você pode adicionar livros ao sistema, incluindo título, autor, e status de disponibilidade.
- **Listar livros disponíveis**: O sistema exibe uma lista de livros disponíveis para empréstimo.
- **Realizar empréstimo de um livro**: O usuário pode escolher um livro para emprestar, fornecendo seu nome. O livro será marcado como indisponível após o empréstimo.

### 2. **Emprestimo de Livros**
- O livro emprestado será registrado no sistema, e ele ficará marcado como indisponível até o final da execução do programa.
- Ao realizar o empréstimo, o usuário deve inserir seu nome, e a operação será registrada com sucesso.


### 3. **Regras de Negócio**
- Apenas livros marcados como **disponíveis** podem ser emprestados.
- Após o empréstimo, o livro será marcado como **indisponível** até o final da execução do programa.
- O histórico de empréstimos é registrado.

### 4. **Funcionalidades Extras**
Aqui estão algumas sugestões de funcionalidades que podem ser implementadas no futuro:
- Cadastro de **clientes** (usuários da biblioteca) e associação de empréstimos aos clientes.
- Consultar **histórico de empréstimos** de livros ou de clientes.
- Buscar livros por **título** ou **autor**.
- Adicionar filtros para listar livros de **determinados gêneros** ou que foram **adicionados recentemente**.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/MathMendesReis/Sistema-de-livraria.git
