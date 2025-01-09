package Algorithm;

public class quickSort {

    public static void main(String args[]){

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
                //main reason of this part the small elements than pivot move left side of pivot
                // swap the nums[i+1],nums[j]
                //because in above condition pass then nums[i+1]>nums[j] //  nums[j]<pivot<nums[i+1]
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        // its happen after first iteration then high(pivot) and nums[i+1] swap
        //partition the array and set the new pivot for right sub array
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

}
