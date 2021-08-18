package poc_alelo.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", 
		"html:target/cucumber-html-report",
        "json:target/cucumber.json"}, 
		features = {"."},
		glue = "classpath:src/test/java")
public class RunCukesTest {
    @BeforeClass
    public static void setUpSuite() {
        System.setProperty("test.window", "true");
    }
    
//    @AfterClass
//	public static void Sair() throws Throwable {
//    	BaseTeste sair = new BaseTeste();
//    	//sair.tearDown();
//	}
}
