class Solution {
    public String frequencySort(String s) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.val-a.val);
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        //putting hashmap in priority queue
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            Pair pair = new Pair(entry.getKey(),entry.getValue());
            pq.add(pair);
        }
        
        StringBuilder str = new StringBuilder(""); 
        while(!pq.isEmpty()){
            Pair pair = pq.remove();
            int count = pair.val;
            char c = pair.c;
            while(count-->0){
                str.append(c);
            }
        }
        
        return str.toString();
    }
    
    //create class to store character with its respective frequency
    public class Pair{
        int val;
        char c;
        public Pair(char c,int val){
            this.val = val;
            this.c  =c;
        }
    }
}