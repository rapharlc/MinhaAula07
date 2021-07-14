package classes;

public class Carro {
    private String placa;
    private int numChassi;
    private int velocidadeAtual;
    Motorista motoristaDoCarro;

    public String getPalaca() {
        return placa;
    }
    public void setPalaca(String placa) {
        this.placa = placa;
    }
    public int getNumChassi() {
        return numChassi;
    }
    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public Motorista getMotoristadoCarro(){
        return motoristaDoCarro;
    }
    
    public Carro(String placa, int numChassi, Motorista motorista) {
        this.placa = placa;
        this.numChassi = numChassi;
        this.motoristaDoCarro.setVeiculoAtual(this);;
    }

    public Carro(){

    }

    void acelerar() {
        this.velocidadeAtual++;
    }

    void acelerar(int limite){
        for (int i = 0; i < limite; i++) {
            this.acelerar();
        }
    }
    
    
}
