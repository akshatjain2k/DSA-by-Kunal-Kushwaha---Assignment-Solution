// 4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)

public class a4 {
    class Solution {
        public int sum(int[] list){
            int s = 0;
            for(int i : list){
                s = s + i;
            }
            return s;
        }
        
        public int maximumWealth(int[][] accounts) {
            int maxwealth = sum(accounts[0]);
            int s;
            for(int i = 1; i<accounts.length; i++){
                s = sum(accounts[i]);
                if(s > maxwealth){
                    maxwealth = s;
                }
            }
            return maxwealth;
     }
    }
}    
