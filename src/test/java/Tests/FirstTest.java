package Tests;
import org.testng.annotations.Test;

import Pages.CareerPage;
import Pages.HomePage;

public class FirstTest extends BaseTest {

		@Test
		public void test1(){
		
		setup();
		
		HomePage home = new HomePage(driver);
        CareerPage career = new CareerPage(driver);

        home.clickAgree();
        home.navigateToCareer();

        career.openPeopleTab();
        career.openTwoInternArticle();
        career.scrollThroughArticle();

        career.goBack();
        career.openJobsOpenings();

        String text = career.getJobCVText();
        System.out.println(text);
        
        quit();
	}
}
