import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale ptBr = new Locale("pt", "BR");
        double saldo = 128.30;
        double variante;
        int opcao = 5;
        //String saldoreal = NumberFormat.getCurrencyInstance(ptBr).format(saldo);
        System.out.println("*********************\nNome: Jorge Temoteo.\nTipo de Conta: Corrente.\nSaldo:" +NumberFormat.getCurrencyInstance().format(saldo));


        while (opcao != 4) {
            System.out.println("*********************\n1 - Consultar saldo\n2 - Fazer Pix\n3 - Receber Pix\n4 - Sair\n*********************");
            Scanner leitura = new Scanner(System.in);
            opcao = leitura.nextInt();


            if (opcao == 1) {
                System.out.println("O seu saldo atual é:" +NumberFormat.getCurrencyInstance().format(saldo));
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja enviar:");
                Scanner valorEnviar = new Scanner(System.in);
                variante = valorEnviar.nextDouble();
                    if (saldo < variante){
                      System.out.println("Não há saldo disponivel para realizar o Pix.");
                }
                    else if (saldo >= variante){
                        saldo = saldo - variante;
                        System.out.println("Operação realizada com sucesso!");
                    }
                System.out.println("O seu saldo atual é" +NumberFormat.getCurrencyInstance().format(saldo));
            } else if (opcao == 3) {
                System.out.println("Digite o valor recebido:");
                Scanner valorReceber = new Scanner(System.in);
                variante = valorReceber.nextDouble();
                saldo = saldo + variante;
                System.out.println("Valor recebido com sucesso!\nSeu novo saldo:" +NumberFormat.getCurrencyInstance().format(saldo));
            } else if (opcao == 4) {
                System.out.println("Volte sempre!");
            } else if (opcao >= 4) {
                System.out.println("Opção Invalida");
            } else if (opcao <= 0) {
                System.out.println("Opção Invalida");
            }


        }

    }
}