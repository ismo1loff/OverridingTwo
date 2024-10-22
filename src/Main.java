public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Duck duck = new Duck();
        Cat cat = new Cat();

        System.out.println("1. " + dog.getName());
        System.out.println(dog.sound());
        System.out.println("2. " + duck.getName());
        System.out.println(duck.sound());
        System.out.println("3. " + cat.getName());
        System.out.println(cat.sound());
    }
}