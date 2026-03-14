package Practise.TestNg;

import org.testng.annotations.Test;

public class CarLoan
{
    @Test
    public void carLoanROI()
    {
        System.out.println(" CAr loan ROI  is 8%");
    }

    @Test
    public void carshowroom()
    {
        System.out.println("car loan showroom charges");
    }
    @Test
    public  void carPassing()
    {
        System.out.println("Car loan passing charges");
    }

    @Test(groups = {"smoke"})
    public void carInsurance()
    {
        System.out.println("car loan insurance");
    }
}
