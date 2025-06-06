package Main;

import Main.Models.Carro;
import Main.Models.Moto;

public class App {
    public static void main( String[] args ) throws Exception{
        
        Carro carro1 = new Carro("fiat","uno", 2011, 4);
        Moto motona1 = new Moto("harley", "1789", 2006, "sla");

        carro1.exibirDetalhes();
        motona1.exibirDetalhes();
    }
}