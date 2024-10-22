public interface Approver {
    void setNext(Approver approver);
    void approveExpense(double amount);
}
