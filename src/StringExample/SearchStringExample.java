package StringExample;

public class SearchStringExample {
    public static void main(String[] args) {

        //indexOf(Char) :

        String s1="my name is tony";
        int idx=s1.indexOf('i');
        System.out.println(idx); //returning the index of the 'i' char is 8.

        //example I have m is two times present in the string :

        //indexOf(char, int) :
        //I don't want to start searching from the first char :
        //int res=s1.indexOf('m'); //In this case 'm' is present at Index : 0.
        int res=s1.indexOf('m',1); // In this case 'm' is present at Index : 5.
        System.out.println(res);


        //indexOf(String) :
        String city="my fav city is indore";
        int cityRes=city.indexOf("bhopal");//case : not there return -1.
        System.out.println(cityRes);

        //indexOf(String, int) :
        String dog="my fav dog is pull dog";
        int dogRes=dog.indexOf("pull");
        System.out.println(dogRes);
    }
}
