package lang.object.tostring;
public class ToStringMain2 {

    public static void main(String[] args) {


        Car car = new Car("Model y");
        Dog dog = new Dog("강아지", 1);
        Dog dog1 = new Dog("강아지2", 2);

        for (String arg : args) {


        }
        System.out.println(dog1.toString());
        System.out.println(dog.toString());
        System.out.println(car.toString());

        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog);
        ObjectPrinter.print(car);

        // toString()을 재정의해서 객체의 참조값을 확인할 수 없을 때 확인하는 방법
        // 객체의 참조 값은 System.identityHashCode() 메서드를 통해 확인할 수 있다.
        // 위 메서드를 실행해서 얻는 값은 정수형이고 이것이 객체의 참조값이지만 object의 toString과는 약간 다른값이 출력된다.
        // 우리가 평소 object의 toString()으로 확인할 수 있는 값은 이 참조값을 16진수로 표현한 값이다.
        // Integer.HexString() 메서드를 통해 참조값을 16진수로 변경하여 출력할 수 있다

        // identityHashCode를 사용하여 참조값 확인
        int refNumber1 = System.identityHashCode(dog1);
        int refNumber2 = System.identityHashCode(dog);
        int refNumber3 = System.identityHashCode(car);

        System.out.println("정수 참조값");
        System.out.println(refNumber1);
        System.out.println(refNumber2);
        System.out.println(refNumber3);

        // 참조값을 16진수로 변환
        String refValue1 = Integer.toHexString(refNumber1);
        String refValue2 = Integer.toHexString(refNumber2);
        String refValue3 = Integer.toHexString(refNumber3);

        System.out.println();
        System.out.println("16진수 문자열 참조값");
        System.out.println(refValue1);
        System.out.println(refValue2);
        System.out.println(refValue3);


    }
}
