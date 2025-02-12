package lang.immutable.adress;

public class RefMain1_3 {

    public static void main(String[] args) {

        Adress a = new Adress("서울");
        Adress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    private static void change(Adress adress, String changeAddress) {
        System.out.println("주소 변경 " + changeAddress);
        adress.setValue(changeAddress);
    }
}
