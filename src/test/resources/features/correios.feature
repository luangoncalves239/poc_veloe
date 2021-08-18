# language: pt
Funcionalidade: POC veloe

  @pocASX
  Esquema do Cenario: Validar o arquivo de envio do processo de liquidacao para o SEC
    Dado que estou na home
    Quando preeencher no campo de busca o valor "<endereco>"
    Entao deve me retorna as informacoes do cep consultado

    Exemplos: 
      | endereco  |
      |  06810790 |
      | rua teste |
