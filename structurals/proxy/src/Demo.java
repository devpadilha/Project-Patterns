public class Demo {
    public static void main(String[] args) {
        // Usuário que tem acesso
        ConfidencialData registro1 = new ProxyMedicalRecord("João Silva", "admin");
        registro1.accessRecord();  // Acesso permitido

        // Usuário que não tem acesso
        ConfidencialData registro2 = new ProxyMedicalRecord("Maria Oliveira", "usuario");
        registro2.accessRecord();  // Acesso negado
    }
}
