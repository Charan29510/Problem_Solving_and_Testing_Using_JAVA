class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        int i=0;int k=n;
       for(int j=0;j<res.length;j++){
        if(j%2==0){
            res[j]=nums[i];
            i++;
        }
        else{
            res[j]=nums[k];
            k++;
        }
       }
       return res;
    }
}
