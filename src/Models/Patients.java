package Models;

import java.util.Scanner;

public class Patients{
    private String Name;
    private String email;
    private String contact;

    public Patients(String name, String email, String contact) {
        Name = name;
        this.email = email;
        this.contact = contact;
    }

    public Patients(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public void addPatientsInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Patient's Name: ");
        Name = sc.nextLine();
        System.out.println("Enter Patient's E-mail: ");
        email = sc.nextLine();
        System.out.println("Enter Patient's Contact: ");
        contact = sc.nextLine();
    }

    public void displayPatientsInformation(){
        System.out.println("Patient's Name: " + Name);
        System.out.println("Patient's Email: " + email);
        System.out.println("Patient's Contact: " + contact);
        System.out.println("");
    }
}
