public class rearrange {
    public static void main(String[] args) {
        int[] array=new int[]{ 7, 1, 9, 2, 5, 8, 4, 3, 10};
        int index=0;
        int k=5;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]==k)
                break;
            else    
                index++;
        }
        System.out.println(index);
        //System.out.println(array);
        //reArrange(array,index);

        

    }

    static void reArrange(int[] array,int index)
    {
        int sortOn=array[index];
        int var1=0;
        int var2=index+1;

        while(var1!=index && var2 !=array.length)
        {
            int change=0;
            int change1=0;

            if(array[var1]>sortOn)
            {
                change=var1;
                var1++;
            }

            if(array[var2]<sortOn)
            {
                change1=var2;
                var2++;
            }
            exchange(array,change,change1);
        }
    }

    static void exchange(int[] array,int index1,int index2)
    {
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
