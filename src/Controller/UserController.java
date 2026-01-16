/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.User;
import java.util.ArrayList;


import Model.User;

public class UserController {
    public static ArrayList<User> users = new ArrayList<>();

    public static boolean emailExists(String email) {
        for(User u : users) {
            if(u.getEmail().equalsIgnoreCase(email)) return true;
        }
        return false;
    }

    public static User getUserByEmail(String email) {
        for(User u : users) {
            if(u.getEmail().equalsIgnoreCase(email)) return u;
        }
        return null;
    }
}
