package Leetcode75hard;

/*
 * Input: nums = [1,2,3,4,5]
 *  Output: true
 */
public class IncreasingTriplet {
    public static void main(String[] args) {
        int[] arr = {20, 100, 10, 12, 5, 13};

        boolean flag = triplet(arr);
        System.out.println(flag); // true
    }

    private static boolean triplet(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num <= first) {
                first = num; 
            } else if (num <= second) {
                second = num; 
            } else {
                return true;
            }
        }
        return false;
    }
}

