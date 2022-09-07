package com.revature.challenges;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest extends TestCase {
    Solution sut = new Solution();

    @Test
    public void testSearchInsert1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        Assert.assertEquals(2, sut.searchInsert(nums, target));
    }

    @Test
    public void testSearchInsert2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        Assert.assertEquals(1, sut.searchInsert(nums, target));
    }

    @Test
    public void testSearchInsert3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        Assert.assertEquals(4, sut.searchInsert(nums, target));
    }

    @Test
    public void testSearchInsert4() {
        int[] nums = {1};
        int target = 1;

        Assert.assertEquals(0, sut.searchInsert(nums, target));
    }

    @Test
    public void testSearchInsert5() {
        int[] nums = {1, 3, 5, 6, 7};
        int target = 7;

        Assert.assertEquals(4, sut.searchInsert(nums, target));
    }
}