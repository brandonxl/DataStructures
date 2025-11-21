package TwoPointers;

import java.util.Arrays;

public class MergeFinal {
    public static void main(String[] args) {
        int[] l1 = {0};
        int[] l2 = {1};

        merge(l1,0,l2,1);
    }

    static public void merge(int[] nums1, int m, int[] nums2, int n){
        int currentIndexArray1 = m -1;
        int currentIndexArray2 = n -1;
        int k = nums1.length - 1;

      while(currentIndexArray2 >= 0){
          if(currentIndexArray1 >= 0 && nums1[currentIndexArray1] > nums2[currentIndexArray2]){
              nums1[k--] = nums1[currentIndexArray1--];
          }else{
              nums1[k--] = nums2[currentIndexArray2--];
          }
      }
        System.out.println(Arrays.toString(nums1));



    }

}
