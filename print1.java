public class print1 {
    public static void main(String[] args) 
    {
        printNum(1);
    }

    public static void printNum(int num)
    {
        if(num==5)
        {
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printNum(num+1);
    }
}
