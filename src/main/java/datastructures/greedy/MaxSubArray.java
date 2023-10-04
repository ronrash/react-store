package datastructures.greedy;

public class MaxSubArray {

    //Given an integer array nums, find the
    //subarray
    // with the largest sum, and return its sum.

    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.

    public static void main(String[] args) {
//        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int[] array ={2,3,-2,4};

        maxSubArray(array);
    }

    private static int[] maxSubArray(int [] a){
        //maxsum =3

        int maxSum = a[0];
        int currentSum = a[0];

        for (int i = 1; i < a.length; i++) {
            // Calculate the maximum sum ending at the current position.
//            int sum =currentSum+a[i];
//            if(sum>a[i])
//            {
//                currentSum=sum;
//            }
            currentSum = Math.max(a[i], currentSum + a[i]);

            // Update the maximum sum found so far.
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
        return new int[]{};
    }
}
