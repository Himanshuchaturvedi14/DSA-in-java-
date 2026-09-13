class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int csum=nums[0]+nums[1]+nums[2]; 
        for(int i=0;i<nums.length-2;i++){
             int l=i+1,r=nums.length-1; 
            while(l<r){
                 sum=nums[i]+nums[l]+nums[r];
                if(Math.abs(sum-target)<Math.abs(csum-target)){
                    csum=sum;
                }
            if(sum==target){
                 return sum;
            }
            else if(sum>target){
                r--;
            }
            else{
                l++;
            } 
        }
    }
        return csum;
    }
}