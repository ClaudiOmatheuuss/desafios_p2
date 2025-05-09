import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Banco de Belo Jardim", 5);
        int contaEscolhida;
        
        
        while (true){
            System.out.println("_".repeat(50));
            System.out.printf("\n Olá, Bem-vindo ao sistema do %s\n", banco.getNome());
            System.out.println("_".repeat(50));
            while (true) {
                System.out.println();
                System.out.println("Qual conta deseja acessar(1, 2, 3, 4 ou 5): ");
                contaEscolhida = scanner.nextInt() - 1;
                
                if (contaEscolhida >= 0 && contaEscolhida <= 4) {
                    break;
                } else {
                    System.out.println("Esta conta não existe, tente novamente!");
                    System.out.println("_".repeat(50));
                    System.out.println();
                }
            }
            
            System.out.println();
            System.out.println("\n Como podemos te ajudar: \n 1. Depósito \n 2. Sacar \n 3. Mostrar saldo");
            System.out.println();
            System.out.println("Digite o número desejado: ");
             
            int num = scanner.nextInt();

            if (num == 1){
                System.out.println("Quanto você quer depositar: ");
                float deposito = scanner.nextFloat();
                banco.deposita(deposito, contaEscolhida);

            } else if (num == 2){
                boolean saqueRealizado = false;
                
                while (!saqueRealizado) { // enquanto saque não realizado ...
                    System.out.println("Digite o valor do saque: ");
                    float saque = scanner.nextFloat();
                    System.out.printf("\n O saldo é menor que o valor de saque, tente novamente.");
                    System.out.printf("\n -  Valor de saque: %s ", saque);
                    System.out.printf("\n -  Saldo atual: %s\n", banco.getSaldo(contaEscolhida));
                    
                    saqueRealizado = banco.saque(saque, contaEscolhida);
                    if (saque < 0) {
                        System.out.println("dica: só são permitidos apenas valores de saque positivos.");
                    } else if (saqueRealizado) {
                        System.out.println("Saque efetuado com sucesso. :)");
                    }
                }
                
            } else if (num == 3){
                System.out.println("saldo é: " + banco.getSaldo(contaEscolhida));

            } else if (num <= 0) { 
                System.out.println("opção invalida, reinicie o sistema e tente novamente. ");
                break;

            } else {
                // Qualquer outro número(num > 3) deve ser ignorado.
                continue;
            }

        }
    }
}
