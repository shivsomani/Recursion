public class prefix {
    public static void main(String[] args) {
        String words[] = {"leetcode","win","loops","success"};
        String search="code";
        int count=0;

        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(search))
            {
                System.out.println(words[i]);
                count++;
                break;
            }
        }
        System.out.println(count);

        /*
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }*/
    }
}
