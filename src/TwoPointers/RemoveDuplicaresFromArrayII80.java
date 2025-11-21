package TwoPointers;

public class RemoveDuplicaresFromArrayII80 {
    public static void main(String[] args) {

        int[] array = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates(array);
        System.out.println(result);

    }

    public static  int removeDuplicates(int[] nums) {
        int write = 0;

        if(nums.length < 3) return nums.length;

        for(int i = 0; i < nums.length; i++){
            if(write < 2 || nums[i] != nums[ write -2]){
                nums[write] = nums[i];
                write++;
            }
        }

        return write;
    }
}
