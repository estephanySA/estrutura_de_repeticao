import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int numMaior = Integer.MIN_VALUE;
        int cont = 1;

        while(cont <= 5) {
            System.out.println("Digite um valor: ");
            num1 = sc.nextInt();

            if (num1 > numMaior) {
                numMaior = num1;
            }
            cont = cont + 1;
        }
        System.out.println("Numero Maior: " + numMaior);

    }
}
