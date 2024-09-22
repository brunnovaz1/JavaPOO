package javaPOO.aula09_Ex_Livro;

public class Main {
    public static void main(String[] args) {

        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];


        p[0] = new Pessoa("Bruno Vaz", 41, "masc");
        l[0] = new Livro("Logica de Progamacao em JS",350, "Edecio Fernando",p[0]);


        //System.out.println( l[0].detalhes());
        //l[0].avancarPag();
       //l[0].folhear(350);
      // System.out.println( l[0].detalhes());
       //l[0].avancarPag();
       //l[0].fechar();
       // l[0].abrir();
        l[0].folhear(347);
        l[0].avancarPag();
        System.out.println( l[0].detalhes());


    }
}
