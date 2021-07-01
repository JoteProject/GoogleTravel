package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/Runner",
                "rerun:target/Rerun_Failed/Runner.txt"}
        , glue  = {"steps","hooks"}

        , tags = "@Positive"

        , features = { "src/main/resources/features/searching.feature"}

        , dryRun = false

        , stepNotifications = true

)
public class Runner {
}
