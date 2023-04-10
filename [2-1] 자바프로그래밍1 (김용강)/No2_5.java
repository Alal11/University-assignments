public class No2_5 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("< true true >");
        System.out.println("AND : " + (a && a));
        System.out.println("OR : " + (a || a));
        System.out.println("XOR : " + (a ^ a));

        System.out.println("\n< true false >");
        System.out.println("AND : " + (a && b));
        System.out.println("OR : " + (a || b));
        System.out.println("XOR : " + (a ^ b));

        System.out.println("\n< false true >");
        System.out.println("AND : " + (b && a));
        System.out.println("OR : " + (b || a));
        System.out.println("XOR : " + (b ^ a));

        System.out.println("\n< false false >");
        System.out.println("AND : " + (b && b));
        System.out.println("OR : " + (b || b));
        System.out.println("XOR : " + (b ^ b));

    }
}
