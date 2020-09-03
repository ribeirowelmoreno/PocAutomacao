#language: pt

  @login
  Funcionalidade: Fazer login
    Como um consumidor
    Wellynton quer fazer login no site de compras

    @login-valido
    Cenario: Fazer login com um usuário válido
      Dado que ele tenha clicado no botão sign in
      Quando inserir um e-mail e senha válido
      E pressionar o botão de logar
      Então deve ser logado com sucesso
