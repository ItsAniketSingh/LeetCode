/*
    238
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

    You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/

public class ProductOfArrayExceptSelf {

    // Not the best Solution it can be optimized
    
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int [] nums2 = new int[nums.length];
    
            for(int i =0; i< nums.length; i++){
                nums2[i] = 1;
                for(int j = 0; j<nums.length; j++){
                    if( i != j){
                        nums2[i] *= nums[j];
                    }
                }
            }
            return nums2;
        }
    }
    public static void main(String[] args) {
        
    }
}