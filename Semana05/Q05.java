import java.util.Scanner;
public class ExibeHora {
    public static void main(String[] args) {
        Hora horario = new Hora();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hora: ");
        int horaAtual = sc.nextInt(); // Recebe a hora atual
        
        System.out.println("Minuto: ");
        int minutoAtual = sc.nextInt(); // Recebe a hora atual
        
        System.out.println("Segundo: ");
        int segundoAtual = sc.nextInt(); // Recebe a hora atual
        
        horario.setHora(horaAtual);
        horario.setMinuto(minutoAtual);
        horario.setSegundo(segundoAtual);
        
        System.out.println(horario.toString());
    }
}
