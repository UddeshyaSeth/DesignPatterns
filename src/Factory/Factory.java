package Factory;

public class Factory {
    public static void main(String[] args) {
        Phone android = phoneFactory.getPhone(PhoneType.ANDROID);
        Phone iphone = phoneFactory.getPhone(PhoneType.IPHONE);
        Phone android1 = phoneFactory.getPhone(PhoneType.ANDROID);


        System.out.println(android.specifications.get(0).toString());
        System.out.println(iphone.specifications.get(0).toString());
        System.out.println(android1.specifications.get(0).toString());
    }
}
