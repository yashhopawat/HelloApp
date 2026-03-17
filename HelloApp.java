public class HelloApp {
    public static void main(String[] args) {

        String name;

        // If user gives input, use it
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World"; // default value
        }

        System.out.println("Hello " + name);
}}

}