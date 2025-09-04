import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long val_bytes = 0;

        System.out.print("Enter the value of bytes: ");
        val_bytes = scanner.nextLong();

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

        int dayNum = 0;

        System.out.print("Enter the day number 1 to 5: ");
        dayNum = scanner.nextInt();

        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Rest day");
                break;
        }
        scanner.close();
    }
}