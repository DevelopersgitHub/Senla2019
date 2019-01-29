import java.util.Scanner;

public class CheckingOnTrue {
	 static int findMatched(boolean[] array){
			int matched = 0;
			for(int i = 0; i < array.length;i++) {
				if(array[i] == true){
		    		matched++;
		        }
			}
	     return matched;
	 }
	 public static void main(String[] args) throws Exception {
		  	Scanner input = new Scanner(System.in);
		    boolean array[] = new boolean[4];
		    System.out.print ("Enter array of booleans values:");
		    for (int i = 0; i < 4; i++) {
		        array[i] = input.nextBoolean();
		    }
		    System.out.print ("Entered elements:");
		    for (int i = 0; i < array.length; i++) {
		        System.out.print (" " + array[i]);
		    }
		    System.out.println();
		    
		    /*
		     * method search matched values in array,
		     * @return marched - count matched in array
		     */
		    int matched = findMatched(array); 
		   
	        if(matched == 2) {
	        	System.out.println("True");
	        } else {
	        	System.out.println("False");
	        }   
	 }
}
