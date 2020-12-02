#language:pt
@exibirValoresAcoes
Funcionalidade: Exibir valores de acoes

  Contexto: 
  	Dado que esteja na pagina "https://www.google.com.br"
  	Quando pesquiso a acao "ITSA4", exibo e valido o resultado

	@buscaAcaoUnicoPasso
	Cenario: Buscar acao no google passo unico
		Quando pesquiso a acao "ITSA4", exibo e valido o resultado
		

 