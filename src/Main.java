import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> numInteiro = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int p = 1;
        while (p != 0) {
            System.out.println("Digite numeros para serem adcionados a lista: ");
            int num = input.nextInt();
            numInteiro.add(num);

            System.out.println("deseja parar? digite '0'");
            p = input.nextInt();
        }

        System.out.println(numInteiro);

        Iterator<Integer> iterator = numInteiro.iterator();//iterador para uma lista

        while (iterator.hasNext()) {
            int numero = iterator.next(); //pega o proximo elemento da lista
            if (numero % 2 == 0) {
                iterator.remove();
            }

        /*for(int numero: numInteiro){
            if(numero % 2 == 0){
                numInteiro.remove();
            }
        }*/

            System.out.println(numInteiro);


        }
    }
}