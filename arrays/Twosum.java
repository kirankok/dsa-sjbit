public class Twosum {

    //problem statement: 
    // Given an array of integers and a target sum, find the indices of the two numbers that add up to the target sum.
    // Example: Input: nums = [2, 7, 11, 15], target = 9
    //          Output: [0, 1] (because nums[0] + nums
    //          equals 9)

    //for loop
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices of the two numbers
                }
            }
        }
        return new int[]{-1, -1}; // Return [-1, -1] if no solution is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
    
}
