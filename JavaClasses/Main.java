import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Doctor doctor1 = new Doctor("iso", "iso@gmail.com", "pediatria");
        System.out.println(doctor1.getName());
        Patient patient1 = new Patient("zhali", "zhali@gmail.com");
        System.out.println(patient1.getName());
        patient1.setName("zharick");
        System.out.println(patient1.getName());
        
        /* UIMenu.showMenu(); */
        
        /* myDoctor.addAvailableAppoiment(new Date(), "4pm");
        myDoctor.addAvailableAppoiment(new Date(), "10pm");
        myDoctor.addAvailableAppoiment(new Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getTime());
        } */
        /* Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeigth());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber()); */
    }
}