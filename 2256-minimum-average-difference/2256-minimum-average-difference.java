class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        int l=nums.length;
        int ans =-1;
        long sum=0;
        for(int x:nums){
            sum+=x;
        }
        
        
        long currPrefixSum=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<l;i++){
            currPrefixSum+=nums[i];
            
            long leftPartAvg = currPrefixSum/(i+1);
            
            long rightPartAvg = sum-currPrefixSum;
            
            if(i != l-1){
                rightPartAvg /=(l-i-1);
            }
            
            int diff=(int)Math.abs(leftPartAvg-rightPartAvg);
            
            if(diff<min){
                min = diff;
                ans=i;
            }
        }
        
        return ans;
    }
}