
class Jeep extends Vehicle {
        private final String modelName = "Mustang";
        public static void main(String[] args) {
            Jeep SUV = new Jeep();
            SUV.honk();
            System.out.println(SUV.brand + " " + SUV.modelName);
        }
}

