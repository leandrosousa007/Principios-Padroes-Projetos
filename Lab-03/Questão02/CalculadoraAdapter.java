public class CalculadoraAdapter implements CalculadoraAlvo {
    private CalculadoraBinaria calcBinaria;

    public CalculadoraAdapter(CalculadoraBinaria calcBinaria) {
        this.calcBinaria = calcBinaria;
    }

    @Override
    public int somar(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBin = calcBinaria.somar(binA, binB);
        return Integer.parseInt(resultadoBin, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBin = calcBinaria.subtrair(binA, binB);
        return Integer.parseInt(resultadoBin, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        int total = 0;
        int limite = Math.abs(b);
        for (int i = 0; i < limite; i++) {
            total = this.somar(total, Math.abs(a));
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            return -total;
        }
        return total;
    }
}