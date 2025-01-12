import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("5\n"); // count
        sb.append("2\n");
        sb.append("3\n");
        sb.append("5\n");
        sb.append("9\n");
        sb.append("16");

        String output = Evens.extractEvens(sb);

        System.out.println(output);
    }
}

public class Evens {
    public static String extractEvens(StringBuilder sb) {
        // Parse the input into individual values to work with
        String[] input = sb.toString().split("\n");

        // Filter the input to find the evens 
        Integer[] evens = Arrays.stream(input)
                .skip(1) // The first number is the count so it must be removed
                .map(x -> Integer.parseInt(x))
                .filter(x -> Utils.isEven(x))
                .toArray(Integer[]::new);

        // Create the output string
        String output = new StringBuilder()
                .append(evens.length)
                .append("\n")
                .append(evens[evens.length - 1])
                .toString();

        return output;
    }
}

public class Utils {
    public static Boolean isEven(Integer value) {
        return value % 2 == 0;
    }
}