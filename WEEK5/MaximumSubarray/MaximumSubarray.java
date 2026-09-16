import java.util.*;

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        MaximumSubarray obj=new MaximumSubarray();
        System.out.println(obj.maxSubArray(nums));
    }
}

