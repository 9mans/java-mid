package lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {

        ImmutableObj immutableObj = new ImmutableObj(10);

        ImmutableObj immutableObj2 = immutableObj.add(20);

        System.out.println("immutableObj = " + immutableObj.getValue());
        System.out.println("immutableObj2 = " + immutableObj2.getValue());

    }
}
