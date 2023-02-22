

public class example1 {

    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1: {
                for(int i = 0; i <= a; i++) ;
                System.out.println("The above statment is from case1");
            }
            case 2: {
                for (int i = 0; i <= a; i++) ;
                System.out.println("The above statement is from case2");
                break;
            }
            default: System.out.println("Non of the above cases has been passed");
        }

        //This is a new type of switch statement from java version14, but it is not executing.
        //int day = 8;
        //int numdays = switch(day) {
          //  case Monday,Tuesday -> 6;
            //case Wednesday,Thursday -> 8;
            //case Friday, Saturday -> 10;
        //};

    }
}