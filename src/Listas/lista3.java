package Listas;

import java.util.Random;
import javax.swing.JOptionPane;

public class lista3 {
    public static void main(String[] args) {
        Random rnd = new Random();

//1 - Ler tres numeros e mostra-los em ordem do menor para o maior. O sistema pode aceitar numeros iguais

//       int n1=0, n2=0, n3=0;
//       int num= 0;
//        for (int i = 0; i < 3; i++) {
//            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//            if ( i == 0){
//                n1 = num;
//                n2 = num;
//                n3 = num;
//            }
//                if (num >= n1){
//                    n3 = n2;
//                    n2 = n1;
//                    n1 = num;
//                        }
//                else if (num>=n2){
//                    n3 = n2;
//                    n2 = num;
//                }
//                else {
//                    n3 = num;
//                    }     
//        }
//        JOptionPane.showMessageDialog(null, n3 + "," + n2 + ","+n1);
        
//2 -  Entrar com 20 numeros e imprimir a soma desses numeros.

//        int numeros = 0;
//        int soma = 0;
//        for (int i = 0; i < 20; i++) {
//            numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//            soma = numeros + soma;
//        }
//        JOptionPane.showMessageDialog(null,soma);
//    
//3 -  Entrar com 20 numeros e imprimir a soma dos positivos e o total de numeros negativos.

//       int numeros2 = 0;
//       int soma2 = 0;
//       int soma3 = 0;
//       for (int i = 0; i < 20; i++) {
//            numeros2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//            if (numeros2 > 0 ) {
//               soma2 = numeros2 + soma2;
//           }
//            else {
//               soma3++; 
//            }
//       }
//       JOptionPane.showMessageDialog(null,"Soma dos positivos: "+soma2+" Quantidade de negativos: "+soma3);
       
//4 - Faça um algoritmo que deixe escolher qual a tabuada de multiplicar que se deseja imprimir. 

//    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja a tabuada"));
//    
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i+" x "+n1+" = "+n1*i);
//        }
//    
    
//5 -“ Faça um programa onde voce consiga jogar joquempa com o computador seguindo as seguintes regras:
//	Crie um menu para que o jogador escolha uma dessas duas opçoes: 0 = Pedra | 1 = Papel | 2 = Tesoura
//	O jogador deve escolher uma opçao e o jogador tambem, apos a escolha dos dois mostre a mensagem de quem ganhou
//	O jogo deve acontecer 3 vezes e apos o termino das tres partidas o programa deve mostrar o placar a avisar quem ganhou.

        int player = 0,maquina = 0;
        String maqna="";
        String plyr="";
        int roundplayer = 0;
        int roundmaqna = 0;
        int result=0;
        int i =0;
        //for (int i = 0; i < 3; i++) {
        while (i<3){   
        player = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da opção que você quer\n"
                    + "0- Pedra\n1- Papel\n2- Tesoura"));
            maquina = rnd.nextInt(3);
            switch(player){
                case 0:
                    plyr = "Pedra, "+plyr;
                    i++;
                    break;
                case 1:
                    plyr = "Papel, "+plyr;
                    i++;
                    break;
                case 2:
                    plyr = "Tesoura, "+plyr;
                    i++;
                    break;
                default:
                    System.out.println("Opção Invalida");
                    continue;
            }
            
            switch(maquina){
                case 0:
                    maqna = "Pedra, "+maqna;
                    break;
                case 1:
                    maqna = "Papel, "+maqna;
                    break;
                case 2:
                    maqna = "Tesoura, "+maqna;
                    break;
            }
                
            
     // -----------------------
            if (player == 0 && maquina == 1){roundmaqna = 1 + roundmaqna;}
            else
            if (player == 1 && maquina == 2){roundmaqna = 1 + roundmaqna;}
            else
            if (player == 2 && maquina == 0){roundmaqna = 1 + roundmaqna;}
     // -----------------------
            if (player == 1 && maquina == 0){roundplayer = 1 + roundplayer;}
            else
            if (player == 2 && maquina == 1){roundplayer = 1 + roundplayer;}
            else
            if (player == 0 && maquina == 2){roundplayer = 1 + roundplayer;}           
        }
        if (roundplayer > roundmaqna){result = 1;}
        else if (roundplayer == roundmaqna){result = 3;}
        else{result = 2;}
        if (result == 1) {
            JOptionPane.showMessageDialog(null, "0- Pedra\n1- Papel\n2- Tesoura"+"\nMaquina escolheu as seguintes Opçoes: "+maqna+"\nO Player escolheu as seguintes Opçoes: "+plyr+"\nEntão o vencedor foi o Player");
    }
        if (result == 2) {
            JOptionPane.showMessageDialog(null, "0- Pedra\n1- Papel\n2- Tesoura"+"\nMaquina escolheu as seguintes Opçoes: "+maqna+"\nO Player escolheu as seguintes Opçoes: "+plyr+"\nEntão o vencedor foi a Maquina");
    }
        if (result == 3){
            JOptionPane.showMessageDialog(null, "0- Pedra\n1- Papel\n2- Tesoura"+"\nMaquina escolheu as seguintes Opçoes: "+maqna+"\nO Player escolheu as seguintes Opçoes: "+plyr+"\nPor isso o jogo deu Empate");
    }
    }
}
