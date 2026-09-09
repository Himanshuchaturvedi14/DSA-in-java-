class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
            Set<Integer>set=new HashSet<>(); 
            long sum=0,max=0,count=0;
            int left=0;
            for(int i=0;i<nums.length;i++){
                while(set.contains(nums[i])){
                    set.remove(nums[left]);
                    sum-=nums[left];
                    left++;
                }
                set.add(nums[i]);
                sum+=nums[i];
                if(i-left+1==k){
                  max=Math.max(max,sum);
                    set.remove(nums[left]);
                    sum-=nums[left];
                    left++;
                }
            }
            return max;
    }
}