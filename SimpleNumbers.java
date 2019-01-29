import java.util.Scanner;

public class SimpleNumbers {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter number : ");
	        int num = in.nextInt();
	        int i;
	        boolean Simple = false;
	        System.out.println("2 is simple number");
	        for(i = 2; i <= num; i++) {
	            if(i%2 == 0) 
	                continue;
	            for(int j = 2; j < i; j++) {
	                if(i%j != 0) 
	                    Simple = true;
	                else { 
	                    Simple = false; 
	                    break; 
	                }          
	            }        
	            if(Simple) 
	                System.out.println(i + " is simple number");
	        }
	    }
}