/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */

public class Appointment {
    private String user;          // patient email
    private String doctorName;
    private String date;
    private String time;
    private String status;

    // Constructor
    public Appointment(String user, String doctorName, String date, String time, String status) {
        this.user = user;
        this.doctorName = doctorName;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    // Getters
    public String getUser() { return user; }
    public String getDoctorName() { return doctorName; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getStatus() { return status; }

    // Setter (for Cancel/Update)
    public void setStatus(String status) {
        this.status = status;
    }
}