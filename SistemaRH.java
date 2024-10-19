public class SistemaRH {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Iuri", 5000);
        System.out.println("Gerente " + gerente.getNome());
        System.out.println("Salário R$ " + gerente.calcularSalario());
        System.out.println("Responsabilidades " + gerente.descreverResponsabilidades());
        
        System.out.println();

        Desenvolvedor desenvolvedor = new Desenvolvedor("Gabriel", 3000);
        System.out.println("Desenvolvedor " + desenvolvedor.getNome());
        System.out.println("Salário R$ " + desenvolvedor.calcularSalario());
        System.out.println("Responsabilidades " + desenvolvedor.descreverResponsabilidades());
    }
}
