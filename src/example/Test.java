package example;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Dog();
        System.out.println(animal.Barking());
        animal=new Cat();
        System.out.println(animal.Barking());
    }
}
