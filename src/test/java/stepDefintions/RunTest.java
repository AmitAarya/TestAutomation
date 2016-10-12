package stepDefintions;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", "json:target/cucumberreports.json"},
        features = "src\\main\\resources\\featureFiles"
        ,glue= "stepDefintions",
        monochrome = false
)
public class RunTest {

}
