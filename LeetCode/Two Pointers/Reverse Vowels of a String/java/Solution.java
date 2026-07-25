class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left=0; int right=c.length-1;
        String vow = "aeiouAEIOU";
         while(left<right){
            if(!vow.contains(c[left]+"")){
               left++;
            }
            else if(!vow.contains(c[right]+"")){
                right--;
            }
            else{
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;

            }

         }
         return new String(c);

    }
}