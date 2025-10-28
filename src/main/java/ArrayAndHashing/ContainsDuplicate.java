// Problem Statement https://neetcode.io/problems/duplicate-integer?list=neetcode15

package ArrayAndHashing;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num))
                return true;
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[] {1, 4, 2, 3, 5}));
    }
}