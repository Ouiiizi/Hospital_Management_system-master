package Models;

public class Appointment extends Patients{
    public Wards wards;
    public Patients patients;
    public Doctors doctors;
//Getters and Setters
    public Appointment( Wards wards, Patients patients, Doctors doctors) {
        this.wards = wards;
        this.patients = patients;
        this.doctors = doctors;
    }


    public Appointment(Patients patients, Doctors doctors, Wards wards) {
        this.patients = patients;
        this.doctors = doctors;
        this.wards = wards;
    }
    //Constructors
    public Wards getWards() {
        return wards;
    }

    public void setWards(Wards wards) {
        this.wards = wards;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }
//Output:
    public void getAppointment() {
        System.out.println("Patient's Information");
        patients.displayPatientsInformation();
        System.out.println("Appointment Token");

        if (getDoctors().getID() == 1) {
            System.out.println(getPatients().getName() + " has booked an appointment with " + d1.getName() + " of " + getDoctors().getDepartment() + " Department at " + getDoctors().gettime() + " A.M in ward no. " + getWards().getWards());
        }
    }
}
