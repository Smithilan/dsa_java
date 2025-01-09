public class insertionSort {

    public static void main(String args[]){
        int[] nums = {2,5,7,1,9};

        System.out.println("before sorting");
        for(int num : nums){
            System.out.print(num +" ");
        }

        System.out.println();
        System.out.println();

        for(int i=1; i<nums.length; i++){
           int j = i-1;
           int key = nums[i];
            while (j>=0 && nums[j]>key ){

                nums[j+1] =nums[j];
                j--;
            }
            nums[j+1]=key;
            for(int num : nums){
                System.out.print(num +" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num +" ");
        }

    }

}
