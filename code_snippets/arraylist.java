import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring Boot");
        list.add("React");

        for(String tech : list) {
            System.out.println(tech);
        }
    }
}