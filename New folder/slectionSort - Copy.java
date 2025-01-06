public class slectionSort {

    public static void main(String args[]) {
        int[] nums = {4, 5, 7, 1, 8};

        System.out.println("before sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }

        int minIndex=-1;
        int temp=0;
        for (int i = 0; i<nums.length-1; i++) {
            minIndex=i;
            for(int j=i+1; j< nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

//            temp=nums[minIndex];
//            nums[minIndex]=nums[i];
//            nums[i]=temp;

            System.out.println();
            for(int n:nums){
                System.out.print(n+" ");
            }
        }

        System.out.println();
        System.out.println("after sorting");
        for(int n:nums){
            System.out.print(n+" ");
        }

    }
}
