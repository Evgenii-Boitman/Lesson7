public abstract class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat();
        animal[1] = new Horse();
        animal[2] = new Dog();
        for (int i = 0; i < animal.length; i++) {
            Veterinar.treatAnimal(animal[0]);
            Veterinar.treatAnimal(animal[1]);
            Veterinar.treatAnimal(animal[2]);
            System.out.println(animal[0] + " и идет к ветеринару");
            System.out.println(animal[1] + " и идет к ветеринару");
            System.out.println(animal[2] + " и идет к ветеринару");
        }


    }
}
