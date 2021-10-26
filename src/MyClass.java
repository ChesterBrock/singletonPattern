// Constraints : Make sure we never ever have more than one instance of this class in existance

public class MyClass {

    private static MyClass uniqueInstance;

    private String instanceNumber;

    //utility method
    public static MyClass getInstance(String instanceNumber) {
        // Ensure that we only ever have one instance of MyClass
        // Only create a new instance if one doesn't already exist
        if(uniqueInstance == null){
            uniqueInstance = new MyClass(instanceNumber);
        }
        return uniqueInstance;
    }

    // constructor method( first thing is to make it private)
    // Now the constuctor is private it can only be called within MyClass
    private MyClass(String instanceNumber){
        this.instanceNumber = instanceNumber;
        // Do all the things to initialize a MyClass object
    }

    public String toString(){
        return "MyClass: instanceNumber[" + instanceNumber + "];";

    }
}
