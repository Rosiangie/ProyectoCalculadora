public class App {
    static void main() {
        Calculadora calc = new Calculadora();
        System.out.println("SUMA: 5 + 3 = " + calc.sumar(5, 3));
        System.out.println("Multiplicación: 5 * 3 = " + calc.multiplicar(5, 3));
    }
}