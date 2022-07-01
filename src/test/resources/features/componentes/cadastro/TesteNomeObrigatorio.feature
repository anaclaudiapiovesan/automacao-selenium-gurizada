#language: pt
#encoding: utf-8

Funcionalidade: Testar cadastro

  Cenario: Testar Nome Obrigatório
    Dado Abrir a página de cadastro
    Quando Clicar em cadastrar
    Entao Deve apresentar mensagem "Nome eh obrigatorio"