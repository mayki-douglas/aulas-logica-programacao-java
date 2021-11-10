package projjavaalunoatividade4;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Aluno objAluno1 = new Aluno();
        Aluno objAluno2 = new Aluno();

        objAluno1.nome = JOptionPane.showInputDialog("Informe o nome do Aluno 1: ");
        objAluno1.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 1: "));
        objAluno1.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 2: "));

        objAluno2.nome = JOptionPane.showInputDialog("Informe o Nome do Aluno 2: ");
        objAluno2.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 1: "));
        objAluno2.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 2: "));

        JOptionPane.showMessageDialog(null, "Dados do Aluno 1: \n"
                + "Nome: " + objAluno1.nome + "\n"
                + "Nota 1: " + objAluno1.nota1 + "\n"
                + "Nota 2: " + objAluno1.nota2 + "\n"
                + "Média: " + objAluno1.calcularMedia() + "\n"
                + "Situação do Aluno: " + objAluno1.verificarSituacao());

        JOptionPane.showMessageDialog(null, "Dados do Aluno 2: \n"
                + "Nome: " + objAluno2.nome + "\n"
                + "Nota 1: " + objAluno2.nota1 + "\n"
                + "Nota 2: " + objAluno2.nota2 + "\n"
                + "Média: " + objAluno2.calcularMedia() + "\n"
                + "Situação do Aluno: " + objAluno2.verificarSituacao());

    }

}
