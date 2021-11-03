package Lista7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main1 {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<FuncionarioHorista> funcsHorista = new ArrayList<>();
        ArrayList<FuncionarioMensalista> funcsMensalista = new ArrayList<>();
        int menu = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1- Inserir Funcionario\n2- Exibir Funcionarios\n0- Sair"));
        while (menu != 0){
            if(menu == 1){
                int escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual Tipo de Funcionario deseja criar\n1- Funcionario\n2- Funcionario Horista\n3- Funcionario Mensalista"));
                if(escolha == 1){
                    Funcionario f1 = new Funcionario();
                    f1.setNome(JOptionPane.showInputDialog("Nome"));
                    f1.setFuncao(JOptionPane.showInputDialog("Função"));
                    f1.setSetor(JOptionPane.showInputDialog("Setor"));
                    f1.setNumeroCracha(Integer.parseInt(JOptionPane.showInputDialog("Numero Cracha:")));
                    funcionarios.add(f1);
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1- Inserir Funcionario\n2- Exibir Funcionarios\n0- Sair"));
                }
                if (escolha == 2){
                    FuncionarioHorista f1 = new FuncionarioHorista();
                    f1.setNome(JOptionPane.showInputDialog("Nome"));
                    f1.setFuncao(JOptionPane.showInputDialog("Função"));
                    f1.setSetor(JOptionPane.showInputDialog("Setor"));
                    f1.setNumeroCracha(Integer.parseInt(JOptionPane.showInputDialog("Numero Cracha")));
                    f1.setQtdeHoras(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Horas")));
                    f1.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Valor da Hora")));
                    funcsHorista.add(f1);
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1- Inserir Funcionario\n2- Exibir Funcionarios\n0- Sair"));
                }
                if (escolha == 3){
                    FuncionarioMensalista f1 = new FuncionarioMensalista();
                    f1.setNome(JOptionPane.showInputDialog("Nome"));
                    f1.setFuncao(JOptionPane.showInputDialog("Função"));
                    f1.setSetor(JOptionPane.showInputDialog("Setor"));
                    f1.setNumeroCracha(Integer.parseInt(JOptionPane.showInputDialog("Numero Cracha:")));
                    f1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Valor do Salario")));
                    funcsMensalista.add(f1);
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1- Inserir Funcionario\n2- Exibir Funcionarios\n0- Sair"));
                }
                else {
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1- Inserir Funcionario\n2- Exibir Funcionarios\n0- Sair"));
                }
            }
            if (menu == 2){  
                int escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual Tipo de Funcionario deseja Exibir\n1- Funcionario\n2- Funcionario Horista\n3- Funcionario Mensalista"));
                if(escolha == 1){
                    String todos = "";
                    for (Funcionario f :funcionarios){
                    todos += "Nome: " + f.getNome() +" - "+"Setor: "+f.getSetor()+" - "+"Função: "+f.getFuncao()+" - "+"Numero Cracha: "+f.getNumeroCracha();
                    }
                    JOptionPane.showMessageDialog(null, todos);
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1- Inserir Funcionario\n2- Exibir Funcionarios\n0- Sair"));
                }
                if (escolha == 2){
                    FuncionarioHorista f1 = new FuncionarioHorista();
                    String todos = "";
                    for (FuncionarioHorista f :funcsHorista){
                    todos += "Nome: " + f.getNome() +" - "+"Setor: "+f.getSetor()+" - "+"Função: "+f.getFuncao()+" - "+"Numero Cracha: "+f.getNumeroCracha()
                            +" - "+"Quantidade de Horas: "+f.getQtdeHoras()+" - "+"Valor da hora: "+f.getValorHora();
                    }
                    JOptionPane.showMessageDialog(null,todos);
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1- Inserir Funcionario\n2- Exibir Funcionarios\n0- Sair"));
                }
                if (escolha == 3){
                    FuncionarioMensalista f1 = new FuncionarioMensalista();
                    String todos = "";
                    for (FuncionarioMensalista f :funcsMensalista){
                    todos += "Nome: " + f.getNome() +" - "+"Setor: "+f.getSetor()+" - "+"Função: "+f.getFuncao()+" - "+"Numero Cracha: "+f.getNumeroCracha()
                            +" - "+"Salario: "+f.getSalario();
                    }
                    JOptionPane.showMessageDialog(null,todos);
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1- Inserir Funcionario\n2- Exibir Funcionarios\n0- Sair"));
                }
                else {
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1- Inserir Funcionario\n2- Exibir Funcionarios\n0- Sair"));
                }
            }
            if (menu == 0){
                System.exit(0);
            }
            
        }

    }
}
