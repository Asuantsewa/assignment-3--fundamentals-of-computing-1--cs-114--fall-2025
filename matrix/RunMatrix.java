import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of the matrix: ");
    int size = scan.nextInt();
    scan.close();

    Matrix matrix = new Matrix(size);
  matrix.populateMatrix();
    matrix.printMatrix("Printing Matrix");
    matrix.flipMatrix();
    matrix.printMatrix("Printing flipped Matrix: ");
  }
}
