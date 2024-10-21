public class ProxyMedicalRecord implements ConfidencialData {
    private MedicalRecord medicalRecord;
    private String user;

    public ProxyMedicalRecord(String patientName, String user) {
        this.medicalRecord = new MedicalRecord(patientName);
        this.user = user;
    }

    @Override
    public void accessRecord() {
        if(haveAccess(user)) {
            medicalRecord.accessRecord();
            registerAccess(user);
        } else {
            System.out.println("Acesso negado para: " + user);
        }
    }

    private boolean haveAccess(String user) {
        // Simulação de verificação de acesso
        // Apenas para fins de exemplo, considere que "admin" tem acesso
        return "admin".equals(user);
    }

    private void registerAccess(String user) {
        // Simulação de registro de acesso
        System.out.println("Acesso registrado para: " + user);
    }
}
