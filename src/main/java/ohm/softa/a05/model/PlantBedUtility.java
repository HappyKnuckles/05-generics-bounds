package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;

public class PlantBedUtility {
    private PlantBedUtility(){}
    public static <T extends Plant> void repot(PlantBed<T> input, PlantColor color,
                                               PlantBed<? super T> output) {

        SimpleList<? extends T> extract = input.getPlantsByColor(color);

        for (T p : extract) {
            input.remove(p);
            output.add(p);
        }
    }
}
