public class Dog extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Dog barks.");
    }

    @Override
    public void roam(){
        System.out.println("Dog is in Canine Family");
    }
}
