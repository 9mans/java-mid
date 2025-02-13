package lang.immutable.adress;

public class ImmutableAdress {

    // 불변 객체를 만드는 방법 변수에 final을 선언한다
    // 혹은 set 메서드를 구현하지 않으면 변수의 값을 최초에 생성자로 입력 후 수정할 방법이 없다.

    private final String value;

    public ImmutableAdress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
