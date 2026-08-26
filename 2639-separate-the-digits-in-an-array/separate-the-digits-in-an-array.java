class Solution {
    public int[] separateDigits(int[] nums) {
        int totalDigits = 0;
        for (int n : nums) {
            while (n > 0) {
                totalDigits++;
                n /= 10;
            }
        }
        int[] ans = new int[totalDigits];
        int index = totalDigits - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int n = nums[i];
            while (n > 0) {
                ans[index] = n % 10;
                index--;
                n /= 10;
            }
        }
        return ans;
    }
}