package projjavaendereco;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Endereco objEndereco1 = new Endereco();
        Endereco objEndereco2 = new Endereco();

        objEndereco1.setRua(JOptionPane.showInputDialog("Insira o nome da Rua 1: "));
        objEndereco1.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Insira o Número: ")));
        objEndereco1.setComplemento(JOptionPane.showInputDialog("Insira o Complemento: "));
        objEndereco1.setBairro(JOptionPane.showInputDialog("Insira o Bairro: "));
        objEndereco1.setCep(JOptionPane.showInputDialog("Insira o CEP da rua 1: "));
        objEndereco1.setCidade(JOptionPane.showInputDialog("Insira a cidade: "));

        objEndereco2.setRua(JOptionPane.showInputDialog("Insira o nome da Rua 2: "));
        objEndereco2.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Insira o Número: ")));
        objEndereco2.setComplemento(JOptionPane.showInputDialog("Insira o Complemento: "));
        objEndereco2.setBairro(JOptionPane.showInputDialog("Insira o Bairro: "));
        objEndereco2.setCep(JOptionPane.showInputDialog("Insira o CEP da rua 2: "));
        objEndereco2.setCidade(JOptionPane.showInputDialog("Insira a cidade: "));

        JOptionPane.showMessageDialog(null, "\n"
                + objEndereco1 + "\n\n"
                + objEndereco2);

    }
}
