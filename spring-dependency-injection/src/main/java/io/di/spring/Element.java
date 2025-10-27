package io.di.spring;

public class Element {
    private String name;
    private int valency;
    private int energyLevels;

    Atom atom;

    public Element() {
    }

    public Element(String name, int valency, int energyLevels, Atom atom) {
        this.name = name;
        this.valency = valency;
        this.energyLevels = energyLevels;
        this.atom = atom;
    }

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

    public Atom getAtom() {
        return atom;
    }

    public void setAtom(Atom atom) {
        this.atom = atom;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", valency=" + valency +
                ", energyLevels=" + energyLevels +
                ", atom=" + atom +
                '}';
    }
}
