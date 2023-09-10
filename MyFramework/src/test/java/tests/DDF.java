package tests;

import java.io.IOException;

import pages.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utis.ReadExcel;

public class DDF extends BaseTest  {
	
	public void verifyErrorMsg() throws IOException {
		LoginPage loginPage = new LoginPage();
		 String[][] data = ReadExcel.getData("resources//TestData.xlsx", "Sheet1");
		 for (int i = 1; i < data.length; i++) {
	   	loginPage.enterLoginDetails = data[i][1];
	   	HomePage homePage = new HomePage();
	   	homePage.clickLoginLink();
	   	
	}
	}
}
