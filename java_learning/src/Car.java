public class Car {
    String name;

    String GetName(){
        return name;
    }

    Car(String name){
        this.name = name;


    }

    public int hashCode(){
        return name.hashCode();
    }




    public void  drive(){
        System.out.println("car drive");
    }

}
