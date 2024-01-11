package ad_hoc_polymorphism;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Calculator addi = new Calculator(); //когда мы создаем объект класса Calculator все наши методы объекта класса становятся привязанными к объекту этого класса, если мы не создаем объект, а пользуемся
                                            //этими методами то этот метод должен быть static чтобы привязать его к классу и использовать его не через наш созданный объект а через класс.
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(addi.add(x,y));
        System.out.println(addi.add("3","3"));
    }

}
