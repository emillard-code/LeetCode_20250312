package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = { -2, -1, -1, 1, 2, 3 };
        System.out.println(maximumCountOfPositiveIntegerAndNegativeInteger(nums1));

        int[] nums2 = { -3, -2, -1, 0, 0, 1, 2 };
        System.out.println(maximumCountOfPositiveIntegerAndNegativeInteger(nums2));

        int[] nums3 = { 5, 20, 66, 1314 };
        System.out.println(maximumCountOfPositiveIntegerAndNegativeInteger(nums3));

    }

    // This method returns either the count of the positive integers in int[] num, or the count
    // of the negative integers in int[] num, whichever happens to be higher.
    public static int maximumCountOfPositiveIntegerAndNegativeInteger(int[] nums) {

        // We will use int positive and int negative to
        // store the count of positive and negative integers.
        int positive = 0;
        int negative = 0;

        // We perform a simple loop and increment either int positive or int negative
        // each time we find either a positive or negative number respectively.
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) { positive++; }
            if (nums[i] < 0) { negative++; }

        }

        // At the end, we return the higher of the two counts.
        return Math.max(positive, negative);

    }

}
