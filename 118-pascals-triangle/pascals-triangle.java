class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> result=new ArrayList<>();
              long res=1;
            for(int j=1;j<=i;j++){
              result.add((int)res);
              res=res*(i-j);
              res=res/j;
            }
            ans.add(result);
        }
        return ans;
    }
}