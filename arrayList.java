import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

    public static void main(String[]args) {
        ArrayList<String> Shapes = new ArrayList<String>();
        Shapes.add("Crircle");
        Shapes.add("Rectangle");
        Shapes.add("Trianlge");
        Shapes.add("Pentagon");
        Shapes.add("Squar");

        System.out.println(Shapes);

        Shapes.get(2);
        System.out.println(Shapes);
        Shapes.set(3, "Hexagon");
        System.out.println(Shapes);
        Shapes.remove(4);
        System.out.println(Shapes);
        Shapes.clear();
        System.out.println(Shapes);

        //Iteration

        Iterator<String> it = Shapes.iterator();
        System.out.println(it.next());
    }
}
