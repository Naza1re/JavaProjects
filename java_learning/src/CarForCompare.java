public class CarForCompare extends Car implements Comparable<CarForCompare> {
    int year;
    CarForCompare(String name,int year) {
        super(name);
        this.year = year;
    }

    @Override
    public int compareTo(CarForCompare car) {
        return this.name.compareTo(car.GetName());
    }
}
