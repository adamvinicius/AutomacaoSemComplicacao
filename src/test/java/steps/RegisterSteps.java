package steps;

import java.util.Map;

import io.cucumber.java.pt.Quando;
import pages.RegisterPage;

public class RegisterSteps {
	RegisterPage registerPage = new RegisterPage();

	@Quando("preencho os dados pessoais com")
	public void preenchoOsDadosPessoaisCom(Map<String, String> map) {
		registerPage.setFirstName(map.get("firstName"));
		registerPage.setLastName(map.get("lastName"));
		registerPage.setAddress(map.get("address"));
		registerPage.setEmail(map.get("email"));
		registerPage.setPhone(map.get("phone"));
		registerPage.clickGender(map.get("gender"));
	}

	@Quando("preencho os dados preferenciais do usuario com")
	public void preenchoOsDadosPreferenciasDoUsarioCom(Map<String, String> map) {
		registerPage.clickHobbies(map.get("hobby"));
		registerPage.clickHobbies(map.get("hobby2"));
		registerPage.selectLanguage(map.get("language"));
		registerPage.selectSkill(map.get("skill"));
		registerPage.selectCountry(map.get("country"));
		registerPage.selectCountry2(map.get("country2"));
	}
	
		@Quando("preencho os dados login do usuario com")
		public void preenchoOsDadosLoginDoUsuarioCom(Map<String, String> map) {
		    registerPage.selectYear(map.get("year"));
		    registerPage.selectMonth(map.get("month"));
		    registerPage.selectDay(map.get("day"));
		    registerPage.setPassword(map.get("password"));
		    registerPage.setConfirmPassword(map.get("cpassword"));
		    String path = System.getProperty("user.dir")+"\\imgs\\"+map.get("file");
		    registerPage.setFile(path);
		    
		}




}
