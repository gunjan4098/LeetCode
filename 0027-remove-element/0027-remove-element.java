class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        
        
        int i=-1,j=0;
        while(j<n && i<n){
            if(nums[j]!=val){
                if(i!=-1){
                    nums[i]=nums[j];
                    i++;
                }
                    j++;
                
                
            }else {
                if(i==-1){
                    i=j;
                }
                    j++;
                
            }
        }
        return i==-1?n:i;
    }
}