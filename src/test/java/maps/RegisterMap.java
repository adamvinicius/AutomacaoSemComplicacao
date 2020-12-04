package maps;

import core.Element;
import enums.ByValue;

public class RegisterMap {
	public Element h2Titulo = new Element(ByValue.css, "h2");
	public Element inpFirstName = new Element(ByValue.css, "input[ng-model='FirstName']");
	
	public Element inpLastName = new Element(ByValue.css, "input[ng-model='LastName']");
	public Element inpAddress = new Element(ByValue.css, "textarea");
	public Element inpEmail = new Element(ByValue.css, "input[type='email']");
	public Element inpPhone = new Element(ByValue.css, "input[type='tel']");
	public Element divLanguages = new Element(ByValue.id, "msdd");
	
	public Element liLanguages = new Element(ByValue.css, "li.ng-scope");
	//Element h2Titulo = new Element(ByValue.css, "h2");
	//Element h2Titulo = new Element(ByValue.css, "h2");
}
