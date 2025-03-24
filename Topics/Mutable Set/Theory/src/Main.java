import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        m(list);
         */
        HashMap<Employee, String> hm = new HashMap<Employee, String>();
        hm.put(new Employee("a"), "emp1");
        hm.put(new Employee("b"), "emp2");
        hm.put(new Employee("a"), "emp1 OVERRIDEN");
        System.out.println(hm.size());
        System.out.println(hm.get(new Employee("a")));
    }
    /*
    public static void m(List<Number> list) {
        System.out.println(list);
    }
     */
}
