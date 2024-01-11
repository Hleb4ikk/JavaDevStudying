package AgregationAndComposition;

public class Car {
    Engine engine;
    Wheel[] wheels;
    Freshener freshener;
    Car(Freshener freshener){
        //Агрегация - объект класса freshener создается и задается вне конструктора класса car в то время как при композиции
        //все объекты остальных классов создаются в конструкторе класса Car. Если удалить объект класса Car, то двигатель
        //и колеса удалятся тоже, а объект класса freshener останется.
        this.freshener = freshener;
        //Композиция
        this.engine = new Engine();
        this.wheels = new Wheel[4];
        this.wheels[0] = new Wheel();
        this.wheels[1] = new Wheel();
        this.wheels[2] = new Wheel();
        this.wheels[3] = new Wheel();
    }
    //делегирование
    void drive(){
        this.engine.drive();
        for (int i = 0; i< this.wheels.length;i++){
            this.wheels[i].drive();
        }
        this.freshener.drive();
    }
}
