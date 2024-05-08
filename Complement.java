//~ symbol represents bitwise complement. It returns 2's complement of a number.

public class Complement {
    public static void main(String[] args) {
        int num=5;
        System.out.println(comp(num));
    }

    static int comp(int num)
    {
            return ~num;            //Bitwise Complement of num is equal to -(num+1).
    }
}
