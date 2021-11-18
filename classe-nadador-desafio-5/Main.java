package projjavanadadordesafio5;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Nadador objNadador1 = new Nadador();
        
        objNadador1.setNome(JOptionPane.showInputDialog("Informe o Nome do Nadador: "));
        objNadador1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade: ")));
        
        JOptionPane.showMessageDialog(null, "Dados do Nadador: "
                + objNadador1);
        
    }
}
