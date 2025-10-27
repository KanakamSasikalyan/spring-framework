package io.di.spring;

public class Element {
    private String name;
    private int valency;
    private int energyLevels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValency() {
        return valency;
    }

    public void setValency(int valency) {
        this.valency = valency;
    }

    public int getEnergyLevels() {
        return energyLevels;
    }

    public void setEnergyLevels(int energyLevels) {
        this.energyLevels = energyLevels;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", valency=" + valency +
                ", energyLevels=" + energyLevels +
                '}';
    }
}
