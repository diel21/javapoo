package Listas;

import java.util.Scanner;

public class lista1 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
//1 - Faça um programa que declare uma variável inteira, inicialize-a com a sua idade e mostre-a.

//       int num1 = 0;
//        System.out.println("Digite sua idade: ");    
//        num1 = tc.nextInt();
//        System.out.println("Sua idade é: "+num1);
//        tc.close();
        
// -----------

//2 - Ler os valores de comprimento, largura e altura e 
//apresentar o valor do volume de uma caixa retangular. 
//Utilize para o cálculo a formula
//Volume = comprimento * largura * altura

//        double a = 0;
//        double b = 0;
//        double c = 0;
//        
//        System.out.println("Digite a largura do retangulo: ");
//        a= tc.nextDouble();
//        System.out.println("Digite a altura do retangulo: ");
//        b= tc.nextDouble();
//        System.out.println("Digite o comprimento do retangulo");
//        c= tc.nextDouble();
//        System.out.println("O volume total do retangulo é: "+(c*a*b));
//        tc.close();

// ------------

//3 - Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, 
//utilizando um automóvel que faz 12km por litro. Para obter o cálculo o usuário deve fornece o 
//tempo gasto na viagem e a velocidade média durante ela.
//Dessa forma será possível obter a distância percorrida com a fórmula
//DISTANCIA = TEMPO * VELOCIDADE
//Tendo o valor da distância basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
//LITROS_USADOS = DISTANCIA /12
//O programa deve apresentar os valores da velocidade média, tempo gasto da viagem, 
//a distância percorrida e a quantidade de litros utilizada.
//        double tempo = 0;
//        double vel = 0;
//        double dist= 0;
//        System.out.println("Qual foi o tempo da viagem? ");
//        tempo = tc.nextDouble();
//        System.out.println("E qual a velocidade Média da Viagem? ");
//        vel= tc.nextDouble();
//        dist = tempo * vel;
//        System.out.printf("Seu veiculo em uma Velocidade média de "+vel);
//        System.out.printf("km/h em um tempo de "+tempo);
//        System.out.printf(" horas percorrendo uma distancia de "+dist);
//        System.out.printf("KM gasta "+(dist/12));
//        System.out.println(" litros de Combustivel");
//        tc.close();

//-------------------

//4 - Receba a altura e a largura e a partir dessa informação calcule a área o e perímetro de um retângulo, onde:
//área = base * altura
//perímetro = 2base + 2altura

//        int base= 3;
//        int altura=5;
//        int area=base*altura;
//        int perimetro= (base*2)+(altura*2);
//        System.out.printf("Area = "+area);System.out.println(" e Perímetro = "+perimetro);
//        tc.close();

//-----------------

//5 - Ler uma temperatura em graus Centígrados e apresentá-la convertida em graus Fahrenheit.
//A fórmula de conversão é: F = (9*C+160)/5. Onde F é a temperatura em Fahrenheit e C é a temperatura em Centígrados.
    
//        int cent = 35;
//        int fah= (9*cent+160)/5;
//        System.out.println(""+fah);

//---------------

//6 – Desenvolver um programa utilizando os
//conceitos de variáveis para resolver a expressão matemática abaixo sendo que o resultado é 125.

//        double rest1= Math.pow(6*(3+2), 2)/(3*2);
//        double rest2= Math.pow((1-5)*(2-7)/2,2);
//        double conta=Math.pow(rest1-rest2,3) / Math.pow(10,3);
//        System.out.println(""+conta);
//        
    }
}
