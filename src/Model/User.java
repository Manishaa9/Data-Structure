/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */

public class User {
    private String name;
    private String email;
    private String password;
    private String gender;
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public User(String name, String email, String password, String gender) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getGender() { return gender; }
    public ArrayList<Appointment> getAppointments() { return appointments; }

    public void addAppointment(Appointment appt) { appointments.add(appt); }
}