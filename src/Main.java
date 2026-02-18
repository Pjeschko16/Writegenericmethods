import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "fun", "and", "powerful"};
        System.out.println("Original String array: " + Arrays.toString(words));
        GenericUtils.reverse(words);
        System.out.println("Reversed String array: " + Arrays.toString(words));
        System.out.println("---");
        Integer[] ints = {10, 20, 30, 40};
        double intSum = GenericUtils.sum(ints);
        System.out.println("Integer array: " + Arrays.toString(ints));
        System.out.println("Sum of Integers: " + intSum);
        Double[] doubles = {1.5, 2.5, 3.5};
        double doubleSum = GenericUtils.sum(doubles);
        System.out.println("Double array: " + Arrays.toString(doubles));
        System.out.println("Sum of Doubles: " + doubleSum);
    }
}