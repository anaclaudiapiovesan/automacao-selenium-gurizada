#language: pt
#encoding: utf-8

Funcionalidade: Testar a página de componentes

  Cenario: Testar a escrita em um textfield
    Dado Abrir a página de componentes
    Quando Informar valor ao textfield
    Entao Deve validar o conteúdo do textfield