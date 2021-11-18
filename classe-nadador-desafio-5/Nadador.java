package projjavanadadordesafio5;

public class Nadador {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String classificarNadador() {
        if (this.idade < 8) {
            return "Não pode ser Nadador, idade mínima de 8 Anos";
        } else if (this.idade > 7 && this.idade < 11) {
            return "Nadador Infantil";
        } else if (this.idade > 10 && this.idade < 18) {
            return "Nadador Juvenil";
        } else if (this.idade > 17 && this.idade < 50) {
            return "Nadador Adulto";
        } else if (this.idade > 49 && this.idade < 61) {
            return "Nadador de Terceira idade";
        } else if (this.idade > 60){
            return "Não pode ser Nadador, idade máxima de 60 anos";
        } else {
            return null;
        }

    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + "\n"
                + "Classificar Nadador: " + this.classificarNadador();
    }
}
