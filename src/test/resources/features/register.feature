#language: pt
Funcionalidade: Cadastro na pagina register

  @register
  Cenario: Registrar dados
    Dado que esteja na pagina "http://demo.automationtesting.in/Register.html"
    Quando preencho os dados pessoais com
      | firstName | Adam                   |
      | lastName  | Luchini                |
      | address   | rua mauro              |
      | email     | adamvinicius@gmail.com |
      | phone     |              119892541 |
      | gender    | Male                   |
    Quando preencho os dados preferenciais do usuario com
      | hobby    | Cricket    |
      | hobby2   | Movies     |
      | language | Portuguese |
      | skill    | Java       |
      | country  | Brazil     |
      | country2 | Japan      |
    Quando preencho os dados login do usuario com
      | year      |       1988 |
      | month     | October    |
      | day       |         12 |
      | password  | adam       |
      | cpassword | adam       |
      | file      | modelo.png |
