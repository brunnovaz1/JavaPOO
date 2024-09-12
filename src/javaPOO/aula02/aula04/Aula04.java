package javaPOO.aula02.aula04;
                                        //metodos getters e setters protegem o acesso, nao permitindo que seja direto
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Azul", 0.7f);
        Caneta c2 = new Caneta("TOP", "Roxa", 1.5f);
        c1.status();
        c2.status();



       // c1.setModelo("BIC");
        //c1.modelo = "BIC";


        //c1.setPonta(0.7f); (apos constutor)
        //  c1.ponta = 0.7f;     ERRO - nao dá para fazer o acesso direto (atributo privado)


      //  System.out.println("Tenho uma caneta" + c1.getModelo() + " de ponta: " + c1.getPonta());      apos constutor)
    }

}
