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

	public void setFirstName(String firstName) {
		registerMap.inpFirstName.sendKeys(firstName);
		
	}

	public void setLastName(String lastName) {
		registerMap.inpLastName.sendKeys(lastName);
		
	}

	public void setAddress(String address) {
		registerMap.inpAddress.sendKeys(address);
	}

	public void setEmail(String email) {
		registerMap.inpEmail.sendKeys(email);
	}

	public void setPhone(String phone) {
		registerMap.inpPhone.sendKeys(phone);
	}

	public void selectSkill(String skill) {
		registerMap.dropSkils.selectText(skill);
	}

	public void selectCountry(String country) {
		registerMap.dropCountries.selectText(country);
	}

	public void selectCountry2(String country) {
		registerMap.dropCountry.selectText(country);
	}

	public void selectYear(String year) {
		registerMap.dropYear.selectText(year);
	}

	public void selectMonth(String month) {
		registerMap.dropMonth.selectText(month);
	}

	public void selectDay(String day) {
		registerMap.dropDay.selectText(day);
	}

	public void setPassword(String password) {
		registerMap.inpPassword.sendKeys(password);
	}

	public void setConfirmPassword(String password) {
		registerMap.inpConfirmPassword.sendKeys(password);
	}

	public void setFile(String path) {
		registerMap.inpFile.sendKeys(path);
	}
	
	
}
