import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        int resultado;
        int cont = 0;
        int resposta = 1;


        while(resposta == 1) {
            System.out.println("Digite um valor: ");
            valor = sc.nextInt();
            cont = cont = 0;
        while (cont <= 10) {
            resultado = valor * cont;
            System.out.println(valor + " x " + cont + " = " + resultado);
            cont = cont + 1;
        }
            System.out.println("Digite 1 para nova tabuada ou 0 para finalizar: ");
            resposta = sc.nextInt();
    }

    }
}
