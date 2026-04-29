public class Calculadora {
    private Suma suma;
    private Multiplicacion multiplicacion;
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
}