public class Calculadora {
    private Suma suma;
    private Multiplicacion multiplicacion;
    private Resta resta;
    public  Calculadora(){
        this.suma = new Suma();
        this.multiplicacion=new Multiplicacion();
    }
    public double sumar(double a, double b) {
        return suma.calcular(a, b);
    }

    public double multiplicar(double a, double b) {
        return multiplicacion.multiplicar(a, b);
    }

    public double restar(double a, double b) {
        return resta.restar(a, b);
    }
}