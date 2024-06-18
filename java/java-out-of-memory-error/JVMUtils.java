public class JVMUtils {

    public static void showsMemoryInfo() {
        // Print the header
        System.out.println("----- Heap Size Information -----");

        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();

        // Calculate the used memory
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();

        // Print the used, free, total, and max memory
        System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + runtime.freeMemory() / (1024 * 1024) + " MB");
        System.out.println("Total Memory: " + runtime.totalMemory() / (1024 * 1024) + " MB");
        System.out.println("Max Memory: " + runtime.maxMemory() / (1024 * 1024) + " MB");

        // Print the footer
        System.out.println("----- End of Heap Size Information -----\n");
    }

}
