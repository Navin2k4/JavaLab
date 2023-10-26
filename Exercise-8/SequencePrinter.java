//Program 1
public class SequencePrinter {
    private int currentValue = 1;
    private final int maxLimit;
    private final int threadCount;

    public SequencePrinter(int maxLimit, int threadCount) {
        this.maxLimit = maxLimit;
        this.threadCount = threadCount;
    }

    public synchronized void printSequence(int threadId) {
        while (currentValue <= maxLimit) {
            if (currentValue % threadCount == threadId) {
                System.out.println("Thread " + (threadId+1) + ": " + currentValue);
                currentValue++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        int maxLimit = 9;
        int threadCount = 3;

        SequencePrinter sequencePrinter = new SequencePrinter(maxLimit, threadCount);

        for (int i = 0; i < threadCount; i++) {
            final int threadId = i;
            new Thread(() -> {
                sequencePrinter.printSequence(threadId);
            }).start();
        }
    }
}
