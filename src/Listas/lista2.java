
package Listas;
import javax.swing.JOptionPane;

public class lista2 {
    public static void main(String[] args) {
        
//1) Faça um programa que leia 2 números e imprima uma mensagem dizendo se são iguais ou diferentes.
        
        JOptionPane.showMessageDialog(null, "1) Faça um programa que leia 2 números e imprima uma mensagem dizendo se são iguais ou diferentes.");
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
            if (n1 == n2 ) {
                    JOptionPane.showMessageDialog(null, "Os numeros são iguais");
                }
            else {
                    JOptionPane.showMessageDialog(null, "Os numeros são Diferentes");
            }

//----------------------------

//2) Entrar com dois números e imprimi-los em ordem crescente (suponha números diferentes).

        JOptionPane.showMessageDialog(null, "2) Entrar com dois números e imprimi-los em ordem crescente (suponha números diferentes).");
        JOptionPane.showMessageDialog(null, "Ja passando para questão 2 usando os numeros da questão 1");
            if (n1 > n2) {
                JOptionPane.showMessageDialog(null, ""+n2+","+n1);
            }
            else if (n2 > n1) {
                JOptionPane.showMessageDialog(null, ""+n1+","+n2);
            }
            else{
                JOptionPane.showMessageDialog(null, "Os numeros são iguais");
            }


//-----------------------------

//3) Entrar com um número e informar se ele é divisível por 10, ou é divisível por 5, ou é divisível por 2 ou se não é divisível por nenhum destes.

        JOptionPane.showMessageDialog(null, "3) Entrar com um número e informar se ele é divisível por 10, ou é divisível por 5, ou é divisível por 2 ou se não é divisível por nenhum destes.");
        JOptionPane.showMessageDialog(null, "Continuarei com os numeros na questão 3 onde somarei os dois e direi se é divisível por 10,5 ou 2");
        int n3 = n2+n1;

            if ((n3 / 10)> 0) {
                 JOptionPane.showMessageDialog(null, "A soma dos dois numeros é divisível por 10 , 5 e 2");

             }
            else if((n3 / 5)>0){
                JOptionPane.showMessageDialog(null, "A soma dos dois numeros é divisível por 5 e 2");

            }
            else if((n3 / 2)>0){
                JOptionPane.showMessageDialog(null, "A soma dos dois numeros é divisível por 2");

            }
            else {
                JOptionPane.showMessageDialog(null, "Não é divisível por nenhum dos numeros");
            }
       
//------------------------------

//4) Entrar com 5 números e mostrar na saída qual é o menor e qual e o maior número.

       JOptionPane.showMessageDialog(null, "4) Entrar com 5 números e mostrar na saída qual é o menor e qual e o maior número.");
       int maior = 0;
       int menor = 0; 
       int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
       int n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
       int n6 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
       int n7 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto numero"));
       int n8 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quinto numero"));
            if (n4>n5 && n4>n6 && n4>n7 && n4>n8){
                maior = n4;
            }
            else if(n5>n4 && n5>n6 && n5>n7 && n5>n8){
                maior = n5;
            }
            else if(n6>n5 && n6>n4 && n6>n7 && n6>n8){
                maior = n6;
            }
            else if(n7>n5 && n7>n6 && n7>n4 && n7>n8){
                maior = n7;
            }
            else if(n8>n5 && n8>n6 && n8>n7 && n8>n4){
                maior = n8;
            }

            // *-*

                if (n4<n5 && n4<n6 && n4<n7 && n4<n8){
                    menor = n4;
                }
                else if(n5<n4 && n5<n6 && n5<n7 && n5<n8){
                    menor = n5;
                }
                else if(n6<n5 && n6<n4 && n6<n7 && n6<n8){
                    menor = n6;
                }
                else if(n7<n5 && n7<n6 && n7<n4 && n7<n8){
                    menor = n7;
                }
                else if(n8<n5 && n8<n6 && n8<n7 && n8<n4){
                    menor = n8;
                }
      JOptionPane.showMessageDialog(null, "O maior é "+maior+" e o menor é "+menor);
        
        
//-------------------------------

//5) Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00 caso contrário,
//o lucro será de 30%. Entrar com o valor do produto e imprimir o valor da venda.

       JOptionPane.showMessageDialog(null, "5) Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00 caso contrário,\n" +
       "o lucro será de 30%. Entrar com o valor do produto e imprimir o valor da venda.");
       double pr=Double.parseDouble(JOptionPane.showInputDialog("Qual valor pagou no produto ?"));
       double prc;
       double vlr;
            if (pr<20) {
                prc=0.45;
            }
            else{
                prc=0.30;
            }
            if (pr<20){
                vlr = prc * pr + pr ; 
                JOptionPane.showMessageDialog(null, "Você conseguirá vender esse produto com 45% de lucro vair sair por R$"+vlr);
            }
            else{
                vlr = prc * pr + pr ;
                JOptionPane.showMessageDialog(null, "Você conseguirá vender esse produto com 30% de lucro vai sair por R$"+vlr);
            }

//-------------------------------

//6) Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. Não se esqueça de verificar 
//se o ano de nascimento é um ano válido.
        
        JOptionPane.showMessageDialog(null,"6) Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. Não se esqueça de verificar \n" +
        "se o ano de nascimento é um ano válido.");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual seu ano de Nascimento ex: 1998"));
        int anoa = Integer.parseInt(JOptionPane.showInputDialog("Qual ano atual ex: 2021"));
            if (ano > anoa){
                JOptionPane.showMessageDialog(null,"Digitou um ano Invalido");
            }
            else{
                JOptionPane.showMessageDialog(null,"Sua idade é "+(anoa-ano));
            }

//-------------------------------

//7) Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:
//· Não eleitor (abaixo de 16 anos)
//· Eleitor obrigatório (entre 18 e 65 anos)
//· Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)

        JOptionPane.showMessageDialog(null,"//7) Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:\n" +
        "· Não eleitor (abaixo de 16 anos)\n" +
        "· Eleitor obrigatório (entre 18 e 65 anos)\n" +
        "· Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)");
        JOptionPane.showMessageDialog(null,"Usarei a idade Fornecida na questão anterior");
        int idade = anoa-ano;
        int cases = 0;
            if(idade >= 18 && idade <=65){
                cases = 1;
            }
            else if (idade >=16 && idade <=18 && idade > 65){
                cases = 2;
            }
            else if(idade < 16){
                cases = 3;
            }
                switch(cases){
                    case 1:
                        JOptionPane.showMessageDialog(null,"Sua idade é de "+idade+" portanto nocê é um eleitor obrigatório");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Sua idade é de "+idade+" portanto você é um eleitor facultativo");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Sua idade é de "+idade+" portanto você não é eleitor");
                }
        
//-------------------------------

//8) Ler um número entre 1 e 12, e escrever o mês correspondente. Caso o usuário digite um número fora deste intervalo, 
//deverá aparecer uma mensagem, informando que não existe mês com este número.

        JOptionPane.showMessageDialog(null,"8) Ler um número entre 1 e 12, e escrever o mês correspondente. Caso o usuário digite um número fora deste intervalo, \n" +
                                               "deverá aparecer uma mensagem, informando que não existe mês com este número.");
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do mês que quer saber o nome"));
            switch(mes){
                case 1:
                    JOptionPane.showMessageDialog(null,"Janeiro"); 
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Fevereiro"); 
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Março"); 
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Abril"); 
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Maio"); 
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Junho"); 
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"Julho"); 
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,"Agosto"); 
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Setembro"); 
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null,"Outubro"); 
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null,"Novembro"); 
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null,"Dezembro"); 
                    break;
                default:
                   JOptionPane.showMessageDialog(null,"Não existe mês com esse número"); 
                }
    }
}