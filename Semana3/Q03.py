public class Teste {
    int b = 1;
    int a; // Inicializada automaticamente com 0.0 pelo Java;

    Teste(int a) {
        a = b + a;
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Teste t = new Teste(2);
    }
}
