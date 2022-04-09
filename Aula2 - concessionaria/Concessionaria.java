import java.util.ArrayList;

public class Concessionaria {

    final String nome;
    final String end;
    final String modelo;
    static float desconto = 0.2f;

    ArrayList<Carro> carros = new ArrayList<Carro>();
    ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();


    public Concessionaria(String nome, String end, String modelo) {
        this.nome = nome;
        this.end = end;
        this.modelo = modelo;
    }

    public void addCarro(String placa, int ano, int kms, String chassi, int numRodas) {
        carros.add(new Carro(placa, ano, kms, chassi, numRodas));

    }

    public void addCaminhao(String placa, int ano, int kms, String chassi, int numRodas, int carga){
        caminhoes.add(new Caminhao(placa, ano, kms, chassi, numRodas, carga));
    }

    public void removeCarro(){
        
        carros.remove(carros.get(0));

    }


    public void getQntCarros(){

        System.out.println(this.nome + " possui " + carros.size() + " carros!");

    }

    public float getDesconto() {
        return desconto;
    }

    public static void setDesconto(float desconto) {
        Concessionaria.desconto = desconto;
    }
   
    
}
