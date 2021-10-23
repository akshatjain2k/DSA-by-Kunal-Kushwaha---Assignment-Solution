// 5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)

class a5 {
    public int suffleArray(int n, nums){
        int[] arr = new int[2n];
        for(int i = 0; i < n; i++){
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i+n];
        }
    }
}