package two.sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

     public static void main(String[] args) {
          int[] nums1 = {2, 7, 11, 15};
          int target1 = 9;
          int[] result1 = twoSum(nums1, target1);
          System.out.println("Indices of the pair in Example 1: [" + result1[0] + ", " + result1[1] + "]");

          int[] nums2 = {3, 2, 4};
          int target2 = 6;
          int[] result2 = twoSum(nums2, target2);
          System.out.println("Indices of the pair in Example 2: [" + result2[0] + ", " + result2[1] + "]");

          int[] nums3 = {3, 3};
          int target3 = 6;
          int[] result3 = twoSum(nums3, target3);
          System.out.println("Indices of the pair in Example 3: [" + result3[0] + ", " + result3[1] + "]");
     }

     public static int[] twoSum(int[] nums, int target) {
          Map<Integer, Integer> map = new HashMap<>();
          for (int i = 0; i < nums.length; i++) {
               int num = target - nums[i];
               if (map.containsKey(num)) {
                    return new int[]{map.get(num), i};
               } else {
                    map.put(nums[i], i);
               }
          }
          return new int[]{};
     }
}
