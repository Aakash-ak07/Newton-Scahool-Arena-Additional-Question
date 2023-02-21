// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
// Return the single element that appears only once.
// Your solution must run in O(log n) time and O(1) space.

// Example 1:
// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

// Example 2:
// Input: nums = [3,3,7,7,10,11,11]
// Output: 10


class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int left = 0, right = (nums.length - 3) /2 ;

        while(left <= right)
        {
            int mid = (left + right) >> 1;
            if(nums[2 * mid] == nums[2 * mid + 1])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return nums[2 * left];
    }
}
