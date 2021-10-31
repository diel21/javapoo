
package Lista4;

import javax.swing.JOptionPane;

public class menuexe3 {
    public static void main(String[] args) {
        int opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Funcionario\n2- Mostrar Funcionario\n3- Alterar Remuneração\n4- Sair"));
        Funcionario f1 = new Funcionario();
   while(opc != 4){    
        if (opc==1){
            f1.setTipoVinculo(JOptionPane.showInputDialog("Vinculo do Funcionario 'H' para Hora 'S' para Salario: ").charAt(0));
            if (f1.getTipoVinculo()=='H'){
            f1.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario"));
            f1.setCracha(Integer.parseInt(JOptionPane.showInputDialog("Cracha do Funcionario")));
            f1.setValorDesconto(Float.parseFloat(JOptionPane.showInputDialog("Valor do desconto de impostos: ")));
            f1.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Valor da Hora: ")));
            f1.setQtdeHora(Float.parseFloat(JOptionPane.showInputDialog("Quantidade de Horas Trabalhadas: ")));
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Funcionario\n2- Mostrar Funcionario\n3- Alterar Remuneração\n4- Sair"));
            }
            else {
            f1.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario"));
            f1.setCracha(Integer.parseInt(JOptionPane.showInputDialog("Cracha do Funcionario")));
            f1.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o Salario do Funcionario: ")));
            f1.setValorDesconto(Float.parseFloat(JOptionPane.showInputDialog("Valor do desconto de impostos: ")));}
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Funcionario\n2- Mostrar Funcionario\n3- Alterar Remuneração\n4- Sair"));
        }
        if (opc==2){JOptionPane.showMessageDialog(null,f1.Imprimir());
                        opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Funcionario\n2- Mostrar Funcionario\n3- Alterar Remuneração\n4- Sair"));}
            }
        if (opc==3){ 
                if (f1.getTipoVinculo()=='H'){
                f1.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Valor da Hora: ")));
                opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Funcionario\n2- Mostrar Funcionario\n3- Alterar Remuneração\n4- Sair"));
                }
                else {
                f1.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o Salario do Funcionario: ")));
                opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Funcionario\n2- Mostrar Funcionario\n3- Alterar Remuneração\n4- Sair"));
                }
               }
   if (opc==4){System.exit(0);}
    }
}
