package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void maximumCountTest() {

        int[] nums1 = { -2, -1, -1, 1, 2, 3 };
        assertEquals(3, LeetCodeSolution.maximumCount(nums1));

        int[] nums2 = { -3, -2, -1, 0, 0, 1, 2 };
        assertEquals(3, LeetCodeSolution.maximumCount(nums2));

        int[] nums3 = { 5, 20, 66, 1314 };
        assertEquals(4, LeetCodeSolution.maximumCount(nums3));

    }

}
