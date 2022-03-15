package Demo;

import org.testng.annotations.Test;

public class ReadDataArguementsTest {
	@Test
	public void demo()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		
		String URL = System.getProperty("url");
		System.out.println(URL);
		
		String username = System.getProperty("userName");
		System.out.println(username);
		
		String password = System.getProperty("password");
		System.out.println(password);
	}
}
