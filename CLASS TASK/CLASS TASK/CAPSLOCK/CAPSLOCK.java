import java.util.Scanner;
public class CAPSLOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String output = input.toUpperCase();
        System.out.println("Caps Lock " + output);
    }
}
