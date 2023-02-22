public class MyOldCar extends Car{

    public static void main(String[] args) {
        Car MyOLdCar;
        MyOLdCar = new Car();

        MyOLdCar.Doors = 2;
        MyOLdCar.Seats = 2;
        MyOLdCar.Torque = 297;
        MyOLdCar.Speed = 230;
        MyOLdCar.Wheels = 4;


        System.out.println("The Detalis of my Old Car" + MyOLdCar.Seats);
        System.out.println("The Detalis of my Old Car" + MyOLdCar.Doors);
        System.out.println("The Detalis of my Old Car" + MyOLdCar.Wheels);
        System.out.println("The Detalis of my Old Car" + MyOLdCar.Speed);
        System.out.println("The Detalis of my Old Car" + MyOLdCar.Torque);
    }
}
