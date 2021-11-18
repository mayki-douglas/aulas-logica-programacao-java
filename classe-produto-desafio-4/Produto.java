package projjavaprodutodesafio5;

public class Produto {
    private String nome;
    private String descricao;
    private double valorUnitario;
    private double quantidade;
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    
    public double getValorUnitario(){
        return this.valorUnitario;
    }
    
    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }
    
    public double getQuantidade(){
        return this.quantidade;
    }
    
    public double calcularValorTotal(){
        return this.quantidade * this.valorUnitario;
    }
}

//Classes com atributos privados usa-se o método GET e SET, SET para chamar na main e GET para executa-la na tela.