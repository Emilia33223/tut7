public class Wolf extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Wolf howls");
    }

    @Override
    public void roam(){
        System.out.println("Wolf is in Canine Family");
    }
}
