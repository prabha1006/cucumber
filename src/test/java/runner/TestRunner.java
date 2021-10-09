package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\FIRE MANI\\eclipse-workspace\\cucumber\\src\\test\\resources\\Features\\login.Feature",glue="stepDef",plugin= {"pretty","html:target/cucumberReport.html","json:src\\test\\resources\\Report\\output.json","junit:target/cucumberjunit.xml"})
public class TestRunner {
@AfterClass
public static void afterClass() {
	String path= System.getProperty("user.dir");
	Reporting.jvmReport(path+"\\src\\test\\Report\\output.json");
}
	
}
