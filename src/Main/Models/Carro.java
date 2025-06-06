package Main.Models;

public class Carro extends Veiculo{
    private Integer numPortas;

    public Carro(String Marca, String Modelo, Integer Ano, Integer numPortas) {
        super(Marca, Modelo, Ano);
        this.numPortas = numPortas;
    }
    
    public Integer getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Carro\n");
        super.exibirDetalhes();
        System.out.println("Numero de Portas do seu carro: " + numPortas);   
    }  
}
