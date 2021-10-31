package Lista5;

import javax.swing.JOptionPane;

public class mainlista5 {
    public static void main(String[] args) {
        //somar subtrair multiplicar dividir sair menu calc
        int opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Calculadora\n2- Apolice\n3- Vendedor de Carros"));
        while(opc != 0){
            if (opc==1){
                Calculadora cal = new Calculadora();
                int opccalc = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n"));
                int n1,n2;
                double n3,n4;
                String escolha;
                while(opccalc != 0){
                    if (opccalc == 1){
                    escolha = JOptionPane.showInputDialog("Você ira usar um double ou um int");
                        if ("int".equals(escolha)){
                            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero"));
                            JOptionPane.showMessageDialog(null, cal.soma(n1, n2));
                            opccalc = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n"));
                        }
                        else if ("double".equals(escolha)){
                            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
                            n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero"));
                            JOptionPane.showMessageDialog(null, cal.soma(n3, n4));
                            opccalc = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n"));
                            }
                    }
                    if (opccalc == 2){
                    escolha = JOptionPane.showInputDialog("Você ira usar um double ou um int");
                        if ("int".equals(escolha)){
                            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero"));
                            JOptionPane.showMessageDialog(null, cal.subtracao(n1, n2));
                            opccalc = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n"));
                        }
                        else if ("double".equals(escolha)){
                            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
                            n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero"));
                            JOptionPane.showMessageDialog(null, cal.subtracao(n3, n4));
                            opccalc = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n"));
                        }   
                    }
                    if (opccalc == 3){
                    escolha = JOptionPane.showInputDialog("Você ira usar um double ou um int");
                        if ("int".equals(escolha)){
                            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero"));
                            JOptionPane.showMessageDialog(null, cal.multiplicacao(n1, n2));
                            opccalc = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n"));
                        }
                        else if ("double".equals(escolha)){
                            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
                            n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero"));
                            JOptionPane.showMessageDialog(null, cal.multiplicacao(n3, n4));
                            opccalc = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n"));
                        }
                    }
                    if (opccalc == 4){
                    escolha = JOptionPane.showInputDialog("Você ira usar um double ou um int");
                        if ("int".equals(escolha)){
                            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero"));
                            JOptionPane.showMessageDialog(null, cal.divisao(n1, n2));
                            opccalc = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n"));
                        }
                        else if ("double".equals(escolha)){
                            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
                            n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero"));
                            JOptionPane.showMessageDialog(null, cal.divisao(n3, n4));
                            opccalc = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n"));
                        }
                    }
                     if (opccalc == 0){
                        System.exit(0);
                    }
                }
                    
                    
                    }
            if(opc ==2){
                int opcapo = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Criar Apolice\n2- Ver dados Apolice"));
                Apolice v1 = new Apolice();
                while(opcapo != 0){
                        if (opcapo == 1){
                            v1 = new Apolice(Integer.parseInt(
                                    JOptionPane.showInputDialog("Digite o Numero do Apolice: ")),
                                    JOptionPane.showInputDialog("Digite o Nome do Apolice: "),
                                    Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: ")),
                                    JOptionPane.showInputDialog("Digite o Sexo da Pessoa").charAt(0),
                                    Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Automovel: ")));
                            opcapo = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Criar Apolice\n2- Ver dados Apolice"));
                            
                        }
                        else if (opcapo == 2){JOptionPane.showMessageDialog(null,v1.Imprimir());
                        opcapo = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n0- Sair\n1- Criar Apolice\n2- Ver dados Apolice"));
                        }
                        else if (opcapo == 0){System.exit(0);}
                        
                }                    
            }
            if(opc == 3){
                Vendedor vend = new Vendedor();
                int opcvend = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Vendedor\n2- Calcular Comissão\n3- Quantidade de vendedores criados\n4- Sair"));
                while(opcvend !=3){
                    if (opcvend == 1){
                        vend = new Vendedor(
                                Integer.parseInt(JOptionPane.showInputDialog("Codigo de Vendedor:")),
                                JOptionPane.showInputDialog("Nome Vendedor:"),
                                Double.parseDouble(JOptionPane.showInputDialog("Percentual de comissao do Vendedor:")));
                                opcvend = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Vendedor\n2- Calcular Comissão\n3- Quantidade de vendedores criados\n4- Sair"));
                    }
                    if (opcvend == 2){
                        JOptionPane.showMessageDialog(null,vend.imprimir(Double.parseDouble(JOptionPane.showInputDialog("Valor da venda:")), Double.parseDouble(JOptionPane.showInputDialog("Valor do desconto: "))));
                        opcvend = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Vendedor\n2- Calcular Comissão\n3- Quantidade de vendedores criados\n4- Sair"));
                    }
                    if (opcvend == 3){JOptionPane.showMessageDialog(null,Vendedor.getQuantVendedor());}
                    if(opcvend ==4){System.exit(0);}
                }
                    
            }
        }
        
        if (opc==0){System.exit(0);
            
        }
    }
}

