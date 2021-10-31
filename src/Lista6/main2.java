package Lista6;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class main2 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Pessoa\n2- Criar Automóvel\n3- Transferir Automovel\n4- "
                + "Mostrar todas as pessoas\n5- Mostrar automovel da pessoa\n0- Sair"));
        while(opc != 0){    
        if (opc==1){
            Pessoa p = new Pessoa();
            p.setNome(JOptionPane.showInputDialog("Digite o Nome da Pessoa:"));
            p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da Pessoa:")));
            pessoas.add(p);
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Pessoa\n2- Criar Automóvel\n3- Transferir Automovel\n4- "
                    + "Mostrar todas as pessoas\n5- Mostrar automovel da pessoa\n0- Sair"));
        }
        else if (opc==2){
            int indice=0;
            String todos = "";
            Automovel auto = new Automovel();
            auto.setModelo(JOptionPane.showInputDialog("Digite o Modelo do automóvel:"));
            auto.setMarca(JOptionPane.showInputDialog("Digite a Marca do automóvel:"));
            int reply = JOptionPane.showConfirmDialog(null, "Deseja Inserir este automovel em uma Pessoa?", "Escolha", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                for (Pessoa p : pessoas){
                todos += indice + " - " + p.getNome()+ "\n";
                indice++;
                }
                int i = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Pessoa pelo indice"+"\n"+todos));
                pessoas.get(i).setAutomoveis(auto);
                opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Pessoa\n2- Criar Automóvel\n3- Transferir Automovel\n4- "
                    + "Mostrar todas as pessoas\n5- Mostrar automovel da pessoa\n0- Sair"));
            }
            else{opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Pessoa\n2- Criar Automóvel\n3- Transferir Automovel\n4- "
                    + "Mostrar todas as pessoas\n5- Mostrar automovel da pessoa\n0- Sair"));}
        }
        else if(opc==3){
            int indice=0;
            String todos = "";
            int indice2=0;
            String todos2 = "";
            int p1 ;
            int p2 ;
            int a ;
            int transf;
            
            for (Pessoa p : pessoas){
                todos += indice + " - " + p.getNome()+ "\n";
                indice++;
            }
            p1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Pessoa que deseja retirar um veiculo"+"\n"+todos));
            p2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Pessoa que deseja inserir um veiculo"+"\n"+todos));
            for (Automovel v : pessoas.get(p1).getAutomoveis()){
                todos2 += indice2 +" - "+v.getModelo()+"\n";
                indice2++;
            }
            transf = Integer.parseInt(JOptionPane.showInputDialog("Escolha o veiculo que deseja transferir"+"\n"+todos2));
            pessoas.get(p2).inserirAutomovel(pessoas.get(p1).getAutomoveis().get(transf));
            pessoas.get(p1).removerAutomovel(transf);
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Pessoa\n2- Criar Automóvel\n3- Transferir Automovel\n4- "
                    + "Mostrar todas as pessoas\n5- Mostrar automovel da pessoa\n0- Sair"));
        }
        else if(opc==4){
            String todos = "";
            
            for (Pessoa p : pessoas){
                todos += "Nome: " + p.getNome()+ "\n";
            }
            JOptionPane.showMessageDialog(null,todos);
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Pessoa\n2- Criar Automóvel\n3- Transferir Automovel\n4- "
                    + "Mostrar todas as pessoas\n5- Mostrar automovel da pessoa\n0- Sair"));
        }
        else if(opc==5){
            String todos2 = "";
            String todos = "";
            int indice = 0;
            for (Pessoa p : pessoas){
                todos += indice +" - "+ "Nome: " + p.getNome()+ "\n";
                indice++;
            }
            int p1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Pessoa que deseja Visualizar os Veiculos pelo indice"+"\n"+todos));
            for (Automovel auto : pessoas.get(p1).getAutomoveis()){
                todos2 += auto.getModelo()+"\n";
            }
            JOptionPane.showMessageDialog(null,todos2);
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Pessoa\n2- Criar Automóvel\n3- Transferir Automovel\n4- "
                    + "Mostrar todas as pessoas\n5- Mostrar automovel da pessoa\n0- Sair"));
            
        }
        if (opc==0){System.exit(0);}
        }
    }
}
