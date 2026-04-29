public class Calculadora {
    private Suma suma;

    public  Calculadora(){
        this.suma = new Suma();
    }
    public double sumar(double a, double b) {
        return suma.calcular(a, b);
    }

}