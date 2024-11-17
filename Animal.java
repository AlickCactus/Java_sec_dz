public class Animal {
    private String name;
    private String color;
    private int years;

    public  Animal(){

    }

    public Animal(String name_, String color_, int years_){
        name = name_;
        color = color_;
        years = years_;
    }

    public void say(){
        System.out.println("I can speak");
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String n){
        color = n;
    }

    public int getYears(){
        return years;
    }

    public void setYears(int n){
        years = n;

    }
}
