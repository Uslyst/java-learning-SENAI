package aula8_2.view;
import java.util.Scanner;

public class InputUtils {
    public static int readInt(Scanner scan, String message) {
        System.out.print("\n" + message);
        int _int = scan.nextInt();
        scan.nextLine();
        return _int;
    }

    public static void pressToContinue(Scanner scan) {
        System.out.print("\nPress any key to continue...");
        scan.nextLine();
    }

    public static String readString(Scanner scan, String message) {
        System.out.print("\n" + message);
        return scan.nextLine();
    }

    public static double readDouble(Scanner scan, String message) {
        System.out.print("\n" + message);
        double _double = scan.nextDouble();
        scan.nextLine();
        return _double;
    }
}
