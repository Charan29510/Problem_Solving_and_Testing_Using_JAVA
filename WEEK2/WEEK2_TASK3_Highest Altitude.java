class Solution {
    public int largestAltitude(int[] gain) {
        int start=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            gain[i]=start+gain[i];
            start=gain[i];
            if(gain[i]>max){
                max=gain[i];
            }
        }
        return max;
    }
}
