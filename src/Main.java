import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[] ints = redNumbersFromFile("Liczby.txt");
//        System.out.println(Arrays.toString(redNumbersFromFile("Liczby.txt")));
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println("Lower number: " + ints[0]);
        System.out.println("Higher number: " + ints[29]);
        System.out.println("Adres wystąpienia liczby 15: " + Arrays.binarySearch(ints, 15));


    }

    static int[] redNumbersFromFile(String filename) throws FileNotFoundException {
        int[] numbers = new int[30];
        Scanner scan = new Scanner(new File(filename));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }

    void loverNumber(int[] ints) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            integers.add(ints[i]);
        }
        System.out.println(Collections.min(integers));


    }

}