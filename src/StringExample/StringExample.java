package StringExample;

public class StringExample {
    /*

    Why we are using String :
    to search something into a string :
    to concat the given two string :
    to covert the string into uppercase to lowercase :

    : in c++ : header file called <String.h> :
    : in Java : we don't have any header file : we have string classes :

    : String
    : StringBuffer
    : StringBuilder
    : StringTokenizer
    : StringJoiner

    to store the String : we can store the string in two ways :
    : String : immutable : Objects
    : StringBuffer : mutable : Objects

    String s1=new String("indore")
    StringBuffer s2=new StringBuffer("indore")

    String Pool : For to reduce the heap memory prob :

    this all are the static methods :

    To compare the String we have static methods :
    1) equals : to check the contains of the string whether it is equals ot not.
    2) equalsToIgnoreCase : to check the contains but insensitive.
    3) startsWith : to check whether it's starting from the char or not?
    4) endWith : to check whether its ending form the char or not/
    5) compareTo : to check the contains of the two strings
    6) compareToIgnoreCase : to check the contains of the two string. it's insensitive.


    To Search something in a string :
    1) indexOf(char) : searching fail will get -1 : start searching from index [0]
    2) indexOf(char,int) : searching start with position :
    3) indexOf(String) : search for a one string into a string :
    4) indexOf(String,int) : searching starts with position for a string :


    To Fetch Something into a String :
    1) charAt(int) : return the char : passing index :
    2) toCharArray() : Convert the entire string into a char array :
    3) getByte() : return the byte : Convert the string into a byte arrays :


    String Methods :
    1) toUpperCase : convert the lower case string into an upper case.
    2) toLowerCase : convert the upper case string into a lower case.
    3) trim() : truncates the leading and trailing wide spaces.
    4) subString(int) : forms a new string invoking a string.
    5) subString(int, int) : string and ending range.




    : StringBuilder : to modified easy. StringBuilder is a class in the Java API that provides a mutable sequence of characters.
    It is used for dynamic string manipulation, such as building strings from many smaller strings or appending new characters to
    an existing string.

    : String in java are immutable : stack store the memory : heap memory is also there.
    : Stack we are storing the references and actual values are storing in the heap memory.


    : StringBuffer : StringBuffer and String Builder Classes are the same
    but the difference is StringBuffer methods are synchronized & StringBuilder
    methods are non-synchronized.

    : Method level synchronized -> declared the method as synchronized
    : Blocked level synchronized -> declared the block as synchronized

    : String Tokenizer : java 5 on-words : In Java String Tokenizer class is used to create the Token (Parts) of a given string.
    : String Tokenizer is a package of java.util.package :

    Methods for String Tokenizer :
    : bool hasMoreTokens() : check whether token is there or not?
    : String nextToken() :  Get the tokens here.


    : String Joiner : java 8 on-words : used for to add the String tokens :
    : just need to pass a deli-meter : example :
    StringJoiner sj=new StringJoiner(",")

    */
}
