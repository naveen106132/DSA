class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String r = "";
        for(int i=0;i<s.length();i++)
        {
            r = s.charAt(i)+r;
        }
        System.out.print(r);
        if(r.equals(s))
        {
            return true;
        }
        return false;
    }
}
