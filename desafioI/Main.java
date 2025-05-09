import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Banco de Belo Jardim");

        
        while (true){
            System.out.printf("\n Olá, Bem-vindo ao sistema do %s\n", banco.getNome());
            System.out.printf("_".repeat(40));
            System.out.println("\n Como podemos te ajudar: \n 1. Depósito \n 2. Sacar \n 3. Mostrar saldo");
            System.out.println();
            System.out.println("Digite o número desejado: ");
             
            int num = scanner.nextInt();

            if (num == 1){
                System.out.println("Quanto você quer depositar: ");
                float deposito = scanner.nextFloat();
                banco.deposita(deposito);

            } else if (num == 2){
                System.out.println("Digite o valor do saque: ");
                float saque = scanner.nextFloat();
                banco.saque(saque);

            } else if (num == 3){
                System.out.println("saldo é: "+ banco.getSaldo());

            } else if (num <= 0) { 
                System.out.println("opção invalida, reinicie o sistema e tente novamente. ");
                break;

            } else {
                // Qualquer outro número(num > 3) deve ser ignorado.
                continue;
            }

            System.out.printf("_".repeat(40));
        }
    }
}
