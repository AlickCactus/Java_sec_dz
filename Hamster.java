public class Hamster extends Animal{
    public Hamster(String name_, String color_, int years_) {
        super(name_, color_, years_);
    }

    @Override
    public void say() {
        System.out.println("Squeak");
    }
}
