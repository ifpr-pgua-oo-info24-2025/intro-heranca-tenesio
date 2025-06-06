package Main.Models;

public class Veiculo {
    private String Marca;
    private String Modelo;
    private Integer Ano;
    
    public Veiculo(String Marca, String Modelo, Integer Ano) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
    }
    
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public Integer getAno() {
        return Ano;
    }
    public void setAno(Integer ano) {
        Ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Ano: " + Ano);    
    }   
}
