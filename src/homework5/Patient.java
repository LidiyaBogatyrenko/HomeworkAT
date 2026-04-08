package homework5;

public class Patient {
    int treatmentPlan;
    String doctor;
    String patientName;
    String illness;

    public Patient(String patientName, String illness) {
        this.patientName = patientName;
        this.illness = illness;
    }

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}