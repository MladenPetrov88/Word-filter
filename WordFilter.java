import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Arrays.stream(input).filter(a -> a.length() % 2 == 0).forEach(a -> System.out.println(a));

    }
}
