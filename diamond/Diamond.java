import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer for the diamond's width and height: ");
    int n = scanner.nextInt();

    if(n < 1) {
      System.out.println("Please enter a postive integer.");
      return;
    }

    int mid = n/2;
// upper diamond part
    for (int i = 0; i <= mid; i++){
      int stars = (n % 2 == 0) ? 2 * i + (n % 2) : 2 * i + 1;
      if( stars > n) stars = n;

      int spaces = (n - stars) / 2;
      printLine(spaces, stars);
    }
// lower diamind part
    for (int i = mid -1; i >= 0; i--){
      int stars = (n % 2 == 0) ? 2 * i +(n % 2) : 2 * i + 1;
      if (stars > n) stars = n;
      int spaces = (n - stars) / 2;
      printLine(spaces, stars);
    }
  }
}
