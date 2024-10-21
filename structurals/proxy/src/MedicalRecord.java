public class MedicalRecord implements ConfidencialData {
    private String patientName;

    public MedicalRecord(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public void accessRecord() {
        System.out.println("Acessando registro médico de: " + patientName);
    }
}
