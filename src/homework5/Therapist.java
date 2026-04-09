package homework5;

public class Therapist extends Doctor {

    public Therapist(String doctorName) {
        super(doctorName);
    }

    @Override
    public void treat() {
        System.out.println("Терапевт проводит консультацию.");
    }

    public void chooseDoctor(int treatmentPlan) {
        if (treatmentPlan == 1) {
            Surgeon surgeon = new Surgeon("Хирургов Пётр");
            System.out.println("Назначен хирург: " + surgeon.doctorName);
            surgeon.treat();
        } else if (treatmentPlan == 2) {
            Dentist dentist = new Dentist("Зубов Николай");
            System.out.println("Назначен дантист: " + dentist.doctorName);
            dentist.treat();
        } else {
            Therapist therapist = new Therapist("Терапевтова Ольга");
            System.out.println("Назначен терапевт: " + therapist.doctorName);
            therapist.treat();
        }
    }
}