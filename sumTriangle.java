/*
A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28] 
         [8, 12, 16] 
         [3, 5, 7, 9] 
         [1, 2, 3, 4, 5]
          */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.xml.transform.Source;

public class sumTriangle 
{
    public static void main(String[] args) 
    {
        int[] nums=new int[]{1, 2, 3, 4, 5};
        displayArray(nums,nums.length);
    }

    public static void displayArray(int[] nums, int length)
    {
        if(length==1)
        {
            System.out.println("[" +nums[0]+ "]");
            return;
        }

        int[] nums1=new int[nums.length-1];
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=nums[i]+nums[i+1];
        }

        displayArray(nums1, nums1.length);

        /* 
        //Set is just used so that the values could be displayed in brackets (properly)!
        //Doesnt matters if you use set or not.
        Set<Integer> values=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            //System.out.print(nums[i]+" ");
            values.add(nums[i]);
        }
        System.out.print(values);
        System.out.println();*/

        //Arrays.toString() performs the same function as we did with set.
        System.out.println(Arrays.toString(nums));
    }
}
