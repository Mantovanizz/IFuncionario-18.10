class Gerente extends Funcionario {
    private double salarioInicial;

    public Gerente(String nome, double salarioInicial) {
        super(nome);
        this.salarioInicial = salarioInicial;
    }

    @Override
    public Double calcularSalario() {
        return salarioInicial * 2;
    }

    @Override
    public String descreverResponsabilidades() {
        return "O Gerente esta responsavel pelo controle da equipe e definir estratégias.";
    }
}
