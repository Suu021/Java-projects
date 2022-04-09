public class Caminhao extends Carro{
    int carga;

    public Caminhao(String placa, int ano, int kms, String chassi, int numRodas, int carga) {
        super(placa, ano, kms, chassi, numRodas);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Caminhao [" + super.toString() + "carga=" + carga + "]";
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


}
