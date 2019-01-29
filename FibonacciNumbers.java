import java.util.Scanner;

public class FibonacciNumbers {
	static int fibonacci(int i)
    {
        return (i<=2 ? 1 : fibonacci(i-1) + fibonacci(i-2));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        for (int i=1; i<=num; i++)
            System.out.print(fibonacci(i) + ", ");
        System.out.println("...");
    }
}
