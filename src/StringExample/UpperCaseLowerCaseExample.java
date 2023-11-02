package StringExample;

public class UpperCaseLowerCaseExample {
    public static void main(String[] args) {
        //toUpperCase Example :
        String s1="indore";
        String upperCase=s1.toUpperCase();
        System.out.println(upperCase);

        //toLowerCase Example :
        String s2="INDORE";
        String lowerCase=s2.toLowerCase();
        System.out.println(lowerCase);


        //trim() :
        String s3="     my name is tony     ";
        System.out.println("Before trim : ");
        System.out.println(s3);
        System.out.println("After trim : ");
        String res =s3.trim();
        System.out.println(res);

        //subString(int) :
        String e="element";
        String e1=e.substring(3);
        System.out.println(e1); //output : ment.

        //subString(int, int) :
        String r="red color";
        System.out.println(r.substring(2,5)); //output : d_c

    }
}
