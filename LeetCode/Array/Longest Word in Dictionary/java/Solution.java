class Solution {
    public String longestWord(String[] words) {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return b.length() - a.length();
        });

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
            pq.offer(words[i]); 
        }

        while (!pq.isEmpty()) {
            StringBuilder sb = new StringBuilder(pq.poll());

            String result = sb.toString(); 


            while (sb.length() > 0) { 
                if (!set.contains(sb.deleteCharAt(sb.length() - 1).toString())) {
                    break;
                }
            }

            if (sb.length() == 0) {
                return result;
            }
        }

        return ""; 
    }
}