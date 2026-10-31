# Praticando Java — Strings e Regex

Este módulo contém desafios práticos sobre manipulação de `String`, conversão
de texto, substituição, extração de trechos e validações com expressões
regulares (`Regex`).

---

## 🏋️ Desafio 01: Removendo espaços em branco

Joana está desenvolvendo um sistema de cadastro de usuários e percebeu que
muitos nomes estão sendo cadastrados com espaços em branco no início ou no
final. Crie um programa que receba um nome e exiba o nome sem espaços em branco
no início ou no final.

**Exemplo de entrada:**

```text
Digite o nome:    João Silva
```

**Saída esperada:**

```text
Nome sem espaços: João Silva
```

---

## 🏋️ Desafio 02: Convertendo para maiúsculas e minúsculas

Carlos está desenvolvendo um sistema de relatórios e precisa padronizar o texto
para que todos os títulos estejam em maiúsculas e as descrições em minúsculas.
Faça um programa que receba um texto e exiba o texto em maiúsculas e o texto em
minúsculas.

**Exemplo de entrada:**

```text
Digite o texto: Olá, Mundo!
```

**Saída esperada:**

```text
Texto em maiúsculas: OLÁ, MUNDO!
Texto em minúsculas: olá, mundo!
```

---

## 🏋️ Desafio 03: Substituindo parte de uma `String`

Ana está desenvolvendo um sistema de edição de textos e precisa substituir uma
palavra específica por outra em um texto. Crie um programa que receba um texto,
uma palavra a ser substituída e uma nova palavra, e exiba o texto com as
substituições realizadas.

Se a palavra a ser substituída não for encontrada no texto, o programa deve
informar ao usuário que a palavra não foi encontrada e encerrar a execução.

**Exemplo de entrada:**

```text
Digite o texto: O gato caça o rato.
Digite a palavra a ser substituída: gato
Digite a nova palavra: cachorro
```

**Saída esperada:**

```text
Texto modificado: O cachorro caça o rato.
```

---

## 🏋️ Desafio 04: Extraindo parte de uma `String`

Pedro está desenvolvendo um sistema de processamento de arquivos e precisa
extrair o nome do arquivo sem a extensão. Crie um programa que receba o nome de
um arquivo e exiba o nome sem a extensão.

**Exemplo de entrada:**

```text
Digite o nome do arquivo: relatorio_final.pdf
```

**Saída esperada:**

```text
Nome do arquivo sem extensão: relatorio_final
```

---

## 🏋️ Desafio 05: Verificando se uma `String` contém uma substring

Laura está desenvolvendo um sistema de busca e precisa verificar se uma palavra
específica está presente em um texto. Crie um programa que receba um texto e
uma palavra, e exiba uma mensagem indicando se a palavra está presente no
texto.

**Exemplo de entrada:**

```text
Digite o texto: O gato caça o rato.
Digite a palavra: gato
```

**Saída esperada:**

```text
A palavra "gato" está presente no texto.
```

---

## 🏋️ Desafio 06: Formatando números

Roberto está desenvolvendo um sistema de relatórios financeiros e precisa
formatar valores monetários com duas casas decimais. Construa um programa que
receba um valor monetário e exiba o valor formatado com duas casas decimais.

**Exemplo de entrada:**

```text
Digite o valor: 19,9876
```

**Saída esperada:**

```text
Valor formatado: R$ 19,99
```

---

## 🏋️ Desafio 07: Validando códigos de referência

Pedro está desenvolvendo um sistema de controle de produtos e precisa verificar
se os códigos de referência dos produtos seguem o formato correto. O formato do
código de referência é composto por:

- 3 letras maiúsculas;
- um hífen;
- 4 dígitos numéricos.

Crie um programa que receba um código de referência e informe se ele está no
formato correto.

**Exemplo de entrada:**

```text
Digite o código de referência: ABC-1234
```

**Saída esperada:**

```text
O código de referência está válido.
```

---

## 🏋️ Desafio 08: Validando CPF

Roberto está desenvolvendo um sistema de cadastro de clientes e precisa validar
os números de CPF fornecidos. Crie um programa que receba um CPF e exiba uma
mensagem indicando se o CPF está no formato válido (`XXX.XXX.XXX-XX`).

**Exemplo de entrada:**

```text
Digite o CPF: 123.456.789-09
```

**Saída esperada:**

```text
O CPF 123.456.789-09 está no formato válido.
```

---

## 🏋️ Desafio 09: Extraindo hashtags de um texto

Patrícia está desenvolvendo um sistema de análise de redes sociais e precisa
extrair todas as hashtags de um texto. Crie um programa que receba um texto e
exiba todas as palavras que começam com `#`.

**Exemplo de entrada:**

```text
Digite o texto: Olá #mundo! Estou aprendendo #Java e #programação.
```

**Saída esperada:**

```text
Hashtags encontradas: #mundo, #Java, #programação
```

---

## 🏋️ Desafio 10: Validando senhas com Regex

Carla está desenvolvendo um sistema de cadastro de usuários e precisa validar
as senhas. A senha deve ter pelo menos:

- 8 caracteres;
- uma letra maiúscula;
- uma letra minúscula;
- um número;
- um caractere especial.

Crie um programa que receba uma senha e exiba uma mensagem indicando se ela é
válida ou não.

**Exemplo de entrada:**

```text
Digite a senha: Senha123!
```

**Saída esperada:**

```text
A senha é válida.
```