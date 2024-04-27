public class removeA {
    public static void main(String[] args) {
        String name="baccad";

        int length=name.length();
        String result="";

        for(int i=0;i<length;i++)
        {
            if(name.charAt(i)!='a')
            {
                result=result+name.charAt(i);
            }
        }
        System.out.println(result);
    }
}
