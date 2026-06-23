class Solution {
    public int trap(int[] height) {

        int[]mxl=new int[height.length];
        mxl[0]=height[0];
        for(int i=1;i<height.length;i++){
            mxl[i]=Math.max(mxl[i-1],height[i]);
        }
        int[]mxr=new int[height.length];
        mxr[mxr.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            mxr[i]=Math.max(mxr[i+1],height[i]);
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            int h=Math.min(mxr[i],mxl[i])-height[i];
            sum+=h;
        }
        return sum;
        
    }
}