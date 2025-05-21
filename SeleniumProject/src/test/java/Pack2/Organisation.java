package Pack2;

import org.testng.annotations.Test;

public class Organisation {
@Test
	public void OrganisationTest() {
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser", "chrome");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	System.out.println( URL );
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
	System.out.println("execute CreateOrganisation Test");
	
}
@Test
public void VerifyOrganisationTest() {
System.out.println("execute ModifyOrganisation Test");
}
	
}