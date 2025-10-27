package io.di.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name = "atomBean")
    public Atom atomBean(){
        Atom atom = new Atom();
        atom.setAtomicNumber(1);
        atom.setAtomicMass(1.008);
        atom.setAtomicRadius(53);
        atom.setDensity(0.08988);
        return atom;
    }

    @Bean(name = "elementBean")
    public Element elementBean(){
        Element element = new Element();

        element.setName("Hydrogen");
        element.setValency(1);
        element.setEnergyLevels(1);
        element.setAtom(atomBean());
        return element;
    }
}
