package Lista4;

import javax.swing.JOptionPane;

public class menuexe1 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        int opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar pessoa\n2- Mostrar pessoa \n3- Sair"));
   while(opc != 3){    
     if (opc==1){  
                    p.setNome(JOptionPane.showInputDialog("Digite o nome da Pessoa"));
                    p.setCpf(JOptionPane.showInputDialog("Digite o CPF da Pessoa"));
                    p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade da Pessoa")));
                    p.setSexo(JOptionPane.showInputDialog("Digite o Sexo da Pessoa").charAt(0));
                    opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar pessoa\n2- Mostrar pessoa \n3- Sair"));
                }
     else if (opc==2){JOptionPane.showMessageDialog(null,""+p.getNome()+"\n"+p.getCpf()+"\n"+p.getIdade()+"\n"+p.getSexo());
                        opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar pessoa\n2- Mostrar pessoa \n3- Sair"));}
        }
   if (opc==3){System.exit(0);}
 }  
}
