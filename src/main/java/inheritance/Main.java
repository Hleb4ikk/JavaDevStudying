package inheritance;

public class Main {
    public static void main(String[] args){

        employee Dev = new employee("Gleb", 18, 1.92, "93jdskg", "hlebor2006@mail.ru");
        System.out.println(Dev.getName() + " " + Dev.getEmail() + " " + Dev.getPassword());

    }
}
