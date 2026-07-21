class Test{
    public String ID;
}

public class Vehicle extends Test{
    protected String model;
    protected float size;
    protected String color;
    protected String mark;
    protected int nwheels;

    public Vehicle(String model, float size, String color, String mark, int nwheels){
        this.model=model;
        this.size=size;
        this.color=color;
        this.mark=mark;
        this.nwheels=nwheels;
        this.turnOnEngine();
    }

    public void turnOnEngine(){
        System.out.println("Encendiendo motor");
    }
}
