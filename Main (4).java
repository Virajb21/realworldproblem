/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Time
{
    int hrs , mins , secs;
   
    void setdata()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter hours : ");
    
    hrs = sc.nextInt();
    System.out.println("Enter minutes : ");
    mins = sc.nextInt();
    
    System.out.println("Enter seconds : ");
    secs = sc.nextInt();
    }
    void calc(){
        if(hrs>=12)
        {
            System.out.print("PM");
        }
        else{
            System.out.print("AM");
        }
    }
    void showdata()
    { if(hrs>=12)
    {
        hrs = hrs % 12;
    }
        
        System.out.print(" time is : "+hrs+":"+mins+":"+secs);
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Real world program for displaying time : )  ");
		Time t = new Time();
		t.setdata();
	    t.calc();
		t.showdata();
		
		
	}
}


