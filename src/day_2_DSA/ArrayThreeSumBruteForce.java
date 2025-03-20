package day_2_DSA;

import java.util.Arrays;

public class ArrayThreeSumBruteForce {
    public static void main(String[] args) {

        int [] arr ={-3,3,4,-3,1,2};
        System.out.println(Arrays.toString(threeSumBruteForce(arr)));

    }

    public static int [] threeSumBruteForce(int[] nums) {
        for (int i = 0; i <nums.length-2 ; i++) {
            for (int j = i+1; j < nums.length-1 ; j++) {
                for (int k = j+1; k < nums.length ; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        return new int []{i, j ,k};
                    }
                }
            }

        }

        return new int []{-1,-1,-1};
    }
}
