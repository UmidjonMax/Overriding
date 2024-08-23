public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle(5, 4);
        Trapezium trapezium = new Trapezium(5, 7, 3);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(trapezium.area());
        System.out.println(trapezium.perimeter());

        Dog dog = new Dog("Many");
        System.out.println(dog.getName()+" says "+dog.sound());
        Duck duck = new Duck("Donald");
        System.out.println(duck.getName()+" says "+duck.sound());
        Cat cat = new Cat("Coco");
        System.out.println(cat.getName()+" says "+cat.sound());
    }
}