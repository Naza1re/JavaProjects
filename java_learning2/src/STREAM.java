import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class STREAM {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();


        Collections.addAll(list,"Hello","my","Name","is","mY NAME");


        List<String> result  = list.stream().filter(s->Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
        for(int i = 0;i<result.size();i++)
        {
            System.out.println(result.get(i));
        }
        
    }
}
