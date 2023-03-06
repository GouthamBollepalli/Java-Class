import java.util.ArrayList;
import java.util.function.Consumer;

public class Exampl1Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> cal = new ArrayList<Integer>();
        cal.add(5+2);
        cal.add(9-6);
        cal.add(2+10);
        cal.remove(0);
        cal.forEach((n) -> {System.out.println(cal);});


        Consumer<Integer> m = (n) -> {System.out.println(n);};
        cal.forEach(m);
    }

    }

