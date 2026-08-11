import java.io.*;
import java.util.*;

public class  Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> data =new ArrayList<>(); 
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
           ArrayList<Integer> line=new ArrayList<>();
           for(int j=0;j<d;j++){
            line.add(sc.nextInt());
           }
                data.add(line);
            }
            int q=sc.nextInt();
            for(int i=0;i<q;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                if(y<=data.get(x-1).size()){
                    System.out.println("The element at position (" + x + "," + y + ") is: " + data.get(x-1).get(y-1));
                }
                else{
                    System.out.println("ERROR!");
                } 
                    
            }
    
}
}