package Algorithm;

public class search {

    public static void main(String arg[]){

        int nums[] = {2,4,8,10,12};
        int target = 20;

        int result1 =  leanerSearch(nums,target);
        if(result1 != -1)
            System.out.println("Element found at "  +  result1);
        else
            System.out.println("Element not found");

        int result2 = binarySearch(nums,target);
        if(result2 != -1)
            System.out.println("Element found at "  +  result2);
        else
            System.out.println("Element not found");
    }

    //leaner method
    public static int leanerSearch(int[] nums, int target) {
        int length = nums.length;
        int step = 0;

        for (int i=0; i< length ; i++){
            step ++;
            if(nums[i]==target) {
                System.out.println("no of step taken for leaner Algorithm.search " + step);
                return i;
            }
        }
        System.out.println("no of step taken for leaner Algorithm.search " + step);
        return -1;
    }

    //binary method
    public static int binarySearch(int[] nums1, int target) {
        int left = 0;
        int right = nums1.length-1;
        int step =0;

        while (left <= right) {
            step ++;
            int mid = (left + right ) / 2;
            if (nums1[mid] == target) {
                System.out.println();
                System.out.println("no of step taken for binary Algorithm.search " + step);
                return mid;
            } else if (nums1[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println();
        System.out.println("no of step taken for binary Algorithm.search  " + step);
        return -1;
    }
}
