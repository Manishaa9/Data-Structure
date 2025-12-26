/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



import Model.User;

public class UserController {
    private User user;

    public UserController(User user){
        this.user = user;
    }

    public void updateProfile(String name, String email, String phone, String address){
        user.setName(name);
        user.setEmail(email);
        user.setPhone(phone);
        user.setAddress(address);

        // Optional: Save to database here
    }

    public User getUser(){
        return user;
    }
}
