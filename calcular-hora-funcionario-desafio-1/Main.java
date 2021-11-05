package projjavafuncionarioatividade3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Funcionario objFuncionario1 = new Funcionario();
        Funcionario objFuncionario2 = new Funcionario();
        
        objFuncionario1.nome = JOptionPane.showInputDialog("Informe o Nome do Funcionário 1: ");
        objFuncionario1.cargaHorariaMes = Double.parseDouble(JOptionPane.showInputDialog("Informe a Carga horária do Funcionário 1: "));
        objFuncionario1.valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor Hora do Funcionário 1: "));
        
        
        objFuncionario2.nome = JOptionPane.showInputDialog("Informe o Nome do Funcionario 2: ");
        objFuncionario2.cargaHorariaMes = Double.parseDouble(JOptionPane.showInputDialog("Informe a Carga horária do Funcionário 2: "));
        objFuncionario2.valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor Hora do Funcionário 2: "));
        
        JOptionPane.showMessageDialog(null, "Dados do Funcionário 1: \n"
                +"Nome: "+objFuncionario1.nome+"\n"
                +"Carga Horária do Mês: "+objFuncionario1.cargaHorariaMes+"\n"
                +"Valor Hora: "+objFuncionario1.valorHora+"\n"
                +"O Salário do Funcionário 1 é: "+objFuncionario1.calcularSalario());
        
        JOptionPane.showMessageDialog(null, "Dados do Funcionário 2: \n"
                +"Nome: "+objFuncionario2.nome+"\n"
                +"Carga Horária do Mês: "+objFuncionario2.cargaHorariaMes+"\n"
                +"Valor Hora: "+objFuncionario2.valorHora+"\n"
                +"O Salário do Funcionário 2 é: "+objFuncionario2.calcularSalario());
    }
}
