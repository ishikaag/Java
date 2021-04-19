import java.util.Scanner;

public class MaxValueOfEachRow {
    public static int findMax(int[] n){
        int max=n[0];
        for(int i=0; i<n.length; i++){
            if(max<n[i]){
                max=n[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2d array elements having dimension 3X3:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given 2d array:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print(" => "+findMax(arr[i]));
            System.out.println();
        }

    }
}
