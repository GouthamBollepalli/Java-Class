//Try-Catch Example

public class tryCatch {
    public static void main(String[] args) {
        int [] myNumbers = {1,2,3,4,5};

        try {
            System.out.println(myNumbers[100]);
        }
        catch (Exception e) {
            assert System.out != null;
            System.out.println("There is something wrong the input");
        }
        finally {
            assert System.out != null;
            System.out.println("The try-catch input is wrong");
        }
    }
}
