package Suite;

import Suite.All.Page3Test;
import Suite.All.Page4Test;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

public class RunnerTest {
    public static void main(String[] args) {
        Launcher launcher = LauncherFactory.create();

        // Create a summary listener to capture the test execution results
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        // Create a launcher discovery request with your test classes
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(
                        DiscoverySelectors.selectClass(Page3Test.class),
                        DiscoverySelectors.selectClass(Page4Test.class)
                )
                .build();

        // Execute the tests using the launcher and listener
        launcher.execute(request, listener);

        // Get the test execution summary
        TestExecutionSummary summary = listener.getSummary();

        // Access the test results from the summary
        int totalTests = (int) summary.getTestsFoundCount();
        int successfulTests = (int) summary.getTestsSucceededCount();
        int failedTests = (int) summary.getTestsFailedCount();
        int abortedTests = (int) summary.getTestsAbortedCount();
        // You can access more information from the summary as needed

        // Print the test results
        System.out.println("Total tests: " + totalTests);
        System.out.println("Successful tests: " + successfulTests);
        System.out.println("Failed tests: " + failedTests);
        System.out.println("Aborted tests: " + abortedTests);

        LauncherDiscoveryRequest CreateArtistRequestBuilder = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(
                        DiscoverySelectors.selectClass(Page4Test.class),
                        DiscoverySelectors.selectClass(Page3Test.class)
                )
                .build();

        // Execute the tests using the launcher and listener
        launcher.execute(CreateArtistRequestBuilder, listener);

        // Get the test execution summary
        TestExecutionSummary createArtistSummary = listener.getSummary();

        // Access the test results from the summary
        int createArtistTotalTests = (int) createArtistSummary.getTestsFoundCount();
        int createArtistSuccessfulTests = (int) createArtistSummary.getTestsSucceededCount();
        int createArtistFailedTests = (int) createArtistSummary.getTestsFailedCount();
        int createArtistAbortedTests = (int) createArtistSummary.getTestsAbortedCount();
        // You can access more information from the summary as needed

        // Print the test results
        System.out.println("Total tests: " + createArtistTotalTests);
        System.out.println("Successful tests: " + createArtistSuccessfulTests);
        System.out.println("Failed tests: " + createArtistFailedTests);
        System.out.println("Aborted tests: " + createArtistAbortedTests);

    }
}


