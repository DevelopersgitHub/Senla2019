import java.util.Scanner;

public class SortArray {
	  public static int[] sortByDecrease(int[] array) {
		  int temp;
		    for (int i = 0; i < array.length; i++) {
		        for (int j = i + 1; j < array.length; j++) {
		            if (array[i] < array[j]) {
		                temp = array[i];
		                array[i] = array[j];
		                array[j] = temp;
		            }
		        }
		    }
		    return array;
	  }
	  public static void main(String[] args) throws Exception {
		  Scanner input = new Scanner(System.in);
		    System.out.println("Enter array length: ");
		    int size = input.nextInt(); 
		    int array[] = new int[size]; 
		    System.out.println("Insert array elements:");
		    for (int i = 0; i < size; i++) {
		        array[i] = input.nextInt();
		    }
		    System.out.print ("Inserted array elements:");
		    for (int i = 0; i < size; i++) {
		        System.out.print (" " + array[i]);
		    }
		    System.out.println();
		    
		    int [] sortArr = sortByDecrease(array);
		  
		    System.out.print("Sorted array: ");
		    for (int i = 0; i < sortArr.length; i++) {
		        System.out.print(sortArr[i] + " ");
		    }
	  }
}
