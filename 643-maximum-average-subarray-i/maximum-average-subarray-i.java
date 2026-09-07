class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,sum=0;
        int maxa=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxa=sum;
        for(int r=k;r<nums.length;r++){
        sum+=nums[r]-nums[l++];
        maxa=Math.max(maxa,sum);
        }
        return(double)maxa/k;
    }
}