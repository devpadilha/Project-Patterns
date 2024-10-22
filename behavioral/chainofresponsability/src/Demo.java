public class Demo {
    public static void main(String[] args) {
        // Criar os aprovadores
        Approver supervisor = new Supervisor();
        Approver gerente = new Manager();
        Approver diretor = new Director();

        // Configurar a cadeia de responsabilidade
        supervisor.setNext(gerente);
        gerente.setNext(diretor);

        // Testar a cadeia com diferentes valores de despesas
        System.out.println("Solicitando aprovação para despesa de R$ 500");
        supervisor.approveExpense(500);

        System.out.println("Solicitando aprovação para despesa de R$ 2.000");
        supervisor.approveExpense(2000);

        System.out.println("Solicitando aprovação para despesa de R$ 20.000");
        supervisor.approveExpense(20000);
    }
}
