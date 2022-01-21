package ruuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="Feature",
    glue="Steps"//path of the step definition file
	//tags="@scenario2"	
	)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
//==============================================================================================================
//This for run with Junit

//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class) //this for Junit
//@CucumberOptions(features="Feature",
//glue="Steps"//path of the step definition file
////tags="@scenario2"	
//)
//public class TestRunner{
//
//
//}