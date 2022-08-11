public class Horse extends Animal {
    //public String s = "Igo-go";
    public String getFood() {
        return "Seno";
    }

    public String getLocation() {
        return "Stoilo";
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }

    @Override
    public String toString() {
        return "Лошадь кушает " + getFood() +
                ", находится " + getLocation();
    }

}
