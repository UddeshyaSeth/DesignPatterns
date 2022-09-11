package Singleton;

/* Characteristics of the Singleton Class
* 1. The Constructor is Private and contains no parameter.
* 2. Getter function is static and synchronized (giving way for Thread Safety).
* 3. Static in nature.
* */

public class SingletonExample {
    public static void main(String[] args) {
        PhoneType p1 = PhoneType.getInstance();
        PhoneType p2 = PhoneType.getInstance();
        System.out.println(p1);
        System.out.println(p2);
    }
}