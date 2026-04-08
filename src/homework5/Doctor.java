package homework5;

public class Doctor {
    String doctorName;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
    }

    public void treat() {
        System.out.println("Врач лечит пациента");
    }
}