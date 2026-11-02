import java.util.Scanner;

public class Q8MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int sum = 0;

        System.out.println("Enter elements of 3 x 3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
                sum = sum + matrix[i][j];
            }
        }

        System.out.println("Sum of all matrix elements: " + sum);

        sc.close();
    }
}