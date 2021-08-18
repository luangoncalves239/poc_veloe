package poc_alelo.page;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetornoCep extends PageObject {
	
	@FindBy (id="mensagem-resultado")
	WebElement tituloBusca;
	
	@FindBy (css="#resultado-DNEC > tbody > tr")
	List<WebElement>  listaEnderecos;
	
	
	public RetornoCep(WebDriver driver) {
		super(driver);
	}
	
	public void validaBusca() {
		waitVisible(tituloBusca);					
		for (WebElement webElement : listaEnderecos) {
			System.out.println("Endereço retornado da busca: " + webElement.getText());
		}
	}
}
