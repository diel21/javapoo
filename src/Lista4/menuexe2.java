
package Lista4;
    
import javax.swing.JOptionPane;

public class menuexe2 {
    public static void main(String[] args) {
        Aluno al = new Aluno();
        int opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Aluno\n2- Mostrar Aluno \n3- Sair"));
   while(opc != 3){    
     if (opc==1){  
                    al.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
                    al.setRa(JOptionPane.showInputDialog("Digite o RA do Aluno"));
                    al.setAC1(Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota da Avaliação 1")));
                    al.setAC2(Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota da Avaliação 2")));
                    al.setAG(Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota da Atividade em Grupo")));
                    al.setAF(Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota da Avaliação Final")));
                    opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Aluno\n2- Mostrar Aluno \n3- Sair"));
                }
     else if (opc==2){JOptionPane.showMessageDialog(null,al.Imprimir());
                        opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Aluno\n2- Mostrar Aluno \n3- Sair"));}
        }
   if (opc==3){System.exit(0);}
}
}
