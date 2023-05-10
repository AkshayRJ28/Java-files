package Practice;

public class Cwh_24_break_and_continue {
     public static void main(String[]args)
     {
    	 
    	 for (int i=0;i<=10;i++)
    	 {
    		 System.out.println(i);
    		 System.out.println("Java is Great");
    		 if (i==2)
    		 {
    			 System.out.println("The value of a is 2 means ending the loop");
    			 break;
    		 }
    		 System.out.println("break Keyword is Successfully executed");
    	 }
    	 
    	 
    	 //Using while
    	 
    	 int a = 0;
    	 while(a<=5)
    	 {
    		 System.out.println(a);
    		 System.out.println("Java is Great");
    		 if (a==2)
    		 {
    			 System.out.println("Ending the loop");
    			 break;
    		 }
    		 a++;
    		 
    	 }
    	 
    	 
    	 //using do while loop
    	 int j = 0;
    	 do
    	 {
    		System.out.println(j);
    		System.out.println("Java is Great");
    		if(j==2)
    		{
    			System.out.println("End for the loop");
    			break;
    		}
    		j++;
    	 } while(j<=5);
     }
}
