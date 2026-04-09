package homework5;

public class Surgeon extends Doctor {

    public Surgeon(String doctorName) {
        super(doctorName);
    }

    @Override
    public void treat() {
        System.out.println("Хирург проводит операцию!");
    }
}