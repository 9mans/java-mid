package lang.object.equals;

public class EqualsMain1 {

    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity:" + (user1 == user2));

        // equals 메서드를 살펴보면 내부 동작은 ==와 동일하기때문에 재정의 해줘야한다.
        System.out.println("equal:" + (user1.equals(user2)));

    }
}
