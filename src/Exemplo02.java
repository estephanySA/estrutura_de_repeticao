
/* programa para imprimir no video os numeros dentro de um intervalo fornecido pelo usuário
*/

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numMin, numMax, cont;

        System.out.println("Digite o nº minimo: ");
        numMin = sc.nextInt();
        System.out.println("Digite o nº máximo: ");
        numMax = sc.nextInt();

        cont = numMin;
        while(cont <= numMax){
            System.out.print(cont + " ");
            cont = cont + 1;
        }

    }
}
