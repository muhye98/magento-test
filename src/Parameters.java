import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	static WebDriver driver = new ChromeDriver();

	Random rand = new Random ();
	int RandomEmail=rand.nextInt(999);
	int randomPassoward = rand.nextInt(99999999);

	static String WebsiteUrl = "https://magento.softwaretestingboard.com/";
	static String signUpPage = "https://magento.softwaretestingboard.com/customer/account/create/";
	static String logOutPage = "https://magento.softwaretestingboard.com/customer/account/logout/";
	static String loginPage = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/";

	static String[] FirstNameArray = { "ahmed", "jamal", "khaled", "jaber", "Osama" };
	static String[] LastNameArray = { "Khalel", "Sami", "Raid", "Mohammed", "Mahmmud" };
	
	int randomIndex = rand.nextInt(5);
	
	String firstName = FirstNameArray[randomIndex];
	String lastNames = LastNameArray[randomIndex];
	String EmailFinal = firstName+lastNames+RandomEmail+"@gmail.com";
	String FinalPassoward = "M##$"+ randomPassoward + "m@!#" ;

}
