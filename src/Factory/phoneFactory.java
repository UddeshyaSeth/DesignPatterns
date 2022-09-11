package Factory;

public class phoneFactory {
    public static Phone getPhone(PhoneType phoneType) {
        switch (phoneType) {
            case ANDROID: return new Android();
            case IPHONE: return new Iphone();
            default: return null;
        }
    }
}
