package io.di.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Element {
    private String name;
    private int valency;
    private int energyLevels;

   // @Autowired  //Field Injection
    Atom atom;

    public Element() {
        System.out.println("Element -- Default Constructor Invoked...");
    }

    @Autowired  //Constructor Injection
    public Element(String name, int valency, int energyLevels, Atom atom) {
        this.name = name;
        this.valency = valency;
        this.energyLevels = energyLevels;
        this.atom = atom;
        System.out.println("Element -- Parameterized Constructor Invoked...");
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

    //@Autowired  //Setter Injection
    public void setAtom(Atom atom) {
        this.atom = atom;
        System.out.println("Atom Setter -- Invoked...");
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
