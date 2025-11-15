import java.util.Scanner;

public class Diamond {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Enter an integer for the diamond's width and height: ");
  int n = scanner.nextInt();
  
  if (n < 1) {
    System.out.println("Please enter a positive integer.");
    return;
  }
  if (n % 2 == 0) {
  System.out.println("Please enter an odd number.");
  return;
  }

int mid = n / 2;
for (int i = 0; i < n; i++) {
  int spaces = Math.abs(mid - i);
  int stars = n - 2 * spaces;
  
  for (int s = 0; s < spaces; s++) {
    System.out.print(" ");
    // print stars
  for (int st = 0; st < stars; st++) {
    System.out.print("*");
  }

  System.out.println();
  }
  scanner.close();
  }
 }
}
