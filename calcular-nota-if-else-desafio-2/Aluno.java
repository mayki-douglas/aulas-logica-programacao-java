package projjavaalunoatividade4;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    
    
    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }
    public String verificarSituacao(){
        if(calcularMedia() >= 6){
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }
    
}
