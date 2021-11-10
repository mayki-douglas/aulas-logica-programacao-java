package projjavaoperadoresmatematicos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor 1: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor 2: "));

        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;
        double restoDivisao = valor1 % valor2;
        double potencia = Math.pow(valor1, valor2);
        double raiz = Math.pow(valor1, 1/ valor2);


        JOptionPane.showMessageDialog(null, "Dados e Calculos \n"
                + "Valor 1: " + valor1 + "\n"
                + "Valor 2: " + valor2 + "\n"
                + "Soma: " + soma + "\n"
                + "Subtração: " + subtracao + "\n"
                + "Multiplicação: " + multiplicacao + "\n"
                + "Divisão: " + divisao + "\n"
                + "Resto da Divisão: " + restoDivisao + "\n"
                + "Potência: " + potencia + "\n"
                + "Raiz: " + raiz);
    }
}
