package Factory;

public class Android extends Phone{

    @Override
    public void createPhone() {
        specifications.add(new andoridPhoneProcesser());
    }
}
