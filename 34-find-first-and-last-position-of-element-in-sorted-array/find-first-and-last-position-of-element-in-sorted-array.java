class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=firstOccurrence(nums,target);
        arr[1]=lastOccurrence(nums,target);
        
        if (arr[0] == -1 || arr[1] == -1) {
            return new int[]{-1, -1};
        }
        
        return arr;
    }
    
    public int firstOccurrence(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int midElement = arr[mid];

            if(midElement == target) {
                ans = mid;
                end = mid -1;
            }
            else if(target < midElement){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
    
    public int lastOccurrence(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int midElement = arr[mid];

            if(target == midElement){
                ans = mid;
                start = mid + 1;
            }
            else if(target < midElement){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}