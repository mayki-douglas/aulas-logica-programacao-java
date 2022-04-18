package com.mayki.projetocaixaeletronico;

public class SaqueCaixaEletronico {
    private int valorSaque;

    public int getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(int valorSaque) {
        this.valorSaque = valorSaque;
    }

    public int calcularNotasDe100(){
        return this.valorSaque / 100;
    }

    public int calcularNotasDe50(){
        return this.valorSaque % 100 / 50;
    }

    public int calcularNotasDe20(){
        return this.valorSaque % 100 % 50 / 20;
    }
    public int calcularNotasDe10(){
        return this.valorSaque % 100 % 50 % 20 / 10;
    }

    public int calcularNotasDe5(){
        return this.valorSaque % 100 % 50 % 20 % 10 / 5;
    }

    public int calcularNotasDe2(){
        return this.valorSaque % 100 % 50 % 20 % 10 % 5 / 2;
    }

    @Override
    public String toString(){
        return "Notas a serem sacadas: \n" +
                "Valor Sacado: "+this.getValorSaque()+"\n"+
                "Notas de 100: "+this.calcularNotasDe100()+"\n" +
                "Notas de 50: "+this.calcularNotasDe50()+"\n" +
                "Notas de 20: "+this.calcularNotasDe20()+"\n" +
                "Notas de 10: "+this.calcularNotasDe10()+"\n" +
                "Notas de 5: "+this.calcularNotasDe5()+"\n" +
                "Notas de 2: "+this.calcularNotasDe2();
    }
}
