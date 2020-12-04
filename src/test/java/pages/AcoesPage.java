package pages;

import java.io.IOException;

import core.Driver;
import maps.AcoesMap;

public class AcoesPage {
	private AcoesMap acoesMap = new AcoesMap();
		
	public void preenchePesquisa(CharSequence... valores) {
		acoesMap.inpPesquisa.sendKeys(valores);
	}
	
	public String getValorAcao() throws IOException {
		Driver.printScreen("Valor Acao");
		return acoesMap.spValor.getText();
		
	}
	
	
}
