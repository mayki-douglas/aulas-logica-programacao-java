package projjavaendereco;

public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCep() {
        return this.cep;
    }

    public String cidade() {
        return this.cidade;
    }

    @Override
    public String toString() {
        return "Dados do Endereço \n"
                + "Rua: " + this.rua + "\n"
                + "Numero: " + this.numero + "\n"
                + "Complemento: " + this.complemento + "\n"
                + "Bairro: " + this.bairro + "\n"
                + "Cep: " + this.cep + "\n"
                + "Cidade: " + this.cidade;
    }
}
