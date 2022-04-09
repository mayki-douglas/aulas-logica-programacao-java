package projjavacaoatividade2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        Cao objCao1 = new Cao();
        Cao objCao2 = new Cao();
        
        objCao1.nome = JOptionPane.showInputDialog("Informe o Nome do Cachorro 1: ");
        objCao1.raca = JOptionPane.showInputDialog("Informe a Raça do Cachorro 1: ");
        objCao1.cor = JOptionPane.showInputDialog("Informe a cor do Cachorro 1: ");
        objCao1.sexo = JOptionPane.showInputDialog("Informe o Sexo do Cachorro 1: ");
        objCao1.porte = JOptionPane.showInputDialog("Informe o Porte do Cachorro 1: ");
        objCao1.idade = Byte.parseByte(JOptionPane.showInputDialog("Informe a idade do Cachorro 1: "));
        objCao1.dono = JOptionPane.showInputDialog("Informe o Dono do Cachorro 1: ");
        
        objCao2.nome = JOptionPane.showInputDialog("Informe o Nome do Cachorro 2: ");
        objCao2.raca = JOptionPane.showInputDialog("Informe a Raça do Cachorro 2: ");
        objCao2.cor = JOptionPane.showInputDialog("Informe a cor do Cachorro 2: ");
        objCao2.sexo = JOptionPane.showInputDialog("Informe o Sexo do Cachorro 2: ");
        objCao2.porte = JOptionPane.showInputDialog("Informe o Porte do Cachorro 2: ");
        objCao2.idade = Byte.parseByte(JOptionPane.showInputDialog("Informe a idade do Cachorro 2: "));
        objCao2.dono = JOptionPane.showInputDialog("Informe o Dono do Cachorro 2: ");
        
        JOptionPane.showMessageDialog(null, "Dados do Cachorro 1\n"
                +"Nome: "+objCao1.nome+"\n"
                +"Raça: "+objCao1.raca+"\n"
                +"Cor: "+objCao1.cor+"\n"
                +"Sexo: "+objCao1.sexo+"\n"
                +"Porte: "+objCao1.porte+"\n"
                +"Idade: "+objCao1.idade+"\n"
                +"Dono: "+objCao1.dono);
        
        JOptionPane.showMessageDialog(null, "Dados do Cachorro 2\n"
                +"Nome: "+objCao2.nome+"\n"
                +"Raça: "+objCao2.raca+"\n"
                +"Cor: "+objCao2.cor+"\n"
                +"Sexo: "+objCao2.sexo+"\n"
                +"Porte: "+objCao2.porte+"\n"
                +"Idade: "+objCao2.idade+"\n"
                +"Dono: "+objCao2.dono);
    }
}
