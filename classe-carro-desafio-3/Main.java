package projjavacarrodesafio4;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Carro objCarro1 = new Carro();
        
        objCarro1.marca = JOptionPane.showInputDialog("Insira a Marca do Veículo: ");
        objCarro1.modelo = JOptionPane.showInputDialog("Insira o Modelo do Veículo: ");
        objCarro1.placa = JOptionPane.showInputDialog("Insira a Placa do Veículo: ");
        objCarro1.valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Veículo: "));
        objCarro1.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade: "));
        objCarro1.nivelDoTanque = Double.parseDouble(JOptionPane.showInputDialog("Insira o nível do tanque: "));
        objCarro1.autonomia = Double.parseDouble(JOptionPane.showInputDialog("Insira a autonomia: "));
        
        double precoDoCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Combustível: "));
        double distanciaAPercorrer = Double.parseDouble(JOptionPane.showInputDialog("Informe a Distância a percorrer: "));
        
        
        //chamando o Método ToString dentro da classe MAIN para executa-lo e aparecer na Tela com as informações que o usuário ira colocar.
        
        JOptionPane.showMessageDialog(null, objCarro1.toString()+"\n"
                + "Total Gasto com a Viagem: "+objCarro1.calcularGastoComViagem(precoDoCombustivel, distanciaAPercorrer));
    }
}
