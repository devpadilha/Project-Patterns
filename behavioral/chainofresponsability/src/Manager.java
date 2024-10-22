public class Manager implements Approver {
    private Approver next;

    @Override
    public void setNext(Approver approver) {
        this.next = approver;
    }

    @Override
    public void approveExpense(double amount) {
        if(amount > 1000 && amount <= 10000) {
            System.out.println("Gerente aprovou a despesa de R$" + amount);
        } else {
            if(next != null) {
                next.approveExpense(amount);
            }
        }
    }
}
