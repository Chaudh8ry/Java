import java.util.Scanner; //imports the Scanner class which is used for taking input from the user.

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creates a Scanner object to read input from the standard input stream (the console) & Assigns this Scanner object to the variable scanner.
        // new Scanner(...) is a constructor call that creates a new instance of the Scanner class.
        // scanner is just a reference variable that can hold the address of a Scanner object.
        //This is a predefined input stream connected to the keyboard by default. It is an instance of InputStream provided by the java.lang package.

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
