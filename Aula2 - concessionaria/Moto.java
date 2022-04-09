public class Moto extends Veiculo {
    int cilindradas;

   

   public Moto(String placa, int ano, int kms, String chassi, int numRodas, int cilindradas) {
        super(placa, ano, kms, chassi, numRodas);
        this.cilindradas = cilindradas;
    }



    @Override
    public String toString() {
        return "Moto [" + super.toString() + "cilindradas=" + cilindradas + "]";
    }

      

    
}
