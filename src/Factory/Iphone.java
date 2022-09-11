package Factory;

public class Iphone extends Phone{
    @Override
    public void createPhone() {
        specifications.add(new IphoneProcessor());
    }
}
