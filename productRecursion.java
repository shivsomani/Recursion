public class productRecursion {
    
    public static void main(String[] args) {
        int x=100;
        int y=50;

        if(x>y)
            System.out.println(findProduct(x,y));
        else
            System.out.println(findProduct(y,x));
    }

    public static int findProduct(int greater,int smaller)
    {
        if(smaller==0)
            return 0;
        
        return greater+findProduct(greater, smaller-1);
    }
}
