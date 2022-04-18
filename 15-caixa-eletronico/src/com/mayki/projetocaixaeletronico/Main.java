package com.mayki.projetocaixaeletronico;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SaqueCaixaEletronico objSaque = new SaqueCaixaEletronico();

        objSaque.setValorSaque(Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Saque: ")));

        JOptionPane.showMessageDialog(null, objSaque);

    }

}
