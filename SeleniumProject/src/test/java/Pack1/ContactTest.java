package Pack1;

import org.testng.annotations.Test;

public class ContactTest {
@Test
	public void ContactTest() {
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser", "chrome");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	System.out.println( URL );
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println("execute CreateContact Test");
	
}
@Test
public void ModifyContactTest() {
System.out.println("execute CreateContact Test");
}
	
}