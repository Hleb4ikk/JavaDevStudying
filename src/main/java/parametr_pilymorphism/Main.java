package parametr_pilymorphism;      //параметрический полиморфизм заключается в том, что мы можем в разных создать одинаковый метод, и принимая разные параметры результат данной функции будет меняться
                                    //в зависимости от типа объекта который мы установим. Так же это может работать и с наследуемыми классами.


public class Main {
    public static void main(String[] args){
        Human Student = new Human("Ivan", 18,1.86);
        employee Dev = new employee("Gleb", 18, 1.92, "93jdskg", "hlebor2006@mail.ru");
        System.out.println(Dev.getName() + " " + Dev.getEmail() + " " + Dev.getPassword());
        Human[] mass = new Human[] {Student, Dev};
        for(int i = 0; i <= mass.length-1; i++){

            mass[i].greeting();


        }
        //Student.greeting();
        //Dev.greeting();
    }
}
