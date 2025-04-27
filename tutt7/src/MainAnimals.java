public class MainAnimals {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Dog dog = new Dog();
        Cat cat = new Cat();

        lion.makeNoise();
        lion.roam();

        dog.makeNoise();
        dog.roam();

        cat.makeNoise();
        cat.roam();
    }
}
