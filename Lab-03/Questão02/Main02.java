public class Main02 {
    public static void main(String[] args) {
        CalculadoraBinaria calcAntiga = new CalculadoraBinaria();
        CalculadoraAlvo calculadora = new CalculadoraAdapter(calcAntiga);

        System.out.println("soma (10 + 5): " + calculadora.somar(10, 5));
        System.out.println("subtracao (10 - 5): " + calculadora.subtrair(10, 5));
        System.out.println("multiplicacao (10 * 5): " + calculadora.multiplicar(10, 5));
    }
}