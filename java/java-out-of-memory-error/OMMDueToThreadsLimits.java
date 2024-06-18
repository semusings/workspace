import java.util.concurrent.TimeUnit;

/*
    ./jvm.sh OMMDueToThreadsLimits -verbose:gc -Xmx25m -XX:+UseParallelGC
 */
public class OMMDueToThreadsLimits {

    public static void main(String[] args) throws Exception {
        while (true) {
            new Thread(
                    () -> {
                        try {
                            Thread.sleep(TimeUnit.DAYS.toMillis(1));
                        } catch (Exception ex) {
                        }
                    }
            ).start();
        }
    }

}