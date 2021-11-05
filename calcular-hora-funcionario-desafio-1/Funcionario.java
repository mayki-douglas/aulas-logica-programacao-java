package projjavafuncionarioatividade3;

public class Funcionario {
    public String nome;
    public double valorHora;
    public double cargaHorariaMes;
    
    public double calcularSalario(){
        return this.valorHora * this.cargaHorariaMes;
    }
}
