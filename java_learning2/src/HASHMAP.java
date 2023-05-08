import java.util.HashMap;



public class HASHMAP {
    public static void main(String[]args){
        HashMap<Integer,Animals> animals =new HashMap<>();








        peintCollection(animals);
    }

    static void peintCollection(HashMap hashMap){
        for (int i = 0;i<hashMap.size()+1;i++){
            System.out.println(hashMap.get(i));
        }
    }

    enum PEOPLE{

        Марат_Малхозов,
        Женя_Журавский,
        Михаил_Сахончик;

    }


}
