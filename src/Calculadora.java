public class Calculadora {
    private Suma suma;
    private Multiplicacion multiplicacion;
    private Resta resta;
    private Division division;
    public  Calculadora(){
        this.suma = new Suma();
        this.multiplicacion=new Multiplicacion();
    }
    public double sumar(double a, double b) {
        return suma.calcular(a, b);
    }

    public double dividir(double a, double b) {
        return division.dividir(a, b);
    }
}