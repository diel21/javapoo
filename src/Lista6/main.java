package Lista6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int ind;
        ArrayList<Curso> cursos = new ArrayList<>();
        int opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Curso\n2- Criar Aluno\n3- Remover Aluno\n4- "
                + "Mostrar todos os Cursos\n5- Mostrar Alunos do Curso\n0- Sair"));
   while(opc != 0){    
        if (opc==1){
            Curso curso = new Curso();
            curso.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Codigo do Curso")));
            curso.setNome(JOptionPane.showInputDialog("Nome do Curso"));
            curso.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Carga Horaria")));
            cursos.add(curso);
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Curso\n2- Criar Aluno\n3- Remover Aluno\n4- "
                + "Mostrar todos os Cursos\n5- Mostrar Alunos do Curso\n0- Sair"));
        }
        else if (opc==2){
            int indice = 0;
            String todos="";
            Aluno alunos = new Aluno();
            for (Curso c :cursos){
                todos += indice + " - " + c.getNome()+ "\n";
                indice++;
            }
            ind = Integer.parseInt(JOptionPane.showInputDialog("Escolha um curso pelo indice"+"\n"+todos));
            alunos.setNome(JOptionPane.showInputDialog("Nome do Aluno"));
            alunos.setRa(JOptionPane.showInputDialog("RA do Aluno"));
            cursos.get(ind).setAlunos(alunos);
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Curso\n2- Criar Aluno\n3- Remover Aluno\n4- "
                + "Mostrar todos os Cursos\n5- Mostrar Alunos do Curso\n0- Sair"));
        }
        else if(opc==3){
            int indice = 0;
            String todos="";
            Curso c = new Curso();
            for (Aluno a :c.getAlunos()){
                todos += indice + " - " + a.getNome()+ "\n";
                indice++;
            }
            ind = Integer.parseInt(JOptionPane.showInputDialog("Escolha um aluno pelo indice"+"\n"+todos));
            c.removerAluno(ind);
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Curso\n2- Criar Aluno\n3- Remover Aluno\n4- "
                + "Mostrar todos os Cursos\n5- Mostrar Alunos do Curso\n0- Sair"));
        }
        else if(opc==4){
            int indice = 0;
            String todos="";
            for (Curso cur :cursos){
                todos += indice + " - " + cur.getNome()+ "\n";
                indice++;
            }
            JOptionPane.showMessageDialog(null, todos);
         
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Curso\n2- Criar Aluno\n3- Remover Aluno\n4- "
                + "Mostrar todos os Cursos\n5- Mostrar Alunos do Curso\n0- Sair"));
        }
        else if(opc==5){
            int indice = 0;
            int indice2= 0 ;
            String todos="";
            String todos2="";
            Aluno alunos = new Aluno();
            for (Curso cur :cursos){
                todos += indice + " - " + cur.getNome()+ "\n";
                indice++;
            }
            ind = Integer.parseInt(JOptionPane.showInputDialog("Escolha um curso pelo indice"+"\n"+todos));
            for (Aluno a :cursos.get(ind).getAlunos()){
                todos2 += indice2 + " - " + a.getNome()+ "\n";
                indice2++;
            }
            JOptionPane.showMessageDialog(null, todos2);
            opc =Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer\n1- Criar Curso\n2- Criar Aluno\n3- Remover Aluno\n4- "
                + "Mostrar todos os Cursos\n5- Mostrar Alunos do Curso\n0- Sair"));
        }
        if (opc==0){System.exit(0);}
        }
    }
}


