package StringExample;
/*
Example for equals method :

 */
public class CheckEqualsMethod {
    public static void main(String[] args) {
        //equals method :
        String s1="indore";
        String s2="bhopal";
        boolean res=s1.equals(s2);
        System.out.println(res);

        //equals ignore case method :
        String name="india";
        String country="India";
        //boolean result=name.equals(country);
        boolean result=name.equalsIgnoreCase(country);
        System.out.println(result);

        //startWith method :
        String dog="pull dog";
        boolean dogResult=dog.startsWith("pull");
        System.out.println(dogResult);

        //endWith method :
        String car="alto";
        boolean carResullt=car.endsWith("i");
        System.out.println(carResullt);

        //compareTo
        String sc="google.com";
        String eg="yahoo.in";
        int resu=sc.compareTo(eg);
        if (resu==0){
            System.out.println("its equals");
        }else {
            System.out.println("its not equals");
        }

        //compareToIgnore case method :
        String s3="building";
        String s4="Building";
        //int fs=s3.compareTo(s4);
        int fs=s3.compareToIgnoreCase(s4);
        if (fs==0){
            System.out.println("Equals");
        }else {
            System.out.println("Not Equals");
        }
    }
}
