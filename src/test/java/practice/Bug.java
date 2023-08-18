package practice;

import org.testng.annotations.Test;

public class Bug {

	@Test(groups="Smoke")
	public void error()
	{
		System.out.println("---error is cleared--");
	}
}
