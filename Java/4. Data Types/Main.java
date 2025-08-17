public class Main {
    public static void main(String[] args) {
        // Data Types
        String name = "Jomar";
        int age = 18;
        double height = 1.5d;
        boolean isStudent = true;
        boolean isNotStudent = false;
        char intitial = 'J';
        char intitialAscii = 74;
        float weight = 2e2f; // Power of 10 not 2.
        byte bite = 100;
        short num = 1;
        long phone = 639123456789L;

        //
        double compute = height * weight;

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Is Not Student: " + isNotStudent);
        System.out.println("Initial: " + intitial);
        System.out.println("Initial ASCII: " + intitialAscii);
        System.out.println("Weight: " + weight);
        System.out.println("Byte: " + bite);
        System.out.println("Short: " + num);
        System.out.println("Phone: " + phone);
        System.out.println("Compute: " + compute);

    }
}