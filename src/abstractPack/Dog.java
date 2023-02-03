package abstractPack;

public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name,age);
    }
    @Override
    public void say() {
        System.out.println("Dog name:" + name + "\nDog age:" + age);
        System.out.println("Dog say: " + "Woof!");
    }
}
