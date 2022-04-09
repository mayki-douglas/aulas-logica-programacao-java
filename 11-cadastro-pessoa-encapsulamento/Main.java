package projjavapessoa;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Pessoa objPessoa1 = new Pessoa();
        Pessoa objPessoa2 = new Pessoa();

        objPessoa1.setNome(JOptionPane.showInputDialog("Insira o Nome da Pessoa 1: "));
        objPessoa1.setCpf(Long.parseLong(JOptionPane.showInputDialog("Informe o CPF: ")));
        objPessoa1.setIdade(Byte.parseByte(JOptionPane.showInputDialog("Informe a Idade da pessoa 1: ")));
        objPessoa1.setRendaBrutaFamiliar(Double.parseDouble(JOptionPane.showInputDialog("Informe a renda bruta: ")));
        objPessoa1.setSexo(JOptionPane.showInputDialog("Informe o Sexo da pessoa: "));

        objPessoa2.setNome(JOptionPane.showInputDialog("Insira o Nome da Pessoa 2: "));
        objPessoa2.setCpf(Long.parseLong(JOptionPane.showInputDialog("Informe o CPF: ")));
        objPessoa2.setIdade(Byte.parseByte(JOptionPane.showInputDialog("Informe a Idade da pessoa 2: ")));
        objPessoa2.setRendaBrutaFamiliar(Double.parseDouble(JOptionPane.showInputDialog("Informe a renda bruta: ")));
        objPessoa2.setSexo(JOptionPane.showInputDialog("Informe o Sexo da pessoa: "));

        JOptionPane.showMessageDialog(null, "\n"
                + objPessoa1 + "\n\n"
                + objPessoa2);

    }
}
