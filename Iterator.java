import java.util.ArrayList;

public class Iterator {
   public static void main(String[] args){
       ArrayList<String> Shapes = new ArrayList<String>();
       {Shapes.add("Crircle");
       Shapes.add("Rectangle");
       Shapes.add("Trianlge");
       Shapes.add("Pentagon");
       Shapes.add("Squar");}

       java.util.Iterator<String> Size = Shapes.iterator();
       System.out.println(Size.next());
       while (Size.hasNext()) {
           System.out.println(Size.next());
       }
       int size = Shapes.size();
       System.out.println(size);





   }
}
