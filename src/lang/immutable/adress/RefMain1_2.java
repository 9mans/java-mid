package lang.immutable.adress;

public class RefMain1_2 {
    public static void main(String[] args) {

        Adress a = new Adress("서울");
        Adress b = new Adress("서울");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
