import Models.Appointment;
import Models.Patients;
import Models.Wards;
import Models.Doctors;
//Models

public class Main {
    public static void main(String[] args) {
        Patients patients = new Patients();
        patients.addPatientsInformation();
        System.out.println("--------------------");
//Patient Information Input
        Wards ward = new Wards();
        ward.getInfo();
           //Ward Input
        Doctors doctors = new Doctors();
        doctors.displayDoctors();
     //Doctor Information
        Appointment a1 = new Appointment(patients, doctors, ward);
        a1.getAppointment();
       //Appointment Output
    }
}