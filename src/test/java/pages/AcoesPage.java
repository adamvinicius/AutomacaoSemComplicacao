package pages;

import maps.AcoesMap;

public class AcoesPage {
	private AcoesMap acoesMap = new AcoesMap();
		
	public void preenchePesquisa(CharSequence... valores) {
		acoesMap.inpPesquisa.sendKeys(valores);
	}
	
	public String getValorAcao() {
		return acoesMap.spValor.getText();
	}
	
	
}
