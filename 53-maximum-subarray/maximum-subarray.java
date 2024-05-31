class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0,ms=Integer.MIN_VALUE,k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>ms)
            ms=nums[i];
            if(nums[i]>0)
            {
                k=1;
                break;
            }
        }
        if(k==0)
        return ms;
        for(int i=0;i<nums.length;i++)
        {
            cs=cs+nums[i];
            if(cs<0)
            cs=0;
            ms=Math.max(cs,ms);
        }
        return ms;
        
    }
}