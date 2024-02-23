class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<=nums[0])
        return 0;
        if(target>nums[nums.length-1])
        return nums.length;
        int lb=0;
        int ub=nums.length-1;
        int mid=0;   
        int ans=0;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(nums[mid]>=target)
            {
                ub=mid-1;
                ans=mid;
            }
            else
            {
                lb=mid+1;
                System.out.println(lb);
            }
        }   
        return ans;  
        // while(lb<=ub)
        // {
        //     mid=lb+(ub-lb)/2;
        //     if(target==nums[mid])
        //     return mid;            
        //     if(target<nums[mid])
        //     ub=mid-1;
        //     if(target>nums[mid])
        //     lb=mid+1;
        //     /*if(lb==ub-1&&nums[lb]<=target)
        //     {
        //         return ub;
        //     }
        //     if(lb==ub-1&&nums[lb]>=target)
        //     {
        //         return lb;
        //     }*/
        // }
        // return ub+1;
    }
}