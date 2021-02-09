package carros;

/**
 *
 * @author gdsd1
 */
import carros.Carro;
import carros.CarroEletrico;

public class TestaCarros {
    public static void main(String[] args) {
        Carro cn = new Carro("abc-1234", "SUV", 2000, "Ford");
        CarroEletrico ce = new CarroEletrico("cba-4321", "SUV", 2010, 1000);
        
        System.out.println("Dados carro Normal");
        System.out.println("Placa: " + cn.getPlaca());
        System.out.println("Modelo: " + cn.getModelo());
        System.out.println("Ano: " + cn.getAno());
        System.out.println("Marca: " + cn.getMarca());
        
        System.out.println("\nDados Carro Eletrico");
        System.out.println("Placa: " + ce.getPlaca());
        System.out.println("Modelo: " + ce.getModelo());
        System.out.println("Ano: " + ce.getAno());
        System.out.println("Marca: " + ce.getAutonomiaBateria());
        
    }
}
