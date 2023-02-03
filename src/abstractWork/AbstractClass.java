package abstractWork;

public class AbstractClass {
    public static void main(String[] args) {
        Addition addition = new Addition(1,2);
        System.out.println(addition.perform());
        Multiplication multiplication = new Multiplication(4,2);
        System.out.println(multiplication.perform());
    }
}
