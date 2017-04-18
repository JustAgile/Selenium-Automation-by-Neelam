package catalog.Automation.tests;

import org.testng.annotations.DataProvider;

public class TestData {
	

	public static class testdata {

		@DataProvider(name = "test1")
		public static Object[][] createData1() {
		 return new Object[][] {
		   { "ecalix@test.com", "test123"},
		   { "ecalix@test.com", "test123"},
		 };
		}

		
	}

}
