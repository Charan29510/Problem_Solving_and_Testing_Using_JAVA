import java.util.*;
class CircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int currentsum=nums[0];
        int maxsum=nums[0];

        int total=nums[0];
        int currentmin=nums[0];
        int minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            maxsum=Math.max(currentsum,maxsum);

            currentmin=Math.min(nums[i],currentmin+nums[i]);
            minsum=Math.min(currentmin,minsum);
            
            total+=nums[i];
            

        }
        if(maxsum<0){
                return maxsum;
            }
        int circularsum=total-minsum;

        return Math.max(maxsum,circularsum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] nums=new int[n];  
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        CircularSubarray cs=new CircularSubarray();
        int result=cs.maxSubarraySumCircular(nums);
        System.out.println("The maximum sum of a circular subarray is: " + result);

    }
}