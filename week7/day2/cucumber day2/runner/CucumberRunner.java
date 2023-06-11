package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features",
                 glue="steps",
                 monochrome=true,
                 publish = true,
                 //tags="@Smoke" //execute only smoke scenarios
                  tags="@Smoke or @Regression")//execute either one of the scenario
                 //tags = "not @Smoke" //it will exclude the particular scenario
                 //tags = "@Smoke and @Regression")
public class CucumberRunner extends BaseClass{

}
