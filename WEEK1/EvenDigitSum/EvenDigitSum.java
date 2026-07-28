import java.util.*;
class Solution {
    public static int EvenDigitSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            n /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int res=EvenDigitSum(n);
        System.out.println("The sum is "+res);
        sc.close();
    }
}