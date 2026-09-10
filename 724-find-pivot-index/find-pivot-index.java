class Solution {
    public int pivotIndex(int[] nums) {
        int[] lsum=new int[nums.length];
        int[] rsum=new int[nums.length];
        lsum[0]=0;
        rsum[nums.length-1]=0;
        for(int i=1;i<lsum.length;i++){
            lsum[i]=lsum[i-1]+nums[i-1];
        }
      for(int j=nums.length-2;j>=0;j--){
        rsum[j]=rsum[j+1]+nums[j+1];
      }
      for(int k=0;k<nums.length;k++){
        if(lsum[k]==rsum[k]){
            return k;
        }
      }
        return -1;
    }
}