import java.util.*;
import java.util.stream.*;

public class HelloWorld{

     public static void main(String []args){
         List<String> l = Arrays.asList("C++", "Go", "Java", "Python", "Ruby");
         Stream<String> s = l.stream();
         s = s.map(item -> {
            System.out.printf("toUpperCase(%s)%n", item);
            return item.toUpperCase();
         });
         s = s.filter(item -> {
             System.out.printf("length(%s)%n", item.length());
             return item.length() == 4;
         });
         Optional<String> o = s.findFirst();
         System.out.println(o.get());
     }
}
