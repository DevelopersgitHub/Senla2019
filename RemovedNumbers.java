import java.util.Scanner;

public class RemovedNumbers {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = "";
        System.out.print("Enter new line: ");
            while (scan.hasNextLine()){
            	try {
            		 String line = scan.nextLine();
            		 System.out.println(line.replaceAll("[^\\s+a-zA-Z!?.-]", ""));
                     if (line.equals("##")) {
                         System.exit(0);
                         scan.close();
                     }
            	} catch (Exception e){
            	       System.out.println("Error ::"+e.getMessage());
            	       e.printStackTrace();
                }
            }
        }
}
