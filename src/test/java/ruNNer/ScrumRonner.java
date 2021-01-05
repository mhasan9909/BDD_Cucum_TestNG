package ruNNer;



//This for TestNG


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/mdhasan/eclipse-workspace/BDD_Proj/src/test/resources/feature_Sprint/US001.feature", glue = {
		"stepDefination" }, plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt", "usage:target/cucumber.usage.json",
				"junit:target/cucumber-results.xml" }, tags = "@smoke or @Adhoc ")

public class ScrumRonner extends AbstractTestNGCucumberTests {
}


//Runner class with Junit.
//
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(features = "/Users/mdhasan/eclipse-workspace/BDD_Proj/src/test/resources/feature_Sprint/US001.feature", glue = {
//		"stepDefination" }, plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json",
//				"pretty:target/cucumber-pretty.txt", "usage:target/cucumber.usage.json",
//				"junit:target/cucumber-results.xml" }, tags = "@smoke")
//
//public class ScrumRonner {
//}
