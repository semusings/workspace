import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
    ./jvm.sh OOMDueToGCOverhead -Xmx25m
 */
public class OOMDueToGCOverhead {

    public static void main(String[] args) throws Exception {
        JVMUtils.showsMemoryInfo();

        Random random = new Random();
        List<String> cache = new LinkedList<>();
        while (true) {
            cache.add(String.valueOf(random.nextInt()));
        }
    }

}