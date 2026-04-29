java
public class Calculadora {
    private Suma suma;
    private Division division;

    public Calculadora() {
        this.suma = new Suma();
        this.division = new Division();
    }

    public double sumar(double a, double b) {
        return suma.calcular(a, b);
    }

    public double dividir(double a, double b) {
        return division.dividir(a, b);
    }
}