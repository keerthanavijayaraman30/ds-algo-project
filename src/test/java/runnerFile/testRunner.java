
  package runnerFile;
  
  import org.junit.runner.RunWith; import io.cucumber.junit.CucumberOptions;
  import io.cucumber.junit.Cucumber;
  
  @RunWith(Cucumber.class)
  
  @CucumberOptions(features={"src/test/resources/Features/03Login.feature",
		  "src/test/resources/Features/04DS_Intro.feature"},
  glue={"StepDefinitions"}, monochrome = true, plugin =
  {"pretty","html:target/html folder/html reports.html",
  "pretty","json: target/json folder/json reports.json",
  "pretty","junit: target/junit folder/junit reports.xml"}
  ) public class testRunner {
  
  
  
  }
 