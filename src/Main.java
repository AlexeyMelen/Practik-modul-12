public class Main {

    public static void main(String[] args) {
        int[] numbers = { -1, 7, 3, 12, -4 };

        ThreadMinMax t1 = new ThreadMinMax(numbers);
        ThreadMinMax t2 = new ThreadMinMax(numbers);
        try {
            t1.getThread().join();
            t2.getThread().join();
        }
        catch (InterruptedException e) {
            System.out.println("Error.");
        }
        System.out.println("max = " + t1.getMax());
        System.out.println("min = " + t1.getMin());
    }
}