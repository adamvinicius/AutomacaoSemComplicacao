package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.AcoesPage;

public class AcoesSteps {

	private String acao;
	private AcoesPage acoesPage = new AcoesPage();

	@Quando("preencho o campo pesquisa com {string}")
	public void preenchoOCampoPesquisaCom(String acao) {
		this.acao = acao;
		acoesPage.preenchePesquisa(acao);
	}

	@Quando("envio a tecla Enter")
	public void envioATeclaEnter() {
		acoesPage.preenchePesquisa(Keys.ENTER);
	}

	@Entao("exibe o valor da acao")
	public void exibeOValorDaAcao() {
		System.out.println(acao + " o valor atual: R$" + acoesPage.getValorAcao());
		// 11,04
		// {"11","04"}

		String[] valores = acoesPage.getValorAcao().split(",");
		assertEquals("Casas decimais esperadas:", 2, valores[1].length());
	}

	@Quando("pesquiso a acao {string}, exibo e valido o resultado")
	public void pesquisoAAcaoExiboEValidoOResultado(String acao) {
		preenchoOCampoPesquisaCom(acao);
		envioATeclaEnter();
	}

	@Quando("preencho o campo pesquisa com {string} e envio a tecla Enter")
	public void preenchoOCampoPesquisaComEEnvioATeclaEnter(String acao) {
		this.acao = acao;
		acoesPage.preenchePesquisa(acao, Keys.ENTER);
	}

}
