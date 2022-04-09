public class Pentagono extends Poligono {
    double apotema;

    public Pentagono(String cor, double altura, double base, double lado, double area, double perimetro) {
        super(cor, altura, base, lado, area, perimetro);
    }

    public void calcularApotema(double altura){
        this.apotema = altura / 2;
    }

    public void calcularPerimetro(int lados){
        this.perimetro = 5 * lado;
    }
    
    public void calcularArea(double perimetro, double apotema){
        this.area = perimetro * apotema;
    }

    @Override
    public String toString() {
        return "Pentagono ["+ super.toString() + "]";
    }
    
}
