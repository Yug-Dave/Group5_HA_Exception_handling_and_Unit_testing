package capstoneProject;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("your.package.name")
public class TestSuite {
    // This will automatically include all tests in the specified package
}

