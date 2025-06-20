package ohm.softa.a05.model;

public class Flower extends Plant{
    private final PlantColor color;
    public Flower(double height, String family, String name, PlantColor color) {
        super(height, family, name);
        if(color == PlantColor.GREEN){
            throw new IllegalArgumentException("Flower can't have a green color");
        }
        this.color = color;
    }

    @Override
    public PlantColor getColor() {
        return color;
    }
}
