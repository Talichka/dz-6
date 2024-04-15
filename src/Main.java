//import java.util.ArrayList;
//import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<Integer> myList = new ArrayList<Integer>() {

            {
                add(1);
                add(3);
            }
        };

      Secondary secondary = new Secondary();

        for (Integer element : secondary.myList) {
            System.out.println(element);
        }*/
    switch (new Secondary().getName()){
        case "Name":
            System.out.println("0");
        case "1":
            System.out.println("1");
        case "2":
            System.out.println("2");
            break;
            default:
            System.out.println("default");
    }
    }
}

