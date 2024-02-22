class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int low=lb(nums,target);
        if(low==nums.length||nums[low]!=target)
        return new int[]{-1,-1};
        int last=ub(nums,target)-1;
        return new int[]{low,last};
        
    }
    public int ub(int[] arr,int x)
    {
        int n=arr.length;
    
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1; 
                }
        }
        return ans;
    }
    public int lb(int[] arr,int x)
    {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] >= x)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1; 
            }
        }
        return ans;
    }
}