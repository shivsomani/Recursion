public class shuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4,5,6,7,0,2,1,3};

        //Output: "leetcode"

        char[] demo=s.toCharArray();
        System.out.println(demo);

        for(int i=0;i<demo.length;i++)
        {
            //System.out.print(i+" ");
            //System.out.print(indices[i]+" ");

            int num=i;
            int num1=indices[i];

            char ch=demo[num];
            demo[num]=demo[num1];
            demo[num1]=ch;

            /* 
            if(i!=indices[i])
            {
                char ch=demo[i];
                demo[i]=demo[indices[i]];
                demo[indices[i]]=ch;
            }*/
        }
        String result=new String(demo);
        System.out.println(result);
        System.out.println(demo);
    }
}
