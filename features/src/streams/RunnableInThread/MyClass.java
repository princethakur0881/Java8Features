package streams.RunnableInThread;

public class MyClass  {
    public static void  main() {
        Runnable runnable = () -> {
            for (int i = 1; i < 100; i++) {
                System.out.println("Hello babu");
            }
        };

        Thread newThread = new Thread(runnable);
        newThread.run();

    }
}
