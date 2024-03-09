package org.example;

import java.util.*;

public class AnagramGrouper {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //complete the code here
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan"};
        List<List<String>> result = groupAnagrams(strs);

        for(List<String> ans:result){
            System.out.println(ans);
        }
    }
}