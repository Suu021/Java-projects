public class Triangulo extends Poligono {

    public Triangulo(String cor, double altura, double base, double perimetro, double area) {
        super(cor, altura, base, perimetro, area, area);
        this.lados = 3;
    }
    
    public void calcularPerimetro(){
        this.perimetro =  lados * base;
    }

    public void calcularArea(){
        this.area = (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo ["+ super.toString() + "altura=" + altura + ", base=" + base + ", perimetro=" + perimetro +"area=" + area +"]";
    }
}
