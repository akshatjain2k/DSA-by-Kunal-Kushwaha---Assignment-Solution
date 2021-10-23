// 2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)

public class a2 {
    public int[] buildArray(int[] nums){
        int[] ans = new int[2 * nums.length];
        int r = nums.length;
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i+r] = nums[i];
        }
        return ans;
    }
}