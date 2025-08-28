public class Main {
    public static void main(String[] args) {
        String str = "Hi";
        str += " Hello";
        String jomar = "Alcantara";
        String gitna = "Del Rosario";
        String age = "19";

        System.out.println(str.length()); // how many characters in string
        System.out.println(str.toUpperCase()); // upper letters
        System.out.println(str.toLowerCase()); // lower letters
        System.out.println(str.indexOf("Hello")); // lower letters

        System.out.println(jomar + " " + gitna);
        System.out.println(jomar.concat(gitna + " " + "jai"));
        System.out.println(age + " " + gitna);
        System.out.println(age + " \"d\" " + gitna); // adding double qoutes uses \\" \\"
        System.out.println(age + " \'d\' " + gitna); // adding single \\' qoutes uses \'
        System.out.println(age + " \\d\\ " + gitna); // adding backslash \\ qoutes uses \\'
        System.out.println(age + "\n" + gitna); // add line \n
        System.out.println(age + "\r" + gitna); // carriage return \t
        System.out.println(age + "\t" + gitna); // add tab \t
        System.out.println(age + "\b" + gitna); // delete backspace \b
        System.out.println(age + "\f" + gitna); // form feed \f
        


    }
}