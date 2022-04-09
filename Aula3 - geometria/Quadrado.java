public class Quadrado extends Poligono {
    
    public Quadrado(String cor, double lado, double perimetro, double area, int lados) {
        super(cor, lado, perimetro, area, lados, area);
        this.lados = 4;
    }

    public void calcularPerimetro(){
        this.perimetro =  lados * lado;
    }

    public void calcularArea(){
        this.area = lado * lado;
    }

    @Override
    public String toString() {
        return "Triangulo ["+ super.toString() + ", lado=" + lado + ", perimetro=" + perimetro +"area=" + area +"]";
    }


   
    
}
