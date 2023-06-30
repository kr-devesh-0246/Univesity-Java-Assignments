public class Four {
    public static void main(String[] args) {
        int numArguments = args.length;

        System.out.println("Number of command line arguments: " + numArguments);
        System.out.println("Command line arguments:");

        for (int i = 0; i < numArguments; i++) {
            System.out.println(args[i]);
        }
    }
}
