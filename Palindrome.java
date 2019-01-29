import java.util.Scanner;

public class Palindrome {
	public static String reverseString(String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
        return s.equals(reverseString(s));
    }
	public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter word for checking on palindrome: ");
	        String s=scan.next();
	        isPalindrome(s);
	}
}
