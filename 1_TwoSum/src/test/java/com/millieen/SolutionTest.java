package com.millieen;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class SolutionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] nums = solution.twoSum(input, target);
        Assert.assertEquals(2, nums.length);
        Assert.assertEquals(0, nums[0]);
        Assert.assertEquals(1, nums[1]);
    }
}