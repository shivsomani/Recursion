//Check if the given subString exists in the given string.
public class subString {
    public static void main(String[] args) {
        String name="amShivam";
       // String subString="Shiv";

        /*
        if(name.contains(subString))
        {
            System.out.println("Present");
        }*/
        System.out.println(EditShiv(name));

    }

    static String EditShiv(String name)
    {
        if(name.isEmpty())
        {
            return "";
        }

        //char ch=name.charAt(0);
        //If we find the sub String, skip those characters in the string.
        if(name.startsWith("Shiv"))         
        {
            return EditShiv(name.substring(4));
        }
        else
        {
           // char ch=name.charAt(0);
            return name.charAt(0)+ EditShiv(name.substring(1));
        }
    }
}
