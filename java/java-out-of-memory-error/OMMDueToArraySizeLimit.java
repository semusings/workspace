/*
    ./jvm.sh OMMDueToArraySizeLimit -verbose:gc -Xmx25m -XX:+UseParallelGC
 */
public class OMMDueToArraySizeLimit {

    public static void main(String[] args) throws Exception {
        String[] array = new String[Integer.MAX_VALUE];
    }

}