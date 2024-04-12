import java.util.ArrayList;
import java.util.List;

public class Secondary {
    public List<Integer> myList = new ArrayList<Integer>() {

        {
            add(10);
        }

        public String getName() {
            return "Name";
        }
    };
}
