class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] parts = s.split("\\s+"); // Split on one or more whitespace
      
    for(int i = parts.length -1;i>= 0 ; i--){
      sb.append(parts[i]);
      if(i != 0) sb.append(" ");
    }
    return sb.toString().trim();
  }
}