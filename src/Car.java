public class Car extends Vehicle{
    public Car(String model, float size, String color, String mark, int nwheels){
        super(model, size, color, mark, nwheels);
    }
    @Override
    public void turnOnEngine() {
        System.out.println("Encendiendo motor de "+ mark);
    }
}
