package homework5;

import java.util.Scanner;
/*
Задача 1:
Создать программу для имитации работы клиники. Пусть в клинике будет три
врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но
каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
«План лечения» и полем «Доктор». Создать объект класса «Пациент» и
добавить пациенту план лечения. У терапевта создать метод, который будет
назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
 */
public class Hospital {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Сергей Иванович", "Болит зуб");
        Patient patient2 = new Patient("Краснова Анна", "Болит нога");

        System.out.println("Пациент: " + patient1.patientName + ", жалоба: " + patient1.illness);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код лечения пациента: " + patient1.patientName);
        patient1.treatmentPlan = scanner.nextInt();

        Therapist therapist = new Therapist("Терапевтова Ольга");
        therapist.chooseDoctor(patient1.treatmentPlan);

        System.out.println();
        System.out.println("Пациент: " + patient2.patientName + ", жалоба: " + patient2.illness);
        System.out.println("Введите код лечения пациента: " + patient2.patientName);
        patient2.treatmentPlan = scanner.nextInt();

        therapist.chooseDoctor(patient2.treatmentPlan);

        scanner.close();
    }
}