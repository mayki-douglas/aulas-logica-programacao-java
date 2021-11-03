package projjavacliente;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        Cliente objCliente1 = new Cliente();
        Cliente objCliente2 = new Cliente();
        
        objCliente1.nome = "Mayki Douglas";
        objCliente1.cpf = "123.456.789-00";
        objCliente1.rg = "111222345";
        objCliente1.endereco = "Rua Madre Paulina";
        objCliente1.rendaBruta = 2000.00;
        objCliente1.limite = 500.00;
        
        objCliente2.nome = "Naruto Uzumaki";
        objCliente2.cpf = "999.888.777-66";
        objCliente2.rg = "9998887766";
        objCliente2.endereco = "Avenida Dorival Cândido Luz de Oliveira";
        objCliente2.rendaBruta = 1500.00;
        objCliente2.limite = 700.00;
        
        JOptionPane.showMessageDialog(null, "Dados do Cliente 1\n"
                + "Nome: "+objCliente1.nome+"\n"
                + "CPF: "+objCliente1.cpf+"\n"
                + "RG: "+objCliente1.rg+"\n"
                + "Endereço: "+objCliente1.endereco+"\n"
                + "Renda Bruta: "+objCliente1.rendaBruta+"\n"
                + "Limite: "+objCliente1.limite);
        
        
        JOptionPane.showMessageDialog(null, "Dados do Cliente 2\n"
                + "Nome: "+objCliente2.nome+"\n"
                + "CPF: "+objCliente2.cpf+"\n"
                + "RG: "+objCliente2.rg+"\n"
                + "Endereço: "+objCliente2.endereco+"\n"
                + "Renda Bruta: "+objCliente2.rendaBruta+"\n"
                + "Limite: "+objCliente2.limite);
    }
}
