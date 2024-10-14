package lang.object.poly;

public class ObjectPolyEx1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        car.move();

        Object o = dog;

        action(dog);
        action(car);

    }



    private static void action(Object object) {

        // 다운캐스팅 인스턴스오프 선언시 타입 옆에 변수명을 적어주면 다운캐스팅을 명시하지 않아도 된다.
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car c) {
            c.move();
        }
    }
}
