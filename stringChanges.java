public class stringChanges {
    public static void main(String[] args) {
        String str="baccad";
        String result="";
        //System.out.println("The string after omitting the characters is: "+Edit(str));
        //System.out.println("The string after omitting the characters is: "+Edit2(str));
        //System.out.println("The string after omitting the characters is: " + Edit3(result,str));
        Edit3(result,str);
    }

    static String Edit(String name)
    {
        String result="";
        //Character omit='a';
        for (int i=0;i<name.length();i++)
        {
            if(name.charAt(i)!='a')
            {
                result=result+ name.charAt(i);
            }
        }
        return result;
    }


    //Edit2- removing the characters using recursion
    static String Edit2(String name)
    {
        if(name.isEmpty())
        {
            return "";
        }

        char ch=name.charAt(0);

        if(ch=='a')
        {
            return Edit2(name.substring(1));
        }
        else
        {
            return ch+ Edit2(name.substring(1));
        }
    }

    static void Edit3(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        if(ch=='a')
        {
            Edit3(p,up.substring(1));
        }
        else
        {
            Edit3(p+ch,up.substring(1));
        }
    }
}
