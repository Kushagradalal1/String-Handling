package StringExample;

public class FetchingStringExample {
    public static void main(String[] args) {

        //charAt(int) method :
        String s1="indore";
        char ch=s1.charAt(3);
        System.out.println(ch);

        //charAt(int) method example two :
        String name ="my name is tony";
        for (int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i)+" "+i);
        }

        //toCharAtArray : convert the string into a char arrays :
        String s3="indore";
        for (char temp : s3.toCharArray()){
            System.out.println(temp);
        }

        //getByte : convert the string into a byte arrays :
        String s5="bhopal";
        byte b[]=s5.getBytes();
        for (byte n : b){
            System.out.println(n);
        }
    }
}
