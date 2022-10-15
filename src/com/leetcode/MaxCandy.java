package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCandy {
    public static void main(String[] args){
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> ans = new ArrayList<>();
        ans = kidsWithCandies(candies, 3);
        System.out.println(ans);
    }
     static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandyCount = 0;
        for (int candy : candies) {
            maxCandyCount = Math.max(maxCandyCount, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add((candy + extraCandies) >= maxCandyCount);
        }
        return result;
    }
}
