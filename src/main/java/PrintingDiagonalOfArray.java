import java.util.Scanner;

public class PrintingDiagonalOfArray {
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2d array elements having dimension 3X3:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given 2d array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

