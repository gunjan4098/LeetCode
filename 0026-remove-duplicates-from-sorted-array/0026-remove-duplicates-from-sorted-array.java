class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums[0],i=1,j=1;
        while(i<nums.length && j<nums.length){
            if(nums[j]==n){
                j++;
            }else{
                n=nums[j];
                
                nums[i]=nums[j];
                
                //increment i and j
                i++;
                j++;
            }
        }
        return i;
        
    }
}