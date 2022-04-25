package com.qi.projetohoroscopo;

public class Horoscopo {

    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public boolean validarData() {
        if (this.dia >= 1 && this.dia <= 31) {
            switch (this.mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return true;
                case 2:
                    return ((this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0) && this.dia <= 29) || this.dia <= 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return (this.dia <= 30);
            }
        }
        return false;
    }

    public boolean validarDataNascimento(){
        if (this.diaNascimento >= 1 && this.diaNascimento <= 31) {
            switch (this.mesNascimento){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return true;
                case 2:
                    return ((this.anoNascimento % 4 == 0 && this.anoNascimento % 100 != 0) || (this.anoNascimento % 400 == 0) && this.diaNascimento <= 29) || this.diaNascimento <= 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return (this.diaNascimento <= 30);
            }
        }
        return false;
    }

    public int calcularIdade(){
        if (this.mes < this.mesNascimento || this.mesNascimento == this.mes && this.dia < this.diaNascimento){
            return this.ano - this.anoNascimento - 1;
        }else if(this.mes == this.mesNascimento && this.dia == this.diaNascimento){
            return this.ano - this.anoNascimento;
        }else{
            return this.ano - this.anoNascimento;
        }
    }

    public String validarSigno(){
        if(this.diaNascimento >= 20 && this.mesNascimento == 3 || this.diaNascimento <= 20 && this.mesNascimento == 4 ){
            return "Áries.";
        } else if(this.diaNascimento >= 21 && this.mesNascimento == 4 || this.diaNascimento <= 20 && this.mesNascimento == 5){
            return "Touro.";
        } else if(this.diaNascimento >= 21 && this.mesNascimento == 5 || this.diaNascimento <= 20 && this.mesNascimento == 6){
            return "Gêmeos.";
        } else if(this.diaNascimento >= 21 && this.mesNascimento == 6 || this.diaNascimento <= 21 && this.mesNascimento == 7){
            return "Câncer.";
        } else if(this.diaNascimento >= 22 && this.mesNascimento == 7 || this.diaNascimento <= 22 && this.mesNascimento == 8){
            return "Leão.";
        } else if(this.diaNascimento >= 23 && this.mesNascimento == 8 || this.diaNascimento <= 22 && this.mesNascimento == 9){
            return "Virgem.";
        } else if(this.diaNascimento >= 23 && this.mesNascimento == 9 || this.diaNascimento <= 22 && this.mesNascimento == 10){
            return "Libra.";
        } else if(this.diaNascimento >= 23 && this.mesNascimento == 10 || this.diaNascimento <= 21 && this.mesNascimento == 11){
            return "Escorpião.";
        } else if(this.diaNascimento >= 22 && this.mesNascimento == 11 || this.diaNascimento <= 21 && this.mesNascimento == 12){
            return "Sagitário.";
        }else if(this.diaNascimento >= 22 && this.mesNascimento == 12 || this.diaNascimento <= 20 && this.mesNascimento == 1){
            return "Capricórnio.";
        }else if(this.diaNascimento >= 21 && this.mesNascimento == 01 || this.diaNascimento <= 18 && this.mesNascimento == 2){
            return "Aquário.";
        } else {
            return "Peixes.";
        }
    }

    public String toString(){
     return "\n" +
             "Nome: "+this.getNome()+"\n" +
             "Data de Hoje: "+this.getDia()+"/"+this.getMes()+"/"+this.getAno()+"\n" +
             "Data de nascimento: "+this.getDiaNascimento()+"/"+this.getMesNascimento()+"/"+this.getAnoNascimento()+"\n" +
             "Idade: "+this.calcularIdade()+"\n" +
             "Seu Signo é de: "+this.validarSigno();
    }
}