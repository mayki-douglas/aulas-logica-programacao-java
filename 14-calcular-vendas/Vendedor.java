package projjavacalcularvendas;

public class Vendedor {
    private String nome;
    private float valorTotalVendido;
    private float meta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorTotalVendido() {
        return valorTotalVendido;
    }

    public void setValorTotalVendido(float valorTotalVendido) {
        this.valorTotalVendido = valorTotalVendido;
    }

    public float getMeta() {
        return meta;
    }

    public void setMeta(float meta) {
        this.meta = meta;
    }
    
    public float calcularComissao(){
        if(this.valorTotalVendido < this.meta * 50/100){
            return this.valorTotalVendido *1/100;
        } else if(this.valorTotalVendido < this.meta * 75/100 && this.valorTotalVendido > this.meta * 50/100){
            return this.valorTotalVendido *2.5f/100;
        } else if(this.valorTotalVendido > this.meta *75.1/100 && this.valorTotalVendido < this.meta *100/100){
            return this.valorTotalVendido *3.5f/100;
        } else{
            return this.valorTotalVendido *5/100;
        }
    }

    @Override
    public String toString() {
        return "Dados do Vendedor: \n"
                + "Nome: "+this.nome+"\n"
                + "Valor total vendido: "+this.valorTotalVendido+"\n"
                + "Meta: "+this.meta+"\n"
                + "Valor total da Comissão: "+this.calcularComissao();
    }
    
    
}


// calculos de porcetagem feitos e convertidos por float