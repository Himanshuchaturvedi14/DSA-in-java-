class Solution {
    void swap( int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
         
    }
    public void sortColors(int[] nums) {
        int h=nums.length-1,m=0,l=0;
        while(m<=h){ 
            if(nums[m]==0){
              swap(nums,l,m);
              l++;
              m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                swap(nums,m,h);
                h--;
            }
        }
    }
} 