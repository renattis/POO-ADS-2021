package carros;

/**
 *
 * @author gdsd1
 */
public class Carro extends Veiculo{

    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public Carro(String placa, String modelo, int ano, String marca){
        super(placa, modelo, ano);
        setMarca(marca);
    }
