package ad_hoc_polymorphism;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public String add(String a, String b){      //ad-hoc полиморфизм есть перегрузка методов в моем понимании. Можем использовать то же название функций но с разными параметрами, типами или кол-вом параметров.
        return a+b;
    }

}
