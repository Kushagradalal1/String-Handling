package Strings;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
/*
String are immutable : java concept :


Concatenation : to add the two Strings :
Length : to find out the length of the string :
chartAt : to return the char of the String :
compareTo : to compare the two strings :
subString : to take a small string from the full given string :

 */
public class Strings {
    //String class is there in java :
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the String : ");
//        String s1= sc.nextLine();
//        System.out.println(s1);

//          String firstName="tony";
//          String lastName=" Stark";
//          String fullName=firstName.concat(lastName);
//          System.out.println(fullName);
//          int length=fullName.length();
//          //also counting the space characters :
//          System.out.println(length);
//
//          for (int i=0; i<fullName.length(); i++) {
//              System.out.println(fullName.charAt(i) + " " + i);
//          }

        //compare two strings :
//        String s1="sony";
//        String s2="tony";
//        int n=s1.compareTo(s2);
//        System.out.println(n);
//        //cases :  s1==s1 => 0
//        //cases : s1>s2  => +ve
//        //cases : s1< s2 => -ve

        //why we are using the compareTo function we have == as well because :
        //In some reasons it will fail bec :
//        if (new String("Tony") == new String("Tony")){
//            System.out.println("Both are equals");
//        }else {
//            System.out.println("Both are NOT equals");
//        }//just bec of  this String builder concept came into a picture :


        //SubString Concept :
        String sentance="my name is kushagra";
        //String name= sentance.substring(11);
        String name= sentance.substring(11,12);
        System.out.println(name);
    }


}
