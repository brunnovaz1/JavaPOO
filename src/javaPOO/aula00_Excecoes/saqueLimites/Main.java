package javaPOO.aula00_Excecoes.saqueLimites;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Conta: ");
            int setNumero = scanner.nextInt();
        System.out.print("Titular: ");
        scanner.nextLine();
            String setTitular = scanner.nextLine();
        System.out.print("Saldo Inicial: R$");
            double setSaldo = scanner.nextDouble();
        System.out.print("Limite Saque: R$");
            double setLimiteSaque = scanner.nextDouble();

        Conta c01 = new Conta(setNumero, setTitular, setSaldo, setLimiteSaque);
        System.out.println(" - - - - - - - - - - - - - ");
        System.out.print("Valor Saque: R$");
        double valorSaque = (scanner.nextDouble());

        try{
           c01.saque(valorSaque);
            System.out.println("Saque realizado com sucesso!");
        }catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }catch(LimiteSaqueException e){
            System.out.println(e.getMessage());
        }

        System.out.println("= = = = = = = = = = = = = ");
        System.out.println("Saldo Atual: R$" + c01.getSaldo());
    }
}
