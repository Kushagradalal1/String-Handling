package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        //passing just a deli-meter :

        StringJoiner sj=new StringJoiner(",");
        // add() : to add the tokens strings :

        sj.add("rahul");
        sj.add("dalal");
        sj.add("paramount");
        sj.add("indore");
        System.out.println(sj);
    }
}
