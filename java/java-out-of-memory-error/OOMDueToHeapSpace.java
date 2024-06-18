import java.util.HashMap;
import java.util.Map;

/*
    ./jvm.sh OOMDueToHeapSpace -verbose:gc -Xmx25m -XX:+UseParallelGC
 */
public class OOMDueToHeapSpace {

    private static final String PARAGRAPH = "Lorem Ipsum is simply dummy text of the printing " +
            "and typesetting industry. Lorem Ipsum has been the industry's standard " +
            "dummy text ever since the 1500s, when an unknown printer took a galley " +
            "of type and scrambled it to make a type specimen book. " +
            "It has survived not only five centuries, but also the leap into electronic " +
            "typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release " +
            "of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
            "software like Aldus PageMaker including versions of Lorem Ipsum.";

    public static void main(String[] args) throws Exception {
        Map<String, String> cache = new HashMap<>();
        for (long i = 0; i < Long.MAX_VALUE; i++) {
            String key = PARAGRAPH +  i;
            cache.put(key, PARAGRAPH);
        }
    }

}