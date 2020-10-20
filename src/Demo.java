import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        ArrayList<Integer> array =new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        array.clone();
        System.out.println(array.lastIndexOf(1));
    }
}
