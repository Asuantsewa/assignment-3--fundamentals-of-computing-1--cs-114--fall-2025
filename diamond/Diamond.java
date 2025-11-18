import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = scanner.nextInt();
    
    if (n <= 0) {
        System.out.println("Number must be positive.");
        return;
    }
    if (n % 2 == 0) {
        printSpacedDiamond(n);
    }
        // ODD number -> solid diamond
    else {
        printSolidDiamond(n);
        }
    }
// print even diamind
public static void printSpacedDiamond(int n) {
    int rows = n + 1;           // Based on your example for 8 → 9 rows
    int mid = rows / 2;

    for (int i = 0; i < rows; i++) {
        int count = i <= mid ? i : rows - 1 - i;

            // leading spaces
        for (int s = 0; s < (mid - count) * 2; s++) {
            System.out.print(" ");
        }

            // stars separated by spaces
        for (int k = 0; k < count + 1; k++) {
            System.out.print("* ");
        }

        System.out.println();
        }
    }
// odd diamond
public static void printSolidDiamond(int n) {
    int mid = n / 2;

    for (int i = 0; i < n; i++) {
        int stars = i <= mid ? (2*i + 1) : (2*(n - 1 - i) + 1);
        int spaces = Math.abs(mid - i);

        for (int s = 0; s < spaces; s++) {
             System.out.print(" ");
        }

        for (int st = 0; st < stars; st++) {
            System.out.print("*");
        }

        System.out.println();
        }
        scanner.close() ;
    }
}
