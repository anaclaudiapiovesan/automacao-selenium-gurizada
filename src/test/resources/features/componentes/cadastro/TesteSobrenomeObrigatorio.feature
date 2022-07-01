#language: pt
#encoding: utf-8

Funcionalidade: Testar cadastro

  Cenario: Testar Sobrenome Obrigatório
    Dado Abrir a página de cadastro
    Quando Informar nome
    E Clicar em cadastrar
    Entao Deve apresentar mensagem "Sobrenome eh obrigatorio"