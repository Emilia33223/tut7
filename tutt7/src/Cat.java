public class Cat extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Cat meows");
    }

    @Override
    public void roam(){
        System.out.println("Cat is in Feline Family");
    }
}
