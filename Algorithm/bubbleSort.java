package Algorithm;

public class bubbleSort {

    public static void main(String args[]){
        int[] nums = {5,9,4,3,2,1};

        System.out.println("before sorting : ");
        for(int num : nums){
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println();
        int temp = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                temp = nums[j];
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

            for (int n : nums){
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("after sorting : ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}

