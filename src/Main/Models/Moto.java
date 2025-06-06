package Main.Models;

public class Moto extends Veiculo{
    private String TipoDeGuidao;

    public Moto(String Marca, String Modelo, Integer Ano, String TipoDeGuidao) {
        super(Marca, Modelo, Ano);
        this.TipoDeGuidao = TipoDeGuidao;
    }
    
    public String getTipoDeGuidao() {
        return TipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        TipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto\n");
        super.exibirDetalhes();
        System.out.println("O tipo do guidao da sua moto: " + TipoDeGuidao);   
    }
}
