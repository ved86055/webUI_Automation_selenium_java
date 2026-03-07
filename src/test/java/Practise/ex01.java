package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ex01
{

    void openbrowswer()
    {
      int arr[]={12,23,32,11,43};
        for (int i=arr.length-1;i>0;i--)
        {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);


    }

    @Test
    void openbrowswer1()
    {
        String s="ved is here all ";
      for (int r=s.length()-1;r>=0;r--)
      {
          System.out.print(s.charAt(r));

      }



    }

}
