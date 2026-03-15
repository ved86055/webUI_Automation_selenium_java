package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class liste implements ITestListener
{
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Test is pass ");
    }
}
