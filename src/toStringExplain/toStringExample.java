package toStringExplain;

public class toStringExample {
    int rollNo;
    String name;

    toStringExample(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    @Override
    public String toString() {
        return "toStringExample{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        toStringExample student=new toStringExample(1,"kushagra");
        toStringExample studentTwo=new toStringExample(2,"ravi");

        System.out.println(student);
        System.out.println(studentTwo);

    }
}
