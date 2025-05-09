# 💰 desafios_p2_02 — Sistema Bancário com Múltiplas Contas

## Descrição

Este desafio é uma continuação do sistema bancário simples, com a introdução de **múltiplas contas bancárias** e regras específicas de operação.

O programa agora gerencia **5 contas bancárias**, identificadas pelos índices de **0 a 4**, e permite que o usuário realize as seguintes operações para cada conta:

- **1 – Depositar**
- **2 – Sacar**
- **3 – Consultar saldo**

A **conta de índice 0** possui uma regra especial: ao realizar saques, será aplicada uma **taxa adicional de 1%** sobre o valor sacado.

## Regras do Programa

- Ao iniciar, o programa solicita o **índice da conta** (de 0 a 4) a ser acessada.
- Em seguida, é exibido um menu para que o usuário escolha o tipo de operação.
- Após a operação (ou tentativa), o menu é exibido novamente.
- A execução continua até que o usuário digite um número menor ou igual a **zero**, encerrando o programa.
- **Qualquer valor de operação diferente de 1, 2 ou 3 será ignorado.**
- O programa também deve tratar corretamente os casos de **saques inválidos**, como valor maior que o saldo disponível.

## Objetivos

- Praticar estruturas de repetição e decisão.
- Utilizar listas (ou arrays) para gerenciar múltiplas contas.
- Implementar regras específicas para determinadas contas.
- Trabalhar com menus interativos e validação de entrada.