import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array.java");

        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("------");

        for (int x : arr) {
            System.out.println(x);
        }

        System.out.println("------");

        List<Integer> doubled = Arrays.stream(arr)
                .boxed()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        doubled.forEach(x -> {
            System.out.println(x);
        });

        System.out.println("------");

        int count = 0;

        while (count < 10) {
            System.out.println(count);
            count++;
        }
    }
}