package poc_alelo.steps;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import poc_alelo.page.CorreioHome;
import poc_alelo.page.RetornoCep;

public class correio_steps {
	
	String url;
	WebDriver driver;
	
	CorreioHome home;
	RetornoCep retornoCep;
	
	@Before
	public void setUP() {
		url = "https://www.correios.com.br/";
        File file = new File("src\\main\\resources\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();        
        home = new CorreioHome(driver);               
	}	
	
	@After
	public void sair(){
		driver.quit();
		
	}

	@Dado("^que estou na home$")
	public void que_o_envio_foi_correto() throws Throwable {
		driver.get(url);
	}
	
	@Quando("^preeencher no campo de busca o valor \"(.*?)\"$")
	public void cep_desejado_na_opcao_de_busca(String buscaDesejada) throws Throwable {
		home.pesquisarCep(buscaDesejada);
	}
		
	@Entao("^deve me retorna as informacoes do cep consultado$")
	public void retorna_cep_consultado() throws Throwable {
		retornoCep = home.acessarRetornoBusca();
		retornoCep.validaBusca();
	}
}
