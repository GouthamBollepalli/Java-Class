import java.util.LinkedList;
public class linkedList {
        public static void main(String[] args){
            LinkedList<String> animals = new java.util.LinkedList<>();

            animals.add("Dog");
            animals.add("Cat");
            animals.add("Cow");
            System.out.println("LinkedList: " + animals);

            animals.add(1, "Horse");
            System.out.println("Updated LinkedList: " + animals);

            animals.addFirst( "Fox");
            System.out.println("Updated LinkedList: " + animals);
            animals.removeLast();
            System.out.println("Updated LinkedList: " + animals);
            animals.addLast("snake");
            System.out.println("Updated LinkedList: " + animals);

        }


    }

