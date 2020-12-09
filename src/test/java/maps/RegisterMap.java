package maps;

import core.Element;
import enums.ByValue;

public class RegisterMap {
	public Element h2Titulo = new Element("h2");
	public Element inpFirstName = new Element("input[ng-model='FirstName']");
	
	public Element inpLastName = new Element("input[ng-model='LastName']");
	public Element inpAddress = new Element("textarea");
	public Element inpEmail = new Element("input[type='email']");
	public Element inpPhone = new Element("input[type='tel']");
	public Element divLanguages = new Element("#msdd");
	
	public Element liLanguages = new Element("li.ng-scope");
	public Element dropSkils = new Element("#Skills");
	public Element dropCountries = new Element(ByValue.css, "#countries");
	public Element dropCountry = new Element(ByValue.css, "#country");
	public Element dropYear = new Element(ByValue.css, "select[ng-model='yearbox']");
	public Element dropMonth = new Element(ByValue.css, "div:nth-child(3) > select");
	public Element dropDay = new Element("//div[3]/select");
	public Element inpPassword = new Element(ByValue.css, "input[ng-model='Password']");
	public Element inpConfirmPassword = new Element(ByValue.css, "input[ng-model='CPassword']");
	public Element inpFile = new Element(ByValue.css, "input[onchange='uploadimg()']");
	public Element btnSubmit = new Element(ByValue.name, "signup");
	
	
	
	
	
	
	
	
	//Element h2Titulo = new Element(ByValue.css, "h2");
}
