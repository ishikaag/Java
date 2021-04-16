import java.util.Scanner;

public class CountZeroesInArray {
    public static int countZeroesInArray(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
           count+= countZeroesInEachElement(a[i]);
        }
        return count;
    }
    public static int countZeroesInEachElement(int n){
        int count=0;
        while(n>0){
            int r=n%10;
            if(r==0){
                count++;
            }
            n/=10;
        }
        return count;
    }
    public static void main(String args[]){
        int[] arr= new int[5];
        System.out.println("Enter " + arr.length + " elements of array");
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int res = countZeroesInArray(arr);
        System.out.println("Total number of Zeroes: " + res);
    }
}
