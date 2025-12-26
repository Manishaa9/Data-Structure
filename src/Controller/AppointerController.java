/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Appointment;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class AppointerController {
    private static ArrayList<Appointment> appointmentList = new ArrayList<>();

    public static void bookAppointment(String doctor, String date, String user){
        Appointment a = new Appointment(doctor,date,user);
        appointmentList.add(a);
        System.out.println("Appointment Booked Successfully!");
    }

    public static ArrayList<Appointment> getAppointments(String user){
        return appointmentList;
    }
}
