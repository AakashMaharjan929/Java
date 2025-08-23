public class UncheckedException {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // Accessing an out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index out of bounds exception occurred!");
        } catch (NullPointerException ex) {
            System.out.println("Null pointer exception occurred!");
        }
    }
}