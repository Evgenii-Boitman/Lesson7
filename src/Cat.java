public class Cat extends Animal {
    //public String s = "Myau";
    public String getFood() {
        return "Korm";
    }

    public String getLocation() {
        return "Home";
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит");
    }

    @Override
    public String toString() {
        return "Кот кушает " + getFood() +
                ", находится " + getLocation();
    }

}
