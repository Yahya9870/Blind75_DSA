package day_2_DSA;

import java.util.Arrays;

public class TwoSum_II {
    public static void main(String[] args) {
        int[] numbers = {-10, -7, -4, -3, -1, 0, 1, 2, 4, 5, 7, 9, 11, 13, 15, 18};

        int target = 0;
        System.out.println(Arrays.toString(twoSum(numbers, target)));



    }



    public static int [] twoSum(int[] nums, int target) {




        int left = 0, right = nums.length-1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int [] {left+1, right+1};
            }
            else if (sum < target) {
                left++;
            }

            else{
                right--;
            }
        }

        return new int []{-1,-1};

    }


}
