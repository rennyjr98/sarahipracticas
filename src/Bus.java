public class Bus extends Vehicle{
    private String route="loksea";
    public Bus(String model, float size, String color, String mark, int nwheels){
        super(model, size, color, mark, nwheels);
    }
    public void turnOnEngine(){
        System.out.println("Encendiendo motor");
    }
}
