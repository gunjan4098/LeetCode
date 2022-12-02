class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int count=0;
        for(int i=0;i<s.length()/2;i++){
            if(vowels.indexOf(s.charAt(i))>=0){
                count++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))>=0){
                count--;
            }
        }
        
        return count==0;
    }
}