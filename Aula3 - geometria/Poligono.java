abstract public class Poligono extends Forma {
    int lados;
    double perimetro, area, altura, base, lado;

    public Poligono(String cor, double altura, double base, double lado, double area, double perimetro) {
        super(cor);
        this.altura = altura;
        this.base = base;
        this.lados = 0;
        this.area = 0;
        this.perimetro = 0;
        this.lado = lado;
    };
}
