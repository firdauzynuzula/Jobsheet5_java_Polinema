public class ExpressionLogic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // AND (&&) operator
        boolean andResult = (a < b) && (b < c);
        System.out.println("AND Result: " + andResult); // true

        // OR (||) operator
        boolean orResult = (a > b) || (b < c);
        System.out.println("OR Result: " + orResult); // true

        // NOT (!) operator
        boolean notResult = !(a < b);
        System.out.println("NOT Result: " + notResult); // false
    }
}
