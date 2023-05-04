package recursion;

public class MaxSum {
    public static int maxSum(int[] nums) {
        int sum = 0;
        int minNum = Integer.MAX_VALUE;

        // Calculate the sum of all numbers and find the smallest number
        for (int num : nums) {
            sum += num;
            minNum = Math.min(minNum, num);
        }

        // Subtract the smallest number from the sum to get the sum of the four largest numbers
        return sum - minNum;
    }
}
