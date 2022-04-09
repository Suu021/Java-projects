public abstract class Veiculo {
    private String placa;
    private final int ano;
    private final int kms;
    public final String chassi;
    private final int numRodas;
    
    public Veiculo(String placa, int ano, int kms, String chassi, int numRodas) {
        this.placa = placa;
        this.ano = ano;
        this.kms = kms;
        this.chassi = chassi;
        this.numRodas = numRodas;
    }

    public int setKms() {
        return kms;
    }

    @Override
    public String toString() {
        return "Veiculo [ano=" + ano + ", chassi=" + chassi + ", kms=" + kms + ", numRodas=" + numRodas + ", placa=" + placa + "]";
    }

    

    
}
