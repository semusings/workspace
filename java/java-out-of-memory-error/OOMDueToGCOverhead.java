import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.LinkedList;
import java.util.List;

/*
    ./jvm.sh OOMDueToGCOverhead -verbose:gc -Xmx25m -XX:+UseParallelGC
 */
public class OOMDueToGCOverhead {

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        List<String> cache = new LinkedList<>();
        while (true) {
            cache.add(String.valueOf(random.nextInt()));
        }
    }

}