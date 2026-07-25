class Solution {
    public boolean isPalindrome(String s) {
   s=s.toLowerCase();
   s=s.replaceAll("[^a-z0-9]","");
   String a="";
   for(int i=s.length()-1;i>=0;i--)
   {
    a+=s.charAt(i);
   }
   return s.equals(a);
    }
}