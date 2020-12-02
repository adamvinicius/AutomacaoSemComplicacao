#language:pt
@exibirValoresAcoes
Funcionalidade: Exibir valores de acoes

  Contexto: 
  	Dado que esteja na pagina "https://www.google.com.br"

	@buscaAcaoUnicoPasso
	Cenario: Buscar acao no google passo unico
		Quando pesquiso a acao "ITSA4", exibo e valido o resultado

  @buscaAcaoItau @buscaAcao
  Cenario: Buscar acao no google
    Quando preencho o campo pesquisa com "ITSA4" e envio a tecla Enter
    Entao exibe o valor da acao

  @buscaAcaoMovida @buscaAcao
  Cenario: Buscar acao no google
    Quando preencho o campo pesquisa com "MOVI3"
    E envio a tecla Enter
    Entao exibe o valor da acao

  @EsquemaAcoes
  Esquema do Cenario: <cenario>
    Quando preencho o campo pesquisa com "<acoes>"
    E envio a tecla Enter
    Entao exibe o valor da acao

    Exemplos: 
      | cenario          | acoes |
      | busca acao ITSA4 | ITSA4 |
 #     | busca acao MOVI3 | MOVI3 |
 #     | busca acao OIBR3 | OIBR3 |
 #     | busca acao PETR3 | PETR3 |
 #     | busca acao MGLU3 | MGLU3 |
