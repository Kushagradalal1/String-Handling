package StringBuilderExample;

public class StringBuilderExample {
    public static void main(String[] args) {
        //declaring the string builder object :
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //char at Index 0 :
        System.out.println(sb.charAt(0));

        //set the char at the index :
        sb.setCharAt(0,'S');
        System.out.println(sb);

        //insert function :
        sb.insert(0,'K');
        System.out.println(sb);

        //insert at the index ;
        sb.insert(3,'l');
        System.out.println(sb);

        //delete function :
        sb.delete(1,3); // remember ending chart will be there it will not be deleted :
        System.out.println(sb);

        //append() : to append the char into a last :
        sb.append("lol");
        System.out.println(sb);

        //length() : to print the length for the string builder :
        int res=sb.length();
        System.out.println(res);

        //reverse a string :
        sb.reverse();
        System.out.println(sb);
    }
}
