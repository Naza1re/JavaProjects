public class Animals {
    int age;
    String name;

    Animals(int age,String name){
        this.age = age;
        this.name = name;
    }

    void run(){
        System.out.println("Животное бежит");

    }
    Animals(){

    }


    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }

    public static void main(String[] args) {

        String a = new String("my name is");

        StringBuilder s1 = new StringBuilder(a);



        System.out.println(s1.reverse());



    }

}
