import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the entered chemicals.
        Scanner scanner = new Scanner(System.in);

        // Stores chemical X.
        int X = scanner.nextInt();

        // Stores chemical Y.
        int Y = scanner.nextInt();

        // Stores chemical A.
        int A = scanner.nextInt();

        // Stores chemical B.
        int B = scanner.nextInt();

        // Stores the heart rate of the person.
        int heartRate = scanner.nextInt();

        // Checks if the person is telling the truth or is lying.
        if ((X + Y > 30) && (A > 3 || B < 6) && (heartRate == 70)) {
            System.out.println("The statement said by the person is true");
        } else {
            System.out.println("The statement said by the person is false");
        }
    }
}