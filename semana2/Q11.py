public class DecimalNumber {
    double myDouble;
    
    public int exibirInteira() {
        int myInt = (int) myDouble;
        return myInt;
    }

    public double exibirDecimal() {
        return myDouble - exibirInteira(); // Correção
        // double myDecimal = myDouble % 1;
        // return myDecimal;
    }

}
