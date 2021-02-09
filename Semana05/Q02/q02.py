import java.util.Scanner;

import Banco.*;

public class ExecutaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        Scanner sc = new Scanner(System.in);
        String opcao = "";
        do {
            System.out.println("1-Cadastrar 2-Alterar 3-Excluir 4 - Consultar 5 - Creditar 6 - Debitar 7 - Transferir 9-Sair");
            opcao = sc.next();
            switch (opcao) {
                case "1":
                Conta c = new Conta();
                System.out.println("Digite o número");
                c.numero = sc.next();
                c.saldo = sc.nextDouble();
                b.inserir(c);
                break;
                case "2" :
                    break;
            }
        } while (!opcao.equals("9"));

    }
}
