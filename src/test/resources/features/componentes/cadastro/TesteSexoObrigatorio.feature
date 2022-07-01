#language: pt
#encoding: utf-8

Funcionalidade: Testar cadastro

  Cenario: Testar Sexo Obrigatório
    Dado Abrir a página de cadastro
    Quando Informar nome
    E Informar o sobrenome
    E Clicar em cadastrar
    Entao Deve apresentar mensagem "Sexo eh obrigatorio"