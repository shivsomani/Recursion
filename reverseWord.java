//Program to reverse a word and string containing few words.
public class reverseWord {
    public static void main(String[] args)
    {
        String name="Shivam Somani";
        String reverse="";

        //System.out.println("The reverse of given string is:");
        //reverse(name);
        reverse1(name);

        /* 
        char[] characters=name.toCharArray();
        System.out.println(characters);

        for(int i=0;i<characters.length;i++)
        {
            System.out.print(characters[i]);
        }*/

        /* 
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse=reverse+name.charAt(i);
            //reverse= reverse.append(name.charAt(i));
        }
        System.out.println(reverse); */
    }

    //Reversing a string using iterative method.
    static void reverse(String name)
    {
        String reverse="";
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse=reverse+name.charAt(i);
            //reverse= reverse.append(name.charAt(i));
        }
        System.out.println(reverse);
    }

    //In pace reversal of a string using two pointers concept.
    static void reverse1(String name)
    {
        char[] characters=name.toCharArray();
        System.out.println(characters);
        int start=0;
        int end=name.length()-1;

        while(start<=end)
        {
            char ch=characters[start];
            characters[start]=characters[end];
            characters[end]=ch;

            start++;
            end--;
        }
        //System.out.println(characters);
        //Converting a character array into string again and displaying it.
        //String name2=new String(characters);
        //System.out.println(name2);
        System.out.println(new String(characters));
    }
}
