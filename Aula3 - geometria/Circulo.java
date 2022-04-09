public class Circulo extends Forma{
    double raio, circunferencia, area;

    public Circulo(String cor, float area, float raio, float circunferencia) {
        super(cor);
        this.raio = raio;
    } 

    public void calcularCircunferencia(double pi, double raio){
        this.circunferencia = 2 * pi * raio;
    }

    public void carcularArea(double pi, double raio){
        this.area =  pi * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo [" + super.toString() + "area=" + area + ", circunferencia=" + circunferencia + ", raio=" + raio + "]";
    } 
    
}
