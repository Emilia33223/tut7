public class Lion extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Lion roars");
    }

    @Override
    public void roam(){
        System.out.println("Lion is in Feline Family");
    }
}
