# 🏢 Sistema de Avaliação de Desempenho e Bônus Corporativo

## 🎯 O que o projeto faz?

O sistema automatiza a análise de elegibilidade de recursos humanos de uma empresa de tecnologia. O usuário informa os dados de um colaborador (**Nome**, **Salário**, **Tempo de Empresa** e **Nota de Performance**). O programa processa essas informações, realiza conversões automáticas de tempo, calcula o reajuste salarial baseado em metas corporativas e define o **status final de promoção** do funcionário.

### 🔄 Fluxo da Aplicação
```text
[ Dados do Funcionário ] ➔ [ Tratamento do Tempo ] ➔ [ Cálculo do Bônus ] ➔ [ Análise de Promoção ] ➔ [ Extrato Gerado ]
```

---

## 🎨 Design do Código (Como as regras conversam)

Este projeto foi construído utilizando uma estrutura lógica sequencial com **Estruturas de Decisão Encadeadas** e expressões condicionais otimizadas. Veja como o fluxo de tomada de decisão foi desenhado de forma limpa:

```text
       ┌────────────────────────┐
       │   Leitura de Dados     │ (Console Input via Scanner)
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │  Tratamento de Tempo   │ (Converte meses para anos se necessário)
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │ Verificação de Desempenho│ (Filtros baseados em Nota e Anos de Empresa)
       └───────────┬────────────┘
                   │
                   ▼
       ┌────────────────────────┐
       │  Operador Ternário     │ (Avaliação rápida de Promoção Imediata)
       └────────────────────────┘
```

### 📋 Mapeamento de Variáveis e Estruturas

| Estrutura / Variável | O que ela faz no código? |
| :--- | :--- |
| 🚀 `aplication.java` | Classe principal que gerencia o fluxo de entrada, processamento de dados do RH e exibição dos resultados. |
| 👤 `name` | String que armazena o nome completo do funcionário avaliado. |
| 💰 `salarioAtual` | Armazena o salário inicial e recebe cumulativamente o valor após o cálculo do bônus corporativo. |
| ⏳ `anosDeEmpresa` | Armazena o tempo final calculado em anos, usado como métrica de senioridade e estabilidade. |
| 🏅 `notaPerformance` | Inteiro de 1 a 5 que determina o peso do desempenho do funcionário na regra de negócio. |

---

## 🧠 Conceitos de Programação Praticados

* **Flexibilidade na Entrada de Dados:** Uso de validação textual com `.equalsIgnoreCase()` para aceitar entradas em "Meses", "M" ou "Anos" sem quebrar o fluxo.
* **Lógica Condicional Encadeada:** Aplicação de blocos `if / else if / else` combinando operadores lógicos (`&&` e `||`) para validação de faixas salariais e bônus.
* **Operadores Compactos (Ternários):** Uso de sintaxe inline `(condicao) ? valor1 : valor2` para determinar o status da promoção de forma limpa e econômica.

---

## 💻 Exemplo Prático de Uso

Imagine a seguinte simulação rodando direto no terminal corporativo:

```text
Insira o nome do funcionário: 
Alex Green
Qual o salário do Funcionário: 
5000.00
Insira o tempo que o funcionário tem na empresa: 
36 Meses
insira a nota do funcionario: 
5

----- Resultado da Busca -----
Nome: Alex Green
Novo Salário: 6000.0
Status da Promocão: Promovido
```
