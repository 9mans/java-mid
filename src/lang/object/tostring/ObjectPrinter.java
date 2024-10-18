package lang.object.tostring;

public class ObjectPrinter {

    public static void print(Object object) {
        String s = "객체정보출력" + object.toString();
        System.out.println(s);
    }
}
