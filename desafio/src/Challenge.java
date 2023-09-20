import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        String name = "Matheus de Oliveira Cavalcante";
        String  tipeAconunt= "Corrente";

        double openingBalance = 2500;
        double currentBalance = openingBalance;




        String dashBoard;


        dashBoard = """
                *********************************
                
                Dados iniciais do cliente:
                               
                Nome do Cliente: %s
                Tipo de Conta:   %s
                Saldo Inicial:   %.2f
                
                *********************************
                """.formatted(name, tipeAconunt, openingBalance);

        System.out.println(dashBoard);



        int operacion = 0;
        String menu = """
                \nOpções:
                
                1- Consultar saldos
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                """;

        while (operacion != 4) {

            System.out.println(menu);
            System.out.println("\nDigite a opção desejada:");
            operacion = reading.nextInt();

            if (operacion == 1) {
                System.out.println("O saldo atuel é " + currentBalance);

            } else if (operacion == 2) {
                System.out.println("Informe o valor a receber:");
               double amountToReceive = reading.nextDouble();

                currentBalance = currentBalance + amountToReceive;

                System.out.println("O saldo atual é " + currentBalance);

            } else if (operacion == 3) {
                System.out.println("Informe o valor a ser transferido:");
                double balanceToBeTransferred = reading.nextDouble();

                if (currentBalance < balanceToBeTransferred) {
                    System.out.println("Não há saldo suficiente para Transferir.");


                } else
                    currentBalance = currentBalance - balanceToBeTransferred;
                    System.out.println("O saldo atual é " + currentBalance);
                {
                }

            } else if (operacion != 4){
                System.out.println("Opção inválida ");

            }
        }
    }
}
