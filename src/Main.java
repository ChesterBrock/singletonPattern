public class Main {
    public static void main(String[] args) {

        // create an instance of MyClass
        // MyClass mc1 = new MyClass();
        MyClass mc1 = MyClass.getInstance("1");
        System.out.println(mc1.toString());

        MyClass mc2 = MyClass.getInstance("2");
        System.out.println(mc2.toString());
    }


}
