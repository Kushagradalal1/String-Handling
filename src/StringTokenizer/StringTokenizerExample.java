package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("My name is tony stark");

        //int countTokens() : Count in Advance the Strings
        int res=st.countTokens();
        System.out.println(res);

        // bool hasMoreTokens() : check whether token is there or not?
        while (st.hasMoreElements()) {

            //String nextToken() :  Get the tokens here.
            System.out.println(st.nextToken());
        }
    }
}
