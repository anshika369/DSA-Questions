class Solution {
    public int largestRectangleArea(int[] heights) {
        int [] pse=previousSmaller(heights);
        int[] nse=nextSmaller(heights);
        int max=0;
        for(int i=0;i<heights.length;i++)
        {
            int area=heights[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);
        }
        return max;
    }
        private static int[] previousSmaller(int[] heights){
            Stack<Integer> st=new Stack<>();
            int[] pse=new int[heights.length];
            for(int i=0;i<heights.length;i++){
while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
return pse;
            }
              private static int[] nextSmaller(int[] heights){
            Stack<Integer> st=new Stack<>();
            int[] nse=new int[heights.length];
            int n=heights.length;
            for(int i=n-1;i>=0;i--){
while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
return nse;
            }
            

        
    }
