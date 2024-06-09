import java.util.Scanner; //imports the Scanner class which is used for taking input from the user.

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creates a Scanner object to read input from the standard input stream (the console).

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine(); //'scanner.nextLine()' will read the entire line of input entered by the user, including spaces. This is useful for reading names, sentences, or any other inputs that may contain spaces.
        
        
        System.out.print("Enter Your Phone Number: ");
        int num = scanner.nextInt(); //scanner.nextInt() will read an integer value from the user. If the user enters a non-integer value, it will throw an InputMismatchException.
        
        System.out.print("Enter Your Percentile: ");
        double percentile = scanner.nextDouble();
        
        // print collected input
        System.out.println("User Name : " + name);
        System.out.println("User Contact Number: " + num);
        System.out.print("User Percentile: " + percentile);

        scanner.close(); //closes the Scanner object to prevent resource leaks.
    }
}
