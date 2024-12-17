
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Evrilia Elsyabila
 */
public class Login {
    private String username = "admin";
    private String password = "123";

    public boolean authenticate(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }

    public void showLoginDialog() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Username: ");
        String userInput = scanner.nextLine();
        
        System.out.print("Password: ");
        String passInput = scanner.nextLine();
    }
}
