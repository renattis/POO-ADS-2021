package products;

/**
 *
 * @author gdsd1
 */
import java.util.Scanner;
public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(001, "Arroz", 100, 20.00);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantidade de " +p1.getDescricao() + "ATUALMENTE:" + p1.getQuantidade());
        // Acrescentando quantidade
        //// solicita a quantidade desejada
        System.out.println("Aumentar quantidade em: ");
        int qtdMais = sc.nextInt();
        // Invoca o método para p1;
        p1.repor(qtdMais);
        // Resultado após ter a quantidade aumentada
        System.out.println("Quantidade de " +p1.getDescricao() + ":" + p1.getQuantidade());
        System.out.println("Diminuir quantidade:");
        int qtdMenos = sc.nextInt();
        p1.darBaixa(qtdMenos);
        System.out.println("Quantidade de " +p1.getDescricao() + "Atualizada:" + p1.getQuantidade());
        
        
    }
}
