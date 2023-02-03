package abstractPack;

public class Cat extends Pet{
    public Cat(String name, int age) {
        super(name,age);
    }
    @Override
    public void say() {
        System.out.println("Cat name:" + name + "\nCat age:" + age);
        System.out.println("Cat say: " + "Meow!");
    }
}
