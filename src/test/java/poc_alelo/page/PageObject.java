package poc_alelo.page;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject{
	
	protected WebDriver driver;
	public static final int WAIT_TIMEOUT = 15;
	
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		/**
		 * Preenchimento de forms
		 * @param byElement
		 * @param valor
		 */
		
		protected void typeInputs(WebElement element,String valor) {
			element.clear();
			element.sendKeys(valor);
		}
				
		protected WebElement waitVisible(WebElement byElement) {
			WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT);
			return wait.until(ExpectedConditions.visibilityOf(byElement));
		}		
		
		public void alterar_aba(int posicao) {
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(posicao));
		}    
      
}
