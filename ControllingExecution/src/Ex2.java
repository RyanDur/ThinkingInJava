import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        int oldNum = random.nextInt();
        for (int i = 0; i < 25; i++) {
            int newNum = random.nextInt();
            if (oldNum > newNum) {
                System.out.println("oldNum " + oldNum + " is greater than newNum " + newNum);
            } else {
                System.out.println("newNum " + newNum + " is greater than oldNum " + oldNum);
            }
            oldNum = newNum;
        }
    }
}
