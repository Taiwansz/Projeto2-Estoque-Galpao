# Projeto 2 - Controle de Estoque de Galpao

Atividade de Programacao Orientada a Objetos em Java utilizando classes abstratas, heranca e encapsulamento.

## Estrutura

- `Produto.java`: Atributos nome, preco e quantidadeEmEstoque (inicializado obrigatoriamente com 0).
- `Funcionario.java`: Superclasse abstrata com nome, salario e metodo abstrato `trabalhar()`.
- `FuncProducao.java`: Subclasse de `Funcionario` com turno e metodo `operar()`.
- `Gestor.java`: Subclasse de `Funcionario` com metodo `atribuirTarefas()`.
- `Main.java`: Execucao dos testes das classes.
