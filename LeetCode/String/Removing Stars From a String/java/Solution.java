class Solution {
    public String removeStars(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='*')
            {
                ans.deleteCharAt(ans.length()-1);
            }
            else
            {
                ans.append(ch);
            }
        }
        
        System.gc();
        return ans.toString();
    }
}