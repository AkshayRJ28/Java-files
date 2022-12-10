package Practice;
import java.util.*;

public class Cwh_19_chp4_ps_4 {

	public static void main(String[] args) {
	
		//que 2
	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks in Subject 1");
		float a = sc.nextFloat();
		System.out.println("Enter the marks in Subject 2");
		float b = sc.nextFloat();
		System.out.println("Enter the marks in Subject 3");
		float c = sc.nextFloat();
		float per = (a+b+c)/300.0f*100.0f;
		System.out.println("Your Percentage is "+per);
		
		if (a >=33 && b>=33 && c >=33 && per >=40)
		{
			System.out.println("Congrats ! You are Passed ");
		}
		else 
		{
			System.out.println("Sorry , You are Failed");
		}
	*/	
		// Question 3
		
		/*
		Scanner sc = new Scanner(System.in);
		float tax = 0;
		System.out.println("Please enter your income");
		float income =sc.nextFloat();
		
		if (income<=2.5)
		{
			tax= tax+0;
		}
		else if (income>2.5 && income <=5.0)
		{
			tax =tax + 0.05f *(income - 2.5f);
		}
		else if (income > 5.0 && income<=10.0 )
		{
			tax =tax + 0.05f *(5.0f - 2.5f);
			tax =tax + 0.2f *(income - 5.0f);
		}
		else if (income >= 10.0f )
		{
			tax =tax + 0.05f *(5.0f - 2.5f);
			tax =tax + 0.2f *(5.0f - 2.5f);		
		}
		System.out.println(tax);
	
	*/
		Scanner sc1 = new Scanner (System.in);
		int day = sc1.nextInt();
		
		 switch (day)
		 {
		 case 1 : System.out.println("monday");break;
		 case 2: System.out.println("tuesday");break;
		 case 3: System.out.println("wendsday");break;
		 case 4: System.out.println("thursday");break;
		 case 5: System.out.println("friday");break;
		 case 6: System.out.println("saturday");break;
		 case 7: System.out.println("Sunday"); break;
	     default  : System.out.println("enter valid number");break;
		 
		 }

	}

}
