/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Appointment;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author Lenovo
 */


public class AppointerController {
    public static List<Appointment> appointmentList = new ArrayList<>();
    private static Queue<Appointment> recentQueue = new LinkedList<>();

    public static void bookAppointment(String user, String doctor, String date, String time) {
        Appointment appt = new Appointment(user, doctor, date, time, "Booked");
        appointmentList.add(appt);
        appointmentList.add(appt);
        recentQueue.offer(appt);
        if (recentQueue.size() > 5) {
            recentQueue.poll();
        }
    }

    public static List<Appointment> getAllAppointments() {
        return new ArrayList<>(appointmentList);
    }

    public static Queue<Appointment> getRecentAppointments() {
        return new LinkedList<>(recentQueue);
    }

    public static List<Appointment> searchAppointments(String query) {
        List<Appointment> results = new ArrayList<>();
        String q = query.toLowerCase();
        for (Appointment a : appointmentList) {
            if (a.getUser().toLowerCase().contains(q) ||
                a.getDoctorName().toLowerCase().contains(q) ||
                a.getDate().toLowerCase().contains(q)) {
                results.add(a);
            }
        }
        return results;
    }

    public static Map<String, Integer> getCountByDoctor() {
        Map<String, Integer> map = new HashMap<>();
        for (Appointment a : appointmentList) {
            String doc = a.getDoctorName();
            map.put(doc, map.getOrDefault(doc, 0) + 1);
        }
        return map;
    }
}