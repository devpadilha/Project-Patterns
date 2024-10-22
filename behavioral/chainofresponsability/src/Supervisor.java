public class Supervisor implements Approver {
    private Approver next;

    @Override
    public void setNext(Approver approver) {
        this.next = approver;
    }

    @Override
    public void approveExpense(double amount) {
        if(amount <= 1000) {
            System.out.println("Supervisor aprovou a despesa de R$" + amount);
        } else {
            if(next != null) {
                next.approveExpense(amount);
            }
        }
    }
}
