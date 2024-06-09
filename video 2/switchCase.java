import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number between 1 to 7: ");
        int num = scanner.nextInt();

        switch(num){
            case 1:
                System.out.println("Lucky Day Monady");
                break;
            case 2:
                System.out.println("Lucky Day Tuesday");
                break;
            case 3:
                System.out.println("Lucky Day Wednesday");
                break;
            case 4:
                System.out.println("Lucky Day Thursday");
                break;
            case 5:
                System.out.println("Lucky Day Friday");
                break;
            case 6:
                System.out.println("Lucky Day Saturday");
                break;
            case 7:
                System.out.println("Lucky Day Sunday");
                break;

            default:
                System.out.println("Invalid Input");
        }

        scanner.close();
    }
}