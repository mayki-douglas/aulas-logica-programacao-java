package projjavacalculosoo;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Calculos objCalculos1 = new Calculos();

        objCalculos1.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1: "));
        objCalculos1.valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor 2: "));

        JOptionPane.showMessageDialog(null, "Resultados: \n"
                + "Valor 1: " + objCalculos1.valor1 + "\n"
                + "Valor 2: " + objCalculos1.valor2 + "\n"
                + "Soma: " + objCalculos1.somar() + "\n"
                + "Subtração: " + objCalculos1.subtrair() + "\n"
                + "Multiplicação: " + objCalculos1.multiplicar() + "\n"
                + "Divisão: " + objCalculos1.dividir() + "\n"
                + "Resto da Divisão: " + objCalculos1.restoDivisao() + "\n"
                + "Potência: " + objCalculos1.potencia() + "\n"
                + "Raiz: " + objCalculos1.raiz());
    }
}
