package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;





public class DashboardTest extends BaseTest
{
	
	@Test
	public void verifySearchField() throws Exception
	{
		dsh.searchShare();
	}

}