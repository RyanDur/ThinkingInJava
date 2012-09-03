public class Ex7 {
    public static void main(String[] args) {
        Incrementable incrementable = new Incrementable();
        StaticTest staticTest = new StaticTest();
        System.out.println(StaticTest.i);
        incrementable.increment();
        System.out.println(StaticTest.i);
    }
}
