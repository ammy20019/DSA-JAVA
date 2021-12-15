/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
*/


class Search_Index_Position_leetcode {
 public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        if(nums[0] >= target){
            return 0;
        }
        if(nums[nums.length - 1] < target){
            return nums.length;
        }
        
        // find the closest smaller one
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        
        return left;
    }
}
