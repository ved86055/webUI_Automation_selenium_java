package Practise.TestNg;

import org.testng.annotations.Test;

public class HomeLoan
{
    @Test
    public void HomeLoginDemo()
    {

        System.out.println("HomeLoginDemo");
    }
    @Test
    public void HomeLoanROI()
    {
        System.out.println("Home ROI is 10 %");
    }
    @Test
    public void HomePaymentTnC()
    {

        System.out.println("Home Loan t&c");
    }

    @Test(groups={"smoke"})
    public void HomeloanInsurance()
    {
        System.out.println("Home loan  insurance");
    }
}


