package lang.immutable.adress;

public class RefMain2 {

    public static void main(String[] args) {

        ImmutableAdress a = new ImmutableAdress("서울");
        ImmutableAdress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        System.out.println("b -> 부산");

        b = new ImmutableAdress("부산");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
