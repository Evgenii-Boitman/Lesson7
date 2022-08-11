public class Dog extends Animal {
    //public String s = "Gav";
    public String getFood() {
        return "Myaso";
    }

    public String getLocation() {
        return "Budka";
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }

    @Override
    public String toString() {
        return "Собака кушает " + getFood() +
                ", находится " + getLocation();
    }

}
