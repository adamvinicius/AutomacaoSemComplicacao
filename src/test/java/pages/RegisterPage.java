package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Element;
import enums.ByValue;
import maps.RegisterMap;

public class RegisterPage {
	RegisterMap registerMap = new RegisterMap();
	
	public void clickGender(String gender) {
		Element inpGender = new Element(ByValue.css, "input[value='"+gender+"']");
		inpGender.click();
	}
	
	public void clickHobbies(String hobby) {
		Element inpHoobbies = new Element(ByValue.css, "input[value='"+hobby+"']");
		inpHoobbies.click();
	}
	
	public void selectLanguage(String language) {
		registerMap.divLanguages.click();
		List<WebElement> listLanguages = registerMap.liLanguages.createElements();
		
		for (WebElement liLanguage : listLanguages) {
			WebElement aLanguage = liLanguage.findElement(By.cssSelector("a"));
			if (aLanguage.getText().equals(language)) {
				liLanguage.click();
				break;
			}
		}
	}
}
