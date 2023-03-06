interface Example2L {
    String run(String str);
}

public class main{
    public static void main(String[] args) {

        Example2L Dollor = (D) -> D + "$";
        Example2L Star = (S) -> S +"*";
        nameThem("The Currency of America is ", Dollor);
        nameThem("To multiply This symbol is used ", Star);
    }

    public static void nameThem(String str, Example2L fomat){
        String res = fomat.run(str);
        System.out.println(res);
    }


}
