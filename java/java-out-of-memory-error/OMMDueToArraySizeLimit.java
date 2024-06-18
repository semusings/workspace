/*
    ./jvm.sh OMMDueToArraySizeLimit -Xmx25m
 */
public class OMMDueToArraySizeLimit {

    public static void main(String[] args) throws Exception {
        JVMUtils.showsMemoryInfo();

        String[] array = new String[Integer.MAX_VALUE];
    }

}