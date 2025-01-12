import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static int sharedValue = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sleep Sort");

        int[] numbers = { 5, 2, 1, 6, 7, 8, 9 };
        int[] sorted = new int[7];
        int count = 0;

        List<Thread> threads = new ArrayList<>();

        for (int number : numbers) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(number * 5);
                    sorted[sharedValue] = number;
                    sharedValue++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            thread.start();

            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        for (int x : sorted) {
            System.out.println(x);
        }

    }
}