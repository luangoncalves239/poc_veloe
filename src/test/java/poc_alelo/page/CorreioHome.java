package poc_alelo.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorreioHome extends PageObject {	
	
	@FindBy (css="#menu-content > div > div > div.logo-correios")
	WebElement logoHome;
	
	@FindBy (id="relaxation")
	WebElement inputCep;

	public CorreioHome(WebDriver driver) {
		super(driver);
	}
	
	public void carregarHome() {
		waitVisible(logoHome);
	}
	
	public void pesquisarCep(String cep) {
		typeInputs(inputCep, cep);
		inputCep.sendKeys(Keys.ENTER);
		alterar_aba(1);
	}	
	
	public final RetornoCep acessarRetornoBusca() {
		return new RetornoCep(driver);
	}
	
}
