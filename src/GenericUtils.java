public class GenericUtils {

    public static <T> void reverse(T[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move pointers towards the middle
            left++;
            right--;
        }
    }

    public static <T extends Number> double sum(T[] array) {
        double total = 0.0;
        if (array == null) {
            return total;
        }

        for (T element : array) {
            if (element != null) {
                // Every Number subclass has a doubleValue() method
                total += element.doubleValue();
            }
        }
        return total;
    }
}