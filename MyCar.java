public class MyCar extends Car{

    public static void main (String[] args){
        Car MyCar;

        MyCar = new Car();

        MyCar.Seats = 4;
        MyCar.Doors = 4;
        MyCar.Wheels = 4;
        MyCar.Speed = 297.5;
        MyCar.Torque = 331;



        System.out.println("The Detalis of my Brand New Car" + MyCar.Seats);
        System.out.println("The Detalis of my Brand New Car" + MyCar.Doors);
        System.out.println("The Detalis of my Brand New Car" + MyCar.Wheels);
        System.out.println("The Detalis of my Brand New Car" + MyCar.Speed);
        System.out.println("The Detalis of my Brand New Car" + MyCar.Torque);

    }

    //Tried to create a subclass inside a class.


}
