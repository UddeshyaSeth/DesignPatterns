package Factory;

public class IphoneProcessor implements phoneSpecifications{
    @Override
    public void description() {
        System.out.println("A15 chip");
    }
}
