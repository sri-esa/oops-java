package Day3;

public class Patient {
    private String patientId;
    private String name;
    private String diagnosis;

    public Patient(String patientId, String name, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis(String key) {
        return key.equals("DOC123") ? diagnosis : "Access Denied";
    }
    public static void main(String[] args) {
        Patient patient = new Patient("P001", "Jane Doe", "Flu");
        System.out.println("Diagnosis with correct key: " + patient.getDiagnosis("DOC123"));
        System.out.println("Diagnosis with incorrect key: " + patient.getDiagnosis("WRONGKEY"));
    }
}
