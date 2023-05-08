public class POLIMORFIZM {
    public void healCat(Animals cat){
        System.out.println("Животное здорвово");
        cat.run();

    }



    public static void main(String[] args) {
        POLIMORFIZM polimorfizm = new POLIMORFIZM();
        CAT felix1 = new CAT(1,"fel");

        System.out.println( felix1 instanceof CAT);




        Animals felix = new CAT(3,"felix");
        Animals bethoven  = new DOG(5,"bethoven");
        Animals miki = new MOUSE(10,"miki");





        polimorfizm.healCat(felix);
        polimorfizm.healCat(bethoven);
        polimorfizm.healCat(miki);














    }




}
