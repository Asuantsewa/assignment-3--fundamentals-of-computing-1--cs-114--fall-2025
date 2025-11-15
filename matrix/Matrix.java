import java.util.Scanner;

public class Matrix {
  private int [][] matrix;

  private static final String YELLOW = "\u001B[33m";
  private static final String RESET = "\u001B[0m";
  
  public void matrix (int size){
    matrix = new int[size][size];
    System.out.println("The height is" + size + "and width is" + size);
  }
  
  private void swap(int x1, int y1, int x2, int y2){
    int temp = matrix [x1] [y1]; 
    matrix [x2] [y2] = temp;
  }
    // to print he matrix
  public void printMatrix() {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j<n; j++) {

          if (i + j == n - 1) {
            System.out.print(YELLOW + matrix[i][j] + "\t" +  RESET);
          } else {
              System.out.print(matrix[i][j] + "\t");
          }
        }
        System.out.println();
        }
      }
      // populate
      public void populateMatrix() {
        int n = matrix.length;
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              matrix[i][j] = value++;
            }
          }
        }
// to flip
public void flipMatrix() {
  int n = matrix.length;
  for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
// Only swap elements above the diagonal
          if (i + j < n - 1) {
              swap(i, j, n - 1 - j, n - 1 - i);
          }
      }
  }
}
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a positive number for the matrix size: ");
  int size = scanner.nextInt();

  if (size <= 0) {
      System.out.println("The number must be positive.");
      return;
  }
  Matrix m = new Matrix(size);

  System.out.println("\nInitial matrix (all zeros):");
  m.printMatrix();

  m.populateMatrix();
  System.out.println("\nMatrix after populating with values:");
  m.printMatrix();

  m.flipMatrix();
  System.out.println("\nMatrix after flipping across top-right to bottom-left diagonal:");
  
  scanner.close();
  }
}
