class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum=0,l=nums.length;
        for(int x:nums){
            sum+=x;
        }
        
        ArrayList<Long> avgDiff = new ArrayList<>();
        long n=0,min=Long.MAX_VALUE;
        for(int i=0;i<l-1;i++){
            n+=nums[i];
            
            long diff=Math.abs((long)(n/(i+1))-(long)((sum-n)/(l-i-1)));
            avgDiff.add(diff);
            min=Math.min(min,diff);
        }
        avgDiff.add(sum/l);
        min=Math.min(min,(sum/l));
        return avgDiff.indexOf(min);
    }
}