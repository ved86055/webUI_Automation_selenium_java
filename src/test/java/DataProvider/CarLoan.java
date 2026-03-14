package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarLoan
{
    public void CarLoanROI()
    {

        System.out.println("Car Loan ROI");
    }

    @Test(dataProvider="getData")
    public void CarLoanTenure(String username, String password)
    {
        System.out.println("Car Loan CarLoan Tenure");
        System.out.println(username);
        System.out.println(password);
    }

    public void CarLoanPreClosure()
    {
        System.out.println("Car Loan Preclosure");

    }

    @DataProvider
    public Object[][] getData()
    {

        Object[][] data=new Object[3][2];  //3 user 3 times need to run so 3 :: 2 values Un & PWD so 2
        //1st user
        data[0][0]="1stUN";
        data[0][1]="1stPWD";

        //2ndUser
        data[1][0]="2ndUN";
        data[1][1]="2ndPWD";


        //3rdUser
        data[2][0]="2ndUN";
        data[2][1]="2ndPWD";
        return data;

    }





}
