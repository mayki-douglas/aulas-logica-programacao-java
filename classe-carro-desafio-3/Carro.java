package projjavacarrodesafio4;

public class Carro {

    public String marca;
    public String modelo;
    public String placa;
    public double valorUnitario;
    public int quantidade;
    public double nivelDoTanque;
    public double autonomia;

    public double calcularValorTotalDeVeiculos() {
        return this.valorUnitario * this.quantidade;
    }

    public double calcularDistanciaAPercorrer() {
        return this.nivelDoTanque * this.autonomia;
    }

    //variaveis inseridas dentro do Parenteses, inserir o valor delas e após, o nome da variavel.
    public double calcularGastoComViagem(double precoDoCombustivel, double distanciaAPercorrer) { 
        return distanciaAPercorrer / this.autonomia * precoDoCombustivel;
    }

    @Override
    public String toString() {   //usar Métodos ToString para mostrar tudo dentro da classe Carro ou outra classe que seja.
        return "Informações sobre a Viagem: \n"
                + "Marca: " + this.marca + "\n"
                + "Modelo: " + this.modelo + "\n"
                + "Placa do Veículo: " + this.placa + "\n"
                + "Valor Untiário: " + this.valorUnitario + "\n"
                + "Quantidade: " + this.quantidade + "\n"
                + "Nível do Tanque: " + this.nivelDoTanque + "\n"
                + "Autonomia: "+this.autonomia+"\n"
                + "Total de Veículos em R$: "+this.calcularValorTotalDeVeiculos()+"\n"
                + "Distância até o Próximo Abastecimento: "+this.calcularDistanciaAPercorrer();
    }
}
