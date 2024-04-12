import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Integer> myList = new ArrayList<Integer>() {
           {
               add(1);
               add(2);
           }
       };
           myList.forEach(el -> System.out.println(el));}

        }

