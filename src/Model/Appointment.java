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
    String doctorName;
    String date;
    String user;

    public Appointment(String doctorName,String date,String user){
        this.doctorName = doctorName;
        this.date = date;
        this.user = user;
    }

    public String getDoctorName(){ return doctorName;}
    public String getDate(){ return date;}
    public String getUser(){ return user;}
}
