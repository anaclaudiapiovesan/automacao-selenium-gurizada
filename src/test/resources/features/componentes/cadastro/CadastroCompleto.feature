#language: pt
#encoding: utf-8

Funcionalidade: Testar Cadastro

  Cenario: Testar Cadastro Completo
    Dado Abrir a página de componentes
    Quando Informar nome
    E Informar o sobrenome
    E Informar o sexo feminino
    E Informar comida pizza
    E Informar escolaridade "Mestrado"
    E Informar esportes "Futebol"
    E Clicar em cadastrar
    Entao Deve apresentar cadastrado com sucesso