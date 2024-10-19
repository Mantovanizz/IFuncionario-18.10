class Desenvolvedor extends Funcionario {
    private double salarioInicial;

    public Desenvolvedor(String nome, double salarioInicial) {
        super(nome);
        this.salarioInicial = salarioInicial;
    }

    @Override
    public Double calcularSalario() {
        return salarioInicial * 1.5;
    }

    @Override
    public String descreverResponsabilidades() {
        return "O Desenvolvedor esta responsável por criar e manter o código do sistema.";
    }
}