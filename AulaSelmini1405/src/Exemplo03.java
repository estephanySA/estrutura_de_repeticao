
/* Programa para imprimir apenas os numeros impares dentro de um intervalor informado pelo usuário */


import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numMin, numMax, cont;

        System.out.println("Digite o nº minimo: ");
        numMin = sc.nextInt();
        System.out.println("Digite o nº máximo: ");
        numMax = sc.nextInt();

        if (numMin % 2 == 0){
            cont = numMin + 1;
        }
        else {
            cont = numMin;
        }
        while (cont <= numMax){
            System.out.print(cont + " ");
            cont = cont + 2;
        }
    }
}
