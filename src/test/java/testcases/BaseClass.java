package testcases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	
	
	
	
	@BeforeClass
	@Parameters({"os","browser"})
	void setUp(String os,String br) throws IOException {
		
		FileReader file = new FileReader("./src//test//resources//config.properties");
		prop=new Properties();
		prop.load(file);
		
		
		
		
		
		switch (br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		case "firefox":driver = new FirefoxDriver(); break;
		default: System.out.println("invalid brower"); return;
		
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}

}
