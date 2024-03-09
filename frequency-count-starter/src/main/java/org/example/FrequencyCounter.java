package org.example;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static Map<Integer, Integer> countFrequencies(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        //code here

        return hashMap;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,1,2,3,4,5,1};
        Map<Integer,Integer> ans = countFrequencies(nums);

        System.out.println(ans);

    }
}