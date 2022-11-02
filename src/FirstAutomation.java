import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     driver.get("http://127.0.0.1:5501/index.html/index.html");
	}

}
