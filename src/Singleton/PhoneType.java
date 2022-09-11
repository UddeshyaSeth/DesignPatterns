package Singleton;

public class PhoneType {
/*
    You usually keep the single instance of the Singleton class in a static variable of that class.
    This doesn't make that instance static. Only the reference to it is static.
    Since you can only obtain that single instance via a static method of the class
    (you can't explicitly construct instances of a Singleton class via a constructor - otherwise it wouldn't be a singleton),
    the reference to that instance must be stored in a static variable.
*/
    private static PhoneType p1; // This a lazy loading example of the singleton
    //  private static PhoneType p1 = new PhoneType();  This is not used generally.
    private PhoneType() { } // The constructor is made Private.
/*
    Since if we don't make the getInstance() method static
    it won't be accessed outside the class as we need the object of the class to access the non-static
    member of the class, and here it is not possible to create an object outside the class as the constructor
    is private.
    In case of static member of the class, they can be accessed using the CLASSNAME.getMember();
    See it in the SingletonExample.class
*/
    public static synchronized PhoneType getInstance() {
       if(p1 == null)
            p1 = new PhoneType();
       return p1;
    }
}
