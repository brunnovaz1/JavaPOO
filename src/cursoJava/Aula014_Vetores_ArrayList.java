package cursoJava;                          //ArrayList<tipo> nome = new ArrayList<tipo>();
import java.lang.reflect.Array;
import java.util.ArrayList;                 //diferente do normal, o tamanho nao e estatico
import java.util.Arrays;
import java.util.Scanner;


public class Aula014_Vetores_ArrayList {
    public static void main(String[] args) {

    /*
        ArrayList<String> nomes = new ArrayList<String>(Arrays.asList("Bruno", "Eduardo", "Fatima", "Francisco"));
            nomes.add("Pitucha");
            System.out.println(nomes);
            System.out.println(nomes.size());   //.length
            System.out.println(nomes.get(3));   //elementos pelo indice
    */

        System.out.println("Array de quantos elementos [e]?");
        Scanner scanner = new Scanner(System.in);

        int e;
        ArrayList<Integer> numeros = new ArrayList<>(e = scanner.nextInt() );
        for(int i = 0; i < e; i++) {
            System.out.println("Digite o elemento do Array");
            numeros.add(scanner.nextInt());
        }
        System.out.println(numeros);


    }

}