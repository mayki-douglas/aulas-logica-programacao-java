package projjavapessoa;

public class Pessoa {
    private String nome;
    private long cpf;
    private byte idade;
    private double rendaBrutaFamiliar;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
    

    public double getRendaBrutaFamiliar() {
        return rendaBrutaFamiliar;
    }

    public void setRendaBrutaFamiliar(double rendaBrutaFamiliar) {
        this.rendaBrutaFamiliar = rendaBrutaFamiliar;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        return "Dados da Pessoa:\n"
                + "Nome: "+this.nome+"\n"
                + "CPF: "+this.cpf+"\n"
                + "Idade: "+this.idade+"\n"
                + "Renda Bruta Familiar: "+this.rendaBrutaFamiliar+"\n"
                + "Sexo: "+this.sexo;
    }
}
