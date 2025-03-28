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

    public static int maximumCountOfPositiveIntegerAndNegativeInteger(int[] nums) {

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) { positive++; }
            if (nums[i] < 0) { negative++; }

        }

        return Math.max(positive, negative);

    }

}
