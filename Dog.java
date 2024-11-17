public class Dog extends Animal{
    public Dog(String name_, String color_, int years_) {
        super(name_, color_, years_);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }
}
