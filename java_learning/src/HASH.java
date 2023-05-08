import java.util.HashMap;
import java.util.Map;

public class HASH {

    public static void main(String[]args){
        Map<Integer,String> pasport = new HashMap<>();
        Pashpart a = new Pashpart(1,"Никита Поздеев");


        pasport.put(1,"Никита Поздеев");
        pasport.put(2,"Костя Барчук");

        System.out.println(pasport.values());
        for(int i = 1;i<pasport.size()+1;i++){
            System.out.println(pasport.get(i));
        }
        int[] array = new int[]{1,2,2,3,2,2,2,2,3,3};


    }


}
