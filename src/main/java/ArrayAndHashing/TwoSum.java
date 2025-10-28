// Problem Statement https://neetcode.io/problems/two-integer-sum?list=neetcode150

package ArrayAndHashing;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (prevHashMap.containsKey(diff))
                return new int[] { prevHashMap.get(diff), i};
            prevHashMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
