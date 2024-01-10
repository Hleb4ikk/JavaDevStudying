package Encapsulation;

public class Main{

    public static void main(String[] args){

        Human User = new Human("petr", "21urwe4", 1);
        System.out.println(User.getUsername() + " " + User.getPassword() + " " + User.get_id());
    }

}
