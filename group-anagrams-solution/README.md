# Group Anagrams(Assignment)
## Problem Statement

You are given an array of strings, you need to group the anagrams together and store them in a list of strings.
Write a function in Java that takes an array of strings as input and returns a `List<List<String>>` where each inner
list contains the strings that are grouped together i.e. the anagrams.

**Note:** A string `s2` is called an anagram of string s1, if the frequency of each character in the string s2 is equal to
the frequency of each character in the string `s1`.

## Instructions
1. Implement the `groupAnagrams` method inside the `AnagramGrouper` class.
2. The input array of strings can also be empty or `null`. In that case you need to return an empty 
`<List<List<String>>`.
2. Hint: Use **LinkedHashmap** to maintain the ordering of strings, same as input. 