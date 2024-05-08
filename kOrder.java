// Given "n" elements of type ui32, starting from address "d".
// And another ui32 variable "k".

// Reorder given array such that all elements < k occurr before all elements >= k
//  array before korder for k=5 =>  7 1 9 2 5 8 4 3 10 
//  possible array after korder for k=5 =>  1 2 4 3 7 9 5 8 10 

/*
   boxtype none korder(addr d, ui32 n, ui32 k)

   box none korder(addr d, ui32 n, ui32 k)
        // Complete this box
   endbox*/


public class kOrder
{
    public static void main(String[] args) 
    {
        int[] nums={7, 1, 9, 2, 5, 8, 4, 3, 10};
        //rearrange(nums,5);
        int index=0;
        int k=5;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=k)
                index++;
            else if(nums[i]==k)
                break;
        }
        System.out.println(index);
        //int var1;
        //int var2;
    }
    /* 
    static rearrange(int[] nums,int k)
    {
        int 
    }*/
}

