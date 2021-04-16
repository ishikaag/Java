import java.util.Scanner;
//using single for loop
/*
public class SortingArrayAscendingOrder {
    public static int[] sortArray(int a[]){
        int smallest= 0;
        for(int i=0; i<a.length-1; i++){
            if(a[i+1]<a[i]){
                smallest=a[i+1];
                a[i+1]=a[i];
                a[i]=smallest;
                i=-1;
            }
        }
        return a;
    }
*/
//using nested for loop
public class SortingArrayAscendingOrder {
    public static int[] sortArray(int a[]){
        int smallest= 0;
        for(int i=0; i<a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    smallest = a[j];
                    a[j] = a[i];
                    a[i] = smallest;
                }
            }
        }
        return a;
    }
    public static void main(String[]args){
        int[] array=new int[5];
        System.out.println("Enter "+ array.length + " array element");
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        int []result=sortArray(array);
        System.out.println("sorted array:");
        for(int i=0; i<result.length; i++ )
            System.out.print(+result[i]+" ");
        //alternative for printing with for
        //System.out.println(Arrays.toString(result));
    }
}
