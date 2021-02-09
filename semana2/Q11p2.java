public class TestaDecimalNumber {
    public static void main(String[] args) {
        DecimalNumber dn = new DecimalNumber();

        dn.myDouble = 9.18;

        System.out.println(dn.exibirInteira());
        System.out.println(dn.exibirDecimal());
    }
}
