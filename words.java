//LeetCode 2114 Solution 
//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/


public class words {
    public static void main(String[] args) {

        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        //String name="alice and bob love leetcode";

        int[] countofWords=new int[sentences.length];
        int x=0;

        for(int i=0;i<sentences.length;i++)
        {
            int ans=countWords(sentences[i]);
            countofWords[x++]=ans;
        }

        int max=countofWords[0];
        for(int j=1;j<countofWords.length;j++)
        {
            if(countofWords[j]>max)
            {
                max=countofWords[j];
            }
        }
        System.out.println(max);

        //char[] name1=new char[name.length()];
        //System.out.println(name1);
        // name1=name.toCharArray();
        //System.out.println(countWords(name));

        /* 
        int count=0;
        String search=" ";
        for(int i=0;i<name1.length;i++)
        {
            if(name1[i]==search)
            {
                count++;
            }
           // System.out.print(name1[i]+"");
        }*/

        /* 
        int count=0;
        //System.out.println(name1);
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)== ' ')
            {
                count++;
            }
        }
        System.out.println(count);*/
    }

    static int countWords(String str)
    {
        int count=0;
        if(str.isEmpty())
        {
            return count;
        }

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        return count+1;
    }
}
