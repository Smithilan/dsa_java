public class quickSort {

    public static void main(){

        int[] nums = {1,9,8,35,6,89};

        quickSorting(nums,0,nums.length-1);

        for(int num : nums)
        System.out.print(num + " ");
    }

    public static void quickSorting(int[] nums, int low, int high) {

        if(low<high){
            int pivotIndex = partition(nums,low,high);
            quickSorting(nums,0,pivotIndex-1); // sort the left array
            quickSorting(nums,pivotIndex+1,high);   // sort the right array

        }
    }

    private static int partition(int[] nums, int low, int high) {

        int i = low - 1;
        int pivot = nums[high];

        for (int j = low; j < high; j++) {
            int temp = 0;
            if (nums[j] < pivot) {
                i++;
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

}
