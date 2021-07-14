package programa;

import java.util.Scanner;

import classes.Carro;
import classes.Motorista;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Motorista mot = new Motorista("José", 123456);
        Carro carr = new Carro("KMZ-0934", 123456, mot);
        mot.acelerar(100);
        System.out.println("PASSAGEIRO: Motorista, acelerar o carro até 100km/h!!!");
        System.out.println("MOTORISTA: Ok! Vamos lá !!!");
        System.out.printf("Velocidade do carro: %s km/h", carr.getVelocidadeAtual());
        sc.close();
        
        
    }
}
