import java.util.*;
public class Squares {
    
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=scanner.nextInt();
       }
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " squared is " + (arr[i] * arr[i]));
        }
    }
}


