public class search {

    public static void main(String arg[]){
        int nums[] = {2,4,8,10,12};
        int target = 12;

        int result =  leanerSearch(nums,target);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "  +  result);


        int nums1[]={1,3,5,7,9,0};
        int target1= 7;

        int result1 = binarySearch(nums1,target1);

        if(result1 == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "  +  result1);


    }

    public static int binarySearch(int[] nums1, int target1) {
        int left = 0;
        int right = nums1.length-1;

        while (left <= right) {
            int mid = (left + right ) / 2;  // Avoids overflow

            if (nums1[mid] == target1) {
                return mid;
            } else if (nums1[mid] < target1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int leanerSearch(int[] nums, int target) {
        int length = nums.length;
        for (int i=0; i<= length-1 ; i++){
            if(nums[i]==target)
                return i ;
        }
        return -1;
    }
}
