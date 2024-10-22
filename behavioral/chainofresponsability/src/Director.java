public class Director implements Approver {
    private Approver next;

    @Override
    public void setNext(Approver approver) {
        this.next = approver;
    }

    @Override
    public void approveExpense(double amount) {
        if(amount > 10000) {
            System.out.println("Diretor aprovou a despesa de R$" + amount);
        }
    }
}
