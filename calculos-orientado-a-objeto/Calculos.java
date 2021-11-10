package projjavacalculosoo;

public class Calculos {
    int valor1;
    double valor2;
    
    public double somar(){
        return this.valor1 + this.valor2;
    }
    public double subtrair(){
        return this.valor1 - this.valor2;
    }
    public double multiplicar(){
        return this.valor1 * this.valor2;
    }
    public double dividir(){
        return this.valor1 / this.valor2;
    }
    public double restoDivisao(){
        return this.valor1 % this.valor2;
    }
    public double potencia(){
        return Math.pow(this.valor1, this.valor2);
    }
    public double raiz(){
        return Math.pow(this.valor1, 1/this.valor2);
    }
}


