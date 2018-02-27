
import java.util.*;




public class test {
   
    public static void main (String [] args) {
    	List<Character> list = new ArrayList<>();
 
    	list.add('a');
    	System.out.println(list.contains('a'));
    	list.remove(list.indexOf('a'));
    	System.out.println(list.contains('a'));
    }
}
