public class LogicalOperatorExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You can enter the club.");
        } else {
            System.out.println("You cannot enter.");
        }
    }
}
