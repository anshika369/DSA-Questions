class Solution {
    public int missingNumber(int[] nums) {
      int sum1=0;
      int sum2=0;

      for(int i=1;i<=nums.length;i++){
        sum1=sum1+i;
      }
      for(int j=0;j<nums.length;j++)
      {
        sum2=sum2+nums[j];
      }
      int sum =sum1-sum2;
      return sum;
        
    }
}