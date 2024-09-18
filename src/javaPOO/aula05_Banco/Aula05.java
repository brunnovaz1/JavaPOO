package javaPOO.aula05_Banco;

public class Aula05 {
    public static void main(String[] args) {
        System.out.println("---------   VAZ BANK   ----------");
        Conta conta01 = new Conta();

        /*System.out.println("Nome Cliente:");
            Scanner sacanner = new Scanner(System.in);
                conta01.setNome(sacanner.nextLine());
        System.out.println(" - - - - - - -  -");*/



        conta01.setNome("Bruno Vaz");        //pre-definido
        conta01.setNumConta(202400001);     //pre-deifinido
      conta01.abrirConta("cp");         // "cc" corrente ou "cp" poupança -> isso  ativa conta "status: true"
       conta01.depositar(10000);          //abrir cc ganha:$50 e abrir cp ganha:$150
      conta01.sacar(10050);
      //conta01.taxa();                    //taxa manutencao cc:12,00  cp:20,00
      //conta01.sacar(9479);
      //conta01.fecharConta();             //saldo deve ser 0,00 -> isso desativa a conta



        conta01.situacaoConta();

    }
}
