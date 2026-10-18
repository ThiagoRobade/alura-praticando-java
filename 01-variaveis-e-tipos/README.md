# Praticando Java — Variáveis e Tipos

Este módulo contém a resolução dos desafios práticos do curso **"Praticando Java: variáveis e tipos"** da Alura.

---

## 🏋️ Desafio 01: Declarando valores a variáveis

**📝 Enunciado:**
Escreva um programa que declare variáveis para o seu nome, idade, altura e se você é estudante, utilizando os tipos apropriados, e depois exiba os valores armazenados.

**🎯 Objetivo:**
Praticar a declaração e inicialização de variáveis com diferentes tipos primitivos (`String`, `int`, `double`, `boolean`).

**💻 Solução:**
[Ver código](./src/Exercicio01.java)

---

## 🏋️ Desafio 02: Conversão de tipos (Casting)

**📝 Enunciado:**
Você está desenvolvendo um sistema de gerenciamento de estoque que exige que as quantidades dos produtos sejam registradas como números inteiros. No entanto, os dados disponíveis atualmente estão no formato `double`. Crie um programa que converta a quantidade de `double` para `int`.

**🎯 Objetivo:**
Praticar o casting explícito de tipos primitivos (conversão de `double` para `int`).

**💻 Solução:**
[Ver código](./src/Exercicio02.java)

---

## 🏋️ Desafio 03: Primitivos em ação

**📝 Enunciado:**
Você está desenvolvendo um aplicativo que calcula a média de notas dos alunos. Crie três variáveis do tipo `double` chamadas `nota1`, `nota2` e `nota3`, atribua os valores 7.5, 8.0 e 9.0, respectivamente. Em seguida, calcule a média e exiba o resultado.

**🎯 Objetivo:**
Praticar a declaração de múltiplas variáveis, operações aritméticas básicas e formatação de saída com números decimais.

**💻 Solução:**
[Ver código](./src/Exercicio03.java)

---

## 🏋️ Desafio 04: Conversão de temperatura

**📝 Enunciado:**
Você está desenvolvendo um sistema de monitoramento de temperatura. Crie um programa que receba uma temperatura em graus Celsius (`int`) e exiba a temperatura convertida em graus Fahrenheit (`double`). A fórmula para conversão é: `Fahrenheit = (Celsius * 9 / 5) + 32`.

**🎯 Objetivo:**
Praticar a conversão entre tipos primitivos e a aplicação de fórmulas matemáticas em Java.

**💻 Solução:**
[Ver código](./src/Exercicio04.java)

---

## 🏋️ Desafio 05: Cadastro de livros

**📝 Enunciado:**
Crie um programa de cadastro de livros que armazene em variáveis: título, autor, número de páginas, preço e categoria (escolhida através de um único caractere: F - Ficção, N - Não-ficção, T - Tecnologia, H - História). Com base na categoria armazenada, exiba uma mensagem de confirmação de acordo com o que foi escolhido.

**🎯 Objetivo:**
Praticar o uso de tipos primitivos (`int`, `double`, `char`) em conjunto com `String` e estruturas de decisão.

**💻 Solução:**
[Ver código](./src/Exercicio05.java)

---

## 🏋️ Desafio 06: Classificação por categoria

**📝 Enunciado:**
Você trabalha em um e-commerce e precisa classificar os produtos em diferentes categorias com base no preço. As regras são:
- **Econômico:** preço até R$ 50,00.
- **Intermediário:** preço entre R$ 50,01 e R$ 200,00.
- **Premium:** preço acima de R$ 200,00.

Escreva um programa que classifique um produto e exiba a categoria correspondente.

**🎯 Objetivo:**
Praticar o uso de estruturas condicionais (`if/else`) para tomada de decisão com base em variáveis.

**💻 Solução:**
[Ver código](./src/Exercicio06.java)

---

## 🏋️ Desafio 07: Par ou ímpar?

**📝 Enunciado:**
Você está desenvolvendo um jogo e quer um programa que determine se um número é par ou ímpar. Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.

**🎯 Objetivo:**
Praticar o operador de módulo (`%`) e estruturas condicionais.

**💻 Solução:**
[Ver código](./src/Exercicio07.java)

---

## 🏋️ Desafio 08: Conversor de moedas

**📝 Enunciado:**
Você está organizando uma viagem internacional e precisa converter uma quantia em reais (R$) para dólares americanos (US$) com base na taxa de câmbio atual. A taxa utilizada é de R$ 5,25 para cada US$ 1. Crie um programa que realize a conversão e exiba o valor convertido.

**🎯 Objetivo:**
Praticar a declaração de variáveis do tipo `double` e operações de divisão.

**💻 Solução:**
[Ver código](./src/Exercicio08.java)

---

## 🏋️ Desafio 09: Verificação de idade e escopo de variáveis

**📝 Enunciado:**
Você precisa corrigir um código que verifica se uma pessoa é maior de idade. O código original apresenta um erro de escopo de variáveis (a variável `mensagem` é declarada dentro dos blocos `if/else` e não pode ser acessada fora deles). Sua tarefa é identificar e corrigir o erro para que o programa exiba a mensagem correta.

**🎯 Objetivo:**
Entender o conceito de escopo de variáveis em Java e como corrigir erros de compilação.

**💻 Solução:**
[Ver código](./src/Exercicio09.java)

---

## 🏋️ Desafio 10: Planejando uma viagem: consumo e autonomia

**📝 Enunciado:**
Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o combustível disponível. O programa deve calcular:
1.  A autonomia máxima do carro (tanque cheio).
2.  A autonomia atual (combustível disponível).
3.  Se o combustível atual será suficiente para percorrer um trajeto informado.

**Fórmulas de apoio:**
- `autonomiaMaxima = consumoMedio * capacidadeTanque`
- `autonomiaAtual = consumoMedio * combustivelAtual`

**🎯 Objetivo:**
Praticar a realização de múltiplos cálculos, o uso de variáveis e a exibição de resultados formatados.

**💻 Solução:**
[Ver código](./src/Exercicio10.java)

---