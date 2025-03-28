package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void maximumCountOfPositiveIntegerAndNegativeIntegerTest() {

        int[] nums1 = { -2, -1, -1, 1, 2, 3 };
        assertEquals(3, LeetCodeAttempt.maximumCountOfPositiveIntegerAndNegativeInteger(nums1));

        int[] nums2 = { -3, -2, -1, 0, 0, 1, 2 };
        assertEquals(3, LeetCodeAttempt.maximumCountOfPositiveIntegerAndNegativeInteger(nums2));

        int[] nums3 = { 5, 20, 66, 1314 };
        assertEquals(4, LeetCodeAttempt.maximumCountOfPositiveIntegerAndNegativeInteger(nums3));

    }

}
