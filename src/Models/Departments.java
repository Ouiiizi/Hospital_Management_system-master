package Models;
//Getter and Setters and Constructors
//Main Backend
public class Departments {
    private String departments;
    private String neurology;
    private String dermatology;
    private String psychotherapy;
    private String dentistry;

    public Departments(String neurology, String dermatology, String psychotherapy, String dentistry) {
        this.neurology = neurology;
        this.dermatology = dermatology;
        this.psychotherapy = psychotherapy;
        this.dentistry = dentistry;
    }

    public void getInfo(){
        System.out.println("Departments: "+ departments);
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getNeurology() {
        return neurology;
    }

    public void setNeurology(String neurology) {
        this.neurology = neurology;
    }

    public String getDermatology() {
        return dermatology;
    }

    public void setDermatology(String dermatology) {
        this.dermatology = dermatology;
    }

    public String getPsychotherapy() {
        return psychotherapy;
    }

    public void setPsychotherapy(String psychotherapy) {
        this.psychotherapy = psychotherapy;
    }

    public String getDentistry() {
        return dentistry;
    }

    public void setDentistry(String dentistry) {
        this.dentistry = dentistry;
    }
}
