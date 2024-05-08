public class sumOfDigitsRecursive {
    public static void main(String[] args) {
        int num=12345;
        System.out.println(sumOfDigits(num, 0));

    }
    public static int sumOfDigits(int num,int sum)
    {
        if(num==0)
            return sum;
        
        return (num%10)+sumOfDigits(num/10, sum);
    }
}
