package Runner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenerClass implements ITestListener {

    private static ExtentReports extent;

    private static ExtentTest test;
 
    @Override

    public void onStart(ITestContext context) {

    	ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\keerthivasan.v1\\eclipse-workspace\\E_Commerce_Testing\\Extended_Reports");

        extent = new ExtentReports();

        extent.attachReporter(reporter);

    }
 
    @Override

    public void onTestStart(ITestResult result) {

    	System.out.println("Execution of test ["+result.getName()+"]Started");

        test = extent.createTest(result.getMethod().getMethodName());

    }
 
    @Override

    public void onTestSuccess(ITestResult result) {

    	System.out.println("Execution of test ["+result.getName()+"] ended");
 
        test.pass("Test Passed");

    }
 
    @Override

    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

    }
 
    @Override

    public void onTestSkipped(ITestResult result) {

        test.skip("Test Skipped");

    }
 
    @Override

    public void onFinish(ITestContext context) {

        extent.flush();

    }

}

 