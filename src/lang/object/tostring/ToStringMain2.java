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

    }
}
