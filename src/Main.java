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

        Secondary secondary = new Secondary();

        for (Integer element : secondary.myList) {
            System.out.println(element);
        }
    }
}

