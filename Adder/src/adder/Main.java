package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            if (args.length == 0){
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("not enough arguments.");
        } catch (NumberFormatException n) {
            System.out.println("invalid character");
        }
        
    }

    private static int addArguments(String[] args) {
        
        int total = 0;
        for (int i = 0; i < args.length; i++)
            total += Integer.valueOf(args[i]);
        return total;
    }
}
