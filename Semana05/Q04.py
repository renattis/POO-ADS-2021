public class ContaImposto {
    private double saldo;
    private int numero;
    
    ContaImposto(){
    }

    public ContaImposto(double saldo ,int numero ) {
        this.saldo = saldo;
        this.numero  = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void creditar(double valor){
        setSaldo(valor);
        System.out.println("Valor creditado");
    }
    
    public void debitar(double valor){
        setSaldo(-(valor + retemImposto(valor)));
    }
    
    public double retemImposto(double valorDebito){
        return (0.38 / 100) * valorDebito;
    }
    
    
}
