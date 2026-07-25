class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) +1 );
        }
        boolean flag = false;
        int count = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 ==0){
                count += entry.getValue();
            }
            else{
                count+= entry.getValue()-1;
                flag = true;
            }
        }
        if(!flag) return count;
        return count +1;
    }
}