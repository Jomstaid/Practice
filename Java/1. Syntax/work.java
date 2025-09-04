public class Lab2 {
    public static void main(String[] args) {
        long val_bytes = 0;

        // For testing purposes, you can assign a value to val_bytes
        val_bytes = 5000; // Example value, replace with actual value

        if (val_bytes == 0) {
            System.out.println("Invalid");
        } else if (val_bytes >= 1 && val_bytes <= 1023) {
            System.out.println("bytes");
        } else if (val_bytes >= 1024 && val_bytes <= 1023999) {
            System.out.println("kilobyte");
        } else if (val_bytes >= 1024000) {
            System.out.println("megabyte");
        } else {
            System.out.println("Invalid");
        }
    }
}
