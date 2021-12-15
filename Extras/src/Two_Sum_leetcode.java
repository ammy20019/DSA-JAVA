/*
 * Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

 */

class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        for(int i = 0; i < nums.length; i++){
	            for(int j = i + 1; j < nums.length; j++){
	                if(nums[j] == target - nums[i]){ 
	                    //suppose target is 9 ... nd 2+7 is 9.. 7 = 9-2
	                    return new int[] {i,j}; //if its true thn 2,7 we will return
	                }
	            }
	        }
	        return new int[]{}; //if false then empty array
	    }
	}

