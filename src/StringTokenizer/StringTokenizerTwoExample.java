package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTwoExample {
    /*
    StringTokenizer can also pass the two parameters in his constructor :
    StringTokenizer : to divide the tokens into which basis : we can also define the tokens to divide the String.
    The first parameter is known as String passing : And Second Parameter is Deli-meter.

     */

    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("java,c++,vscode",",");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
