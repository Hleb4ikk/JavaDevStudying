package AgregationAndComposition;

public class Car {
    Engine engine;
    Wheel[] wheels;
    Freshener freshener;
    Car(Freshener freshener){
        //Агрегация
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
