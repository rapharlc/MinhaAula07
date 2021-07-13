package classes;

public class Motorista {
    private String nome;
    private int matricula;
    private Carro veiculoAtual;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Carro getVeiculoAtual() {
        return veiculoAtual;
    }
    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }
    public Motorista(Carro carro){
        this.veiculoAtual = carro;
    }
    public void acelerar(int limite){
        veiculoAtual.acelerar(limite);
    }
    
    @Override
    public String toString(){
        return "qualquer coisa";
    }

    
}
