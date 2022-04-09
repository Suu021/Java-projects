public class Linha extends Forma {
    int p1, p2;
    float distancia;

    public Linha(String cor, int p1, int p2) {
        super(cor);
        this.p1 = p1;
        this.p2 = p2;
    }
    

    public void calcularReta(){
        this.distancia =  p2 - p1;
    }


    @Override
    public String toString() {
        return "Linha [" + super.toString() + "distancia=" + distancia + "]";
    }
}