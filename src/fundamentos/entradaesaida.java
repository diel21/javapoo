package fundamentos;

import java.util.Scanner;

public class entradaesaida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu Nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite um Numero: ");
        double a = teclado.nextDouble();
        // o meu funcionou sem conversão
        //double a = Double.parseDouble(teclado.nextLine());
        System.out.println("O numero Digitado é: "+a);
        System.out.println("Seja bem vindo "+nome);
        teclado.close();
    }
}
