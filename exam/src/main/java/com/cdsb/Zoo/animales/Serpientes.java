package com.cdsb.Zoo.animales;

import com.cdsb.Zoo.enums.Familia;

public class Serpientes extends AnimalReptiles {

	public SERPIENTES(String nombre) {
		super(nombre, 10, 8);
		Familia = Familia.REPTILES;
		incompatibles.add(Animal.ELEFANTE);
        incompatibles.add(Animal.LEON);
        incompatibles.add(Animal.IGUANAS);
        incompatibles.add(Animal.FOCAS);
        incompatibles.add(Animal.TUCANES);
        incompatibles.add(Animal.DELFINES);
        incompatibles.add(Animal.ZEBRAS);
        incompatibles.add(Animal.LOROS);
	}
}
