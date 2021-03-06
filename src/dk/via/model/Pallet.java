package dk.via.model;

import java.util.ArrayList;

/**
 * Created by Libcoo on 11.05.2018.
 */
public class Pallet {
    private int Id;
    private ArrayList<Part> parts;
    private final float DEFAULTCAPACITY = 1000;
    private float capacity;

    public Pallet(int id) {
        Id = id;
        this.parts = new ArrayList<>();
        this.capacity = DEFAULTCAPACITY;
    }

    public Pallet(int id, float capacity) {
        Id = id;
        this.parts = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Part> parts) {
        this.parts = parts;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public boolean contains(String typeOfPart){
        if (!parts.isEmpty() && parts.get(0).getName().equals(typeOfPart)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pallet{" +
                "Id=" + Id +
                ", parts=" + parts +
                ", capacity=" + capacity +
                '}';
    }
}
