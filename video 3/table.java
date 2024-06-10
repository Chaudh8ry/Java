import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        
        System.out.println("Table of  8 is: ");
        for(int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    scanner.close();
    }
}
