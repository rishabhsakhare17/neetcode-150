package ArrayAndHashing;

// Problem Statement https://neetcode.io/problems/is-anagram?list=neetcode150

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        for (char character : s.toCharArray()) {
            hashMapS.put(character, hashMapS.getOrDefault(character, 0) + 1);
        }

        for (char character : t.toCharArray()) {
            hashMapT.put(character, hashMapT.getOrDefault(character, 0) + 1);
        }

        if (hashMapS.equals(hashMapT)) return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
