package lang.object;

public class ObjectMain {

    // 오브젝트는 객체의 공통기능을 모아두기 위해 만든 클래스라고 생각하자
    public static void main(String[] args) {

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString은 오브젝트 클래스의 메서드
        String string = child.toString();
        System.out.println(string);
    }
}
