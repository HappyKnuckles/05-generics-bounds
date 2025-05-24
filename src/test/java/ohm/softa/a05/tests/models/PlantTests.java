package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlantTests {

    @Test
    void createGreenFlower(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Flower(10, "boo", "cool", PlantColor.GREEN);
        });
    }

    @Test
    void createOtherFlower(){
        Flower flower = new Flower(10, "boo", "cool", PlantColor.ORANGE);
        assert(flower.getColor() == PlantColor.ORANGE);
    }
}
