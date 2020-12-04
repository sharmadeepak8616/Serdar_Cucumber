import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    // path of the feature files
    features = {"src/main/resources/features/"},

    // Specify the step definition package
    glue = {"StepDefinition", "Driver"},

    // create cucumber reports
    plugin = {"pretty", "html:Reports/Default/"},

    snippets = SnippetType.CAMELCASE,

    tags = {"@sanity"},

    monochrome = true
)
public class TestRunner {
}
