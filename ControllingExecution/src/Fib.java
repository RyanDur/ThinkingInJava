public class Fib {
    int i;
    int k;
    int j;

    public Fib() {
        i = 0;
        k = 1;
    }

    public void printFib(int num) {
        for (int l = 0; l < num; l++) {
            System.out.println(j = i + k);
            i = k;
            k = j;
        }
    }
}
