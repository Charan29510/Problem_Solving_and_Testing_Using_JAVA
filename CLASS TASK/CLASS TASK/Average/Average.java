import java.util.*;
public class Average {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        double average=(double)sum/n;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        System.out.println("maximum is "+max);
        System.out.println("minimum is "+min);
    }
}
