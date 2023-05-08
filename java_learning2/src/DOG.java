public class DOG extends Animals implements RUNEBLE{
    DOG(int age, String name) {
        super(age, name);
    }
    public void run(){
        System.out.println("Собака бежит");

    }
}
