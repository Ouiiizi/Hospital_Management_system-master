package Models;

import java.util.Scanner;

public class Wards {
    public String Wards;
    public Wards() {
        this.Wards = Wards;
    }
    public String getWards() {
        return Wards;
    }
    public void setWards(String wards) {
        Wards = wards;
    }
    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ward Number : ");
        Wards = sc.nextLine();
    }
}
