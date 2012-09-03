public class Ex8 {
    public static void main(String[] args) {
        Incrementable incrementable = new Incrementable();
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();

        System.out.println(staticTest1.i);
        System.out.println(staticTest2.i);

        incrementable.increment();

        System.out.println(staticTest1.i);
        System.out.println(staticTest2.i);
    }
}
