package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleFilter;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;

public class PlantBed<T extends Plant> {
    private SimpleList<T> plants;

    public PlantBed() {
        plants = new SimpleListImpl<>();
    }

    void add(T plant) {
        plants.add(plant);
    }

    int size(){
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color){
        return plants.filter(p -> p.getColor().equals(color));
    }

    public void remove(T plant) {
        plants = plants.filter(p -> !plant.equals(p));
    }
}
