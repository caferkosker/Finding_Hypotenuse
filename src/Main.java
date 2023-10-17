import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first side length:");
        int first_length = scanner.nextInt();

        System.out.println(" Please enter the second side length");
        int second_length = scanner.nextInt();

        double hypotenuse = Math.sqrt(first_length * first_length + second_length * second_length);

        System.out.println("Your first side length:" + first_length);
        System.out.println("Your second side length:" + second_length);

        System.out.println("your hypotenuse side length:" + hypotenuse);




    }
}
