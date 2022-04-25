package com.qi.projetohoroscopo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Horoscopo objHoroscopo = new Horoscopo();

        objHoroscopo.setNome(JOptionPane.showInputDialog("Insira o Nome: "));
        objHoroscopo.setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia de hoje: ")));
        objHoroscopo.setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o Mês atual: ")));
        objHoroscopo.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: ")));
        objHoroscopo.setDiaNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de Nascimento: ")));
        objHoroscopo.setMesNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o Mês de Nascimento: ")));
        objHoroscopo.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de Nascimento: ")));

        if(objHoroscopo.validarData() && objHoroscopo.validarDataNascimento()){
            JOptionPane.showMessageDialog(null, objHoroscopo);
        }else {
            JOptionPane.showMessageDialog(null, "Informe uma data correta!");
        }

    }
}
