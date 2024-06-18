import java.util.concurrent.TimeUnit;

/*
    ./jvm.sh OMMDueToThreadsLimits -Xmx25m
 */
public class OMMDueToThreadsLimits {

    public static void main(String[] args) throws Exception {
        JVMUtils.showsMemoryInfo();

        while (true) {
            new Thread(
                    () -> {
                        try {
                            Thread.sleep(TimeUnit.DAYS.toMillis(1));
                        } catch (Exception ignored) {
                        }
                    }
            ).start();
        }
    }

}