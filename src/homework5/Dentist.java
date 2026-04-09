package homework5;

public class Dentist extends Doctor {

    public Dentist(String doctorName) {
        super(doctorName);
    }

    @Override
    public void treat() {
        System.out.println("Дантист ставит пломбу.");
    }
}