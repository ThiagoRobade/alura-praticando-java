# Praticando Java — Laços `for` e `while`

Este módulo contém desafios práticos sobre estruturas de repetição (`for` e
`while`), contadores, acumuladores e validação de entradas.

---

## 🏋️ Desafio 01: Contagem de degraus

Carla começou a praticar trilha e deseja saber quantos degraus precisará subir
para chegar ao topo de uma escadaria. Ela sobe um degrau por vez e quer um
programa que mostre sua subida até o topo. Crie um programa que receba um
número e simule a subida da escadaria.

**Exemplo de entrada:**

```text
Digite a quantidade de degraus: 5
```

**Saída esperada:**

```text
Subindo o degrau 1
Subindo o degrau 2
Subindo o degrau 3
Subindo o degrau 4
Subindo o degrau 5
Você chegou ao topo!
```

[Ver solução](src/Ex01ContagemDeDegraus.java)

---

## 🏋️ Desafio 02: Soma de números

João recebeu uma lista de valores representando as receitas de sua loja de
roupas. Ele quer calcular a soma total dessas receitas para entender o
desempenho financeiro semanal. Crie um programa que calcule o valor total.

```java
int[] valores = {10, 20, 30, 40, 50};
```

**Saída esperada:**

```text
A soma total das receitas é: 150
```

[Ver solução](src/Ex02SomaDeNumeros.java)

---

## 🏋️ Desafio 03: Soma dos números pares

Maria quer calcular a soma de todos os números pares de 1 a 100. Crie um
programa que use um loop para iterar pelos números e somar apenas aqueles
divisíveis por 2.

**Saída esperada:**

```text
A soma dos números pares de 1 a 100 é: 2550
```

[Ver solução](src/Ex03SomaDosNumerosPares.java)

---

## 🏋️ Desafio 04: Calculadora de fatorial

Pedro quer calcular o fatorial de um número. O fatorial de um número é o
produto de todos os números inteiros positivos de 1 até o próprio número. Por
exemplo, o fatorial de 5 é `5 × 4 × 3 × 2 × 1 = 120`. Crie um programa que
receba um número e calcule seu fatorial.

**Exemplo de entrada:**

```text
Digite um número: 5
```

**Saída esperada:**

```text
O fatorial de 5 é: 120
```

[Ver solução](src/Ex04CalculadoraDeFatorial.java)

---

## 🏋️ Desafio 05: Encontrando o maior número

Carlos tem uma lista de números e quer descobrir qual é o maior valor. Crie um
programa que percorra a lista, compare cada número com o maior encontrado até o
momento e encontre o maior número.

**Exemplo de entrada:**

```text
Digite os números separados por espaço: 3 7 2 9 5
```

**Saída esperada:**

```text
O maior número é: 9
```

[Ver solução](src/Ex05EncontrandoOMaiorNumero.java)

---

## 🏋️ Desafio 06: Monitorando tentativas de login

Leonardo trabalha no setor de segurança de um sistema bancário e precisa
limitar as tentativas de senha. Se o usuário errar a senha 3 vezes seguidas, a
conta deve ser bloqueada temporariamente. Crie um programa que permita até 3
tentativas de erro antes de bloquear o acesso. Se o usuário acertar a senha,
o sistema deve conceder o acesso imediatamente.

**Exemplo de entrada e saída — acesso concedido:**

```text
Digite sua senha: 1234
Senha Correta! Acesso concedido!
```

**Exemplo de entrada e saída — conta bloqueada:**

```text
Digite sua senha: 1111
Senha incorreta. Você tem 2 tentativas restantes.
Digite sua senha: 2222
Senha incorreta. Você tem 1 tentativa restante.
Digite sua senha: 3333
Conta bloqueada temporariamente.
```

[Ver solução](src/Ex06MonitorandoTentativasDeLogin.java)

---

## 🏋️ Desafio 07: Pedindo um nome válido

Um sistema de cadastro exige que os usuários informem um nome válido. O nome
deverá ter pelo menos 3 caracteres. Crie um programa que continue pedindo um
nome até que o usuário insira um valor válido.

**Exemplo de entrada:**

```text
Digite seu nome:
Nome inválido. Digite novamente.
Digite seu nome: A
Nome inválido. Digite novamente.
Digite seu nome: Ana
```

**Saída esperada:**

```text
Nome "Ana" cadastrado com sucesso!
```

[Ver solução](src/Ex07PedindoUmNomeValido.java)

---

## 🏋️ Desafio 08: Contando números positivos e negativos

Ana é professora de matemática e quer contar quantos números positivos e
negativos existem em uma sequência. Crie um programa que permita inserir vários
números, um por vez, e pare quando o texto `fim` for digitado.

**Exemplo de entrada:**

```text
Digite um número (ou 'fim' para encerrar): 3
Digite um número (ou 'fim' para encerrar): -1
Digite um número (ou 'fim' para encerrar): 7
Digite um número (ou 'fim' para encerrar): fim
```

**Saída esperada:**

```text
Números positivos: 2
Números negativos: 1
```

[Ver solução](src/Ex08ContandoNumerosPositivosENegativos.java)

---

## 🏋️ Desafio 09: Pulando números que terminam em 5

Gustavo está desenvolvendo um jogo educativo de matemática e deseja exibir os
números de 1 até um valor definido pelo usuário, ignorando aqueles que terminam
em 5. Para saber se um número termina em 5, divida-o por 10 e verifique se o
resto da divisão é 5.

**Exemplo de entrada:**

```text
Digite um número: 20
```

**Saída esperada:**

```text
1 2 3 4 6 7 8 9 10 11 12 13 14 16 17 18 19 20
```

[Ver solução](src/Ex09PulandoNumerosQueTerminamEm5.java)

---

## 🏋️ Desafio 10: Sistema de controle de acesso a convidados

Maria está preparando um evento de aniversário e quer organizar a lista de
convidados. Crie um programa que:

- exiba a lista de convidados quando o usuário digitar `ver`;
- adicione novos nomes caso ainda não estejam na lista;
- informe quando o nome já tiver sido registrado;
- permita adicionar nomes até o usuário digitar `sair`.

**Saída esperada:**

```text
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Ana
Ana foi adicionado à lista de convidados.
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Bruno
Bruno foi adicionado à lista de convidados.
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ana
O nome ana já está na lista de convidados.
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Jaqueline
Jaqueline foi adicionado à lista de convidados.
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ver
Lista atualizada de convidados: [Ana, Bruno, Jaqueline]
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): sair
Programa finalizado.
```

[Ver solução](src/Ex10SistemaDeControleDeAcessoAConvidados.java)
