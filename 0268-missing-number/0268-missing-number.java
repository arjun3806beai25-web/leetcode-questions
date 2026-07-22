class Solution {
    public int missingNumber(int[] nums) {
        int count =0;
        int n = nums.length;
      for(int i =0;i<nums.length;i++){
           
      count = count^nums[i];
      count = count^i;

  
      } count = count^n;
        return count;
 
    }
}