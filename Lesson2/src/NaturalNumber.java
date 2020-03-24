import java.util.Scanner;

public class NaturalNumber {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
        System.out.print("Input a two-digit number: ");
        int num1 = in.nextInt(); 
        in.close();
        if ((num1>9) & (num1<100))   {
        	System.out.println("Right number!");
        	} else {
        	System.out.println("Wrong number!");            	
        return;
        }
        
        
        int x1 = num1/10;
        int x2 = num1%10;
        
        if (x1>x2) { 
        	
        System.out.printf("Min: %d \n",x2);
        System.out.printf("Max: %d \n",x1);
        } 
        	if (x1<x2) {     	
    		System.out.printf("Min: %d \n",x1);
    		System.out.printf("Max: %d \n",x2);    	
    	}
	}
}