//Do-while Example
public class doWhileLoopEX1 {

    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println("The Value of i is "  + i);
            i++;

        }
        while(i<= 10);

        // While example

        while (i<=20) {
            System.out.println(i);
            i++;
        }

// break example
        for(i = 0; i<=10; i++) {
            if (i == 6) break;
            System.out.println(i);
        }

        //continue example

        for(i=0; i<=15; i++) {
            if(i == 9) continue;
            System.out.println(i);
        }
    }


    }

