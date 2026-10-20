# Praticando Java — Estruturas Condicionais

Este módulo contém desafios práticos sobre estruturas condicionais (`if`,
`else if` e `else`), operadores relacionais e operadores lógicos.

---

## 🏋️ Desafio 01: Verificando se um número é par ou ímpar

Ana precisa identificar se um número é par ou ímpar para um jogo que está
desenvolvendo. Crie um programa que analise o número definido previamente e
exiba o resultado corretamente.

**Saída esperada:**

```text
O número 8 é par.
```

Ou:

```text
O número 7 é ímpar.
```

[Ver solução](src/Ex01VerificandoSeNumeroEParOuImpar.java)

---

## 🏋️ Desafio 02: Verificando aprovação em uma disciplina

Julia é professora e precisa determinar a situação de um aluno. Considere:

- média final maior ou igual a `7.0`: aprovado;
- média entre `5.0` e `6.9`: recuperação;
- média abaixo de `5.0`: reprovado.

Crie um programa que, a partir de uma variável `media`, exiba a situação do
estudante.

**Saídas esperadas:**

```text
O estudante teve média 8.2 e foi aprovado.
```

```text
O estudante teve média 5.8 e está de recuperação.
```

```text
O estudante teve média 4.3 e foi reprovado.
```

[Ver solução](src/Ex02VerificandoAprovacaoEmUmaDisciplina.java)

---

## 🏋️ Desafio 03: Validação de senha

Jéssica precisa verificar o acesso ao sistema interno. Considerando a senha
correta como `123456`, crie um programa que compare a tentativa informada com a
senha predefinida e indique se o acesso foi permitido ou negado.

**Saídas esperadas:**

```text
Digite a senha: 123456
Acesso permitido!
```

```text
Digite a senha: 123
Acesso negado!
```

[Ver solução](src/Ex03ValidacaoDeSenha.java)

---

## 🏋️ Desafio 04: Comparando dois números

Pedro precisa comparar dois números inteiros fornecidos pelo usuário. Crie um
programa que informe qual é o maior ou indique se os dois números são iguais.

**Exemplo de entrada:**

```text
Digite o primeiro número: 10
Digite o segundo número: 25
```

**Saída esperada:**

```text
O maior número é 25.
```

[Ver solução](src/Ex04ComparandoDoisNumeros.java)

---

## 🏋️ Desafio 05: Verificação de desconto em compras

Marcos precisa verificar se um cliente tem direito a um desconto de 10%. O
desconto deve ser aplicado somente quando o valor da compra for maior ou igual
a `R$ 100,00`. Exiba o novo valor após o desconto quando aplicável.

**Com desconto:**

```text
Digite o valor da compra: 120.0
Desconto de 10% aplicado.
Novo valor: R$ 108.0
```

**Sem desconto:**

```text
Digite o valor da compra: 80.0
Nenhum desconto aplicado.
Valor total: R$ 80.0
```

[Ver solução](src/Ex05VerificacaoDeDescontoEmCompras.java)

---

## 🏋️ Desafio 06: Verificação de dia útil

Carlos precisa identificar se um dia da semana é útil. Crie um programa que
receba o dia da semana em letras minúsculas e informe se ele corresponde a um
dia útil, considerando de segunda a sexta-feira.

**Exemplo de entrada:**

```text
Digite o dia da semana (em letras minúsculas): quarta
```

**Saída esperada:**

```text
Quarta é um dia útil.
```

[Ver solução](src/Ex06VerificacaoDeDiaUtil.java)

---

## 🏋️ Desafio 07: Verificando se um número está em um intervalo

Emerson precisa verificar se um valor está dentro do intervalo permitido para
um empréstimo, que vai de `1000` a `5000` reais. Crie um programa que receba o
valor e informe se ele está dentro do intervalo.

**Exemplo de entrada:**

```text
Digite o valor do empréstimo: 750
```

**Saída esperada:**

```text
O valor 750 não está dentro do intervalo permitido para empréstimo.
```

[Ver solução](src/Ex07VerificandoSeNumeroEstaEmUmIntervalo.java)

---

## 🏋️ Desafio 08: Verificação de triângulo

Marcos precisa verificar se três lados podem formar um triângulo. A soma de
quaisquer dois lados deve ser maior que o terceiro lado. Crie um programa que
receba os três lados e informe o resultado.

**Exemplo de entrada:**

```text
Digite o primeiro lado: 3
Digite o segundo lado: 4
Digite o terceiro lado: 5
```

**Saída esperada:**

```text
Os lados podem formar um triângulo.
```

[Ver solução](src/Ex08VerificacaoDeTriangulo.java)

---

## 🏋️ Desafio 09: Verificação de compatibilidade de doação de sangue

Maria precisa verificar se um doador é compatível para doar sangue. O doador
deve ter entre 18 e 65 anos e pesar mais de 50 kg. Crie um programa que receba
a idade e o peso, informe se ele é compatível e indique o critério não atendido
quando necessário.

**Exemplo de entrada:**

```text
Digite a idade do doador: 17
Digite o peso do doador (em kg): 55
```

**Saída esperada:**

```text
O doador não é compatível.
Motivo: Deve ter entre 18 e 65 anos.
```

[Ver solução](src/Ex09CompatibilidadeDeDoacaoDeSangue.java)

---

## 🏋️ Desafio 10: Verificação de código de acesso e nível de permissão

João está desenvolvendo um sistema de segurança. O usuário deve informar o
código correto `2023` e um nível de permissão válido: `1`, `2` ou `3`.

O acesso só deve ser permitido quando o código estiver correto e o nível de
permissão for válido. Caso contrário, informe se o código está incorreto, se o
nível é inválido ou se ambos estão incorretos.

**Exemplo de entrada:**

```text
Digite o código de acesso: 2023
Digite o nível de permissão: 2
```

**Saída esperada:**

```text
Acesso permitido. Bem-vindo ao sistema!
```

[Ver solução](src/Ex10CodigoDeAcessoENivelDePermissao.java)