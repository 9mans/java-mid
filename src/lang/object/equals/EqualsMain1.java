package lang.object.equals;

public class EqualsMain1 {

    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity:" + (user1 == user2));

        // equals 메서드를 살펴보면 내부 동작은 ==와 동일하기때문에 재정의 해줘야한다.
        // 동등성의 기준은 클래스마다 다 다르기 때문에 이를 equals()에서 비교를 할 수 없어 동일성 비교를 구현해놓은 상태다
        // 그렇기 때문에 이를 재정의한다
        System.out.println("equal:" + (user1.equals(user2)));

    }
}
