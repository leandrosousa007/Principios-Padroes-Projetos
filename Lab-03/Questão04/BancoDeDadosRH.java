public class BancoDeDadosRH implements AcessoDadosFuncionario {
    @Override
    public void visualizarSalario(String nomeFuncionario) {
        System.out.println("buscando no banco... o salario de " + nomeFuncionario + " eh 5000.");
    }
}