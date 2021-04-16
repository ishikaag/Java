//without dynamic allocation of memory
import java.util.Scanner;

public class GetMinNumInArray {
    public static int getMin(int array[]){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int array[]=new int[10];
        System.out.println("Enter " + array.length+ " array elements:");
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        int min= getMin(array);
        System.out.println("Min no is: "+min);
    }
}
