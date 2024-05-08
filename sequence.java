
//In this program, we are trying to print all the patterns/sequences that can be generated using given string.
//That is, sub patterns, and sub strings.

public class sequence {
    public static void main(String[] args) {
        Sequence("", "abc");
    }

    //The logic is either to include or exclude an alphabet from the given unprocessed string.
    static void Sequence(String processed, String unProcessed)
    {
        if(unProcessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch=unProcessed.charAt(0);

        //In the first recursive call, we include the character at index 0 into our processed string and proceed.
        Sequence(processed+ch,unProcessed.substring(1));

        //In the second recursive call, we didnt ijnclude the character into our processed string.
        Sequence(processed,unProcessed.substring(1));
    }
}
