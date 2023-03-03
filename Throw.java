// Throw Example

public class Throw {
        static void AgeChecker(int age) {
            if (age < 18) {
                throw new ArithmeticException("Your are not eligilbe to get In!!");
            } else {
                System.out.println("You are good to go!!");
            }
        }
    public static void main(String[] args){
            AgeChecker(18);
    }
    }

