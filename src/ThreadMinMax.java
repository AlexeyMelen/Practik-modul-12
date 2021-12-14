class ThreadMinMax implements Runnable {

    private Thread thr;
    private int[] numbers;
    private int maximum;
    private int minimum;

    public ThreadMinMax(int[] Numbers) {
        numbers = Numbers;
        thr = new Thread(this, "Thread1.");
        thr.start();
    }

    public void run() {
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i< numbers.length; i++) {
            if (max< numbers[i]) max = numbers[i];
            if (min> numbers[i]) min = numbers[i];
        }
        maximum = max;
        minimum = min;
    }

    public Thread getThread() { return thr; }
    public int getMax() { return maximum; }
    public int getMin() { return minimum; }
}