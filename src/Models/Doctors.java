package Models;

import java.util.ArrayList;
import java.util.Scanner;
//Getter,Setters and Constructors
public class Doctors {
    private String name;
    private String department;
    private String tests;
    private String time;
    private int ID;



    public Doctors(String name, String department, String tests, String time, int ID) {
        this.name = name;
        this.department = department;
        this.tests = tests;
        this.time = time;
        this.ID = ID;
    }

    public Doctors() {

    }
    public int getID(){
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }

    public String gettime() {
        return time;
    }

    public void settime(String time) {
        this.time = time;
    }

    public void displayDoctors(){
        Doctors d1 = new Doctors("Dr.one","neurology","CSF test/MRI ", "10:20 AM",1);
        Doctors d2 = new Doctors("Dr.two","dermatology","Skin Biopsies", "11:00 AM",2);
        Doctors d3 = new Doctors("Dr.three","psychotherapy","Personality Disorder test", "12:00 AM",3);
        Doctors d4 = new Doctors("Dr.four","dentistry","Oral Health checkup", "8:00 AM",4);

        System.out.println(d1.getID() +".  Doctor's Name : " + d1.getName() +"     " + "Department : " + d1.getDepartment() + "    " + " Test : " + d1.getTests() );
        System.out.println(d2.getID() +".  Doctor's Name : " + d2.getName() +"     " + "Department : " + d2.getDepartment() + "    " + " Test : " + d2.getTests() );
        System.out.println(d3.getID() +".  Doctor's Name : " + d3.getName() +"     " + "Department : " + d3.getDepartment() + "    " + " Test : " + d3.getTests() );
        System.out.println(d4.getID() +".  Doctor's Name : " + d4.getName() +"     " + "Department : " + d4.getDepartment() + "    " + " Test : " + d4.getTests() );

        Scanner dc = new Scanner(System.in);
        System.out.println("Enter ID for Choosing Doctor: ");
        ID = dc.nextInt();


    }

}
