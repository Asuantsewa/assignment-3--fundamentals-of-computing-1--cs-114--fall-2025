import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer for the diamond's width and height: ");
    int row = scanner.nextInt();

    if(row < 1) {
      System.out.println("Please enter a postive integer.");
      return;
    }

    int mid = row/2;
// upper diamond part
    for (int i = 0; i <= mid; i++){
      for(int j = 0; i <= mid; i++);
      System.out.println("  ");
      for(int j = 0; j < 2 * i + 1; j++);
      System.out.print("*");
      System.out.println();
    }
    for(int i = mid - 1; i >= 0; i--);
      for(int j = 0; j < mid - i ; j++);
      System.out.print(" ");
// lower diamind part

    }
  }
