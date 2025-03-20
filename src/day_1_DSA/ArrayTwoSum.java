package day_1_DSA;

public class ArrayTwoSum {
    public static void main(String[] args) {
        int[] testArray = {3, 5, 11, 4};
        int target = 9;
        int[] indices = twoSum(testArray, target);
        System.out.println("Indices: " + indices[0] + ", " + indices[1]);  // Should print: Indices: 0, 1
    }


    public static int[] twoSum(int[] nums, int target) {

        //Write your Java Code here:

        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};

                }
            }

            }
           return new int[]{-1, -1};
        }


    }



