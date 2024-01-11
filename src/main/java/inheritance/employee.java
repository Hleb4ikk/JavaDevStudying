package inheritance;

public class employee extends Human { //extends <Название класса свойства, методы и конструктор которого надо наследовать>
    private String password;          //^^^^^^^
    private String email;             //Ключевое слово которое обозначает наследование.
    public employee(String name, int age, double height, String password, String email) { //В параметрах нового конструктора обяательно должны быть указаны параметры от унаследованного
        super(name, age, height);     //super - обозначает вызов конструктора с тремя аргументами класса Human, также должны быть указаны все переменные из объявленного выше конструктора объектов класса(в конструкторе любого класса можно использовать this() вместо его имени, он обозначает вызов конструктора текущего класса).
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
