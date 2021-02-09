package carros;

/**
 *
 * @author gdsd1
 */
public class CarroEletrico extends Veiculo{
    private int autonomiaBateria;

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }
    
    public CarroEletrico(String placa, String modelo, int ano, int autonomiaBateria){
        super(placa, modelo, ano);
        this.setAutonomiaBateria(autonomiaBateria);
    }
}
