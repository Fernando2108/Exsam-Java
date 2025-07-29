package com.cdsb.Zoo.animales;

import com.cdsb.Zoo.zoo;.enums.Especie;

    public class Zebra extends AnimalMamífero {

	public Zebra(String nombre) {
		super(nombre, 30, 18);
		especie = Especie.Mamífero;
        incompatibles.add(Animal.ELEFANTE);
        incompatibles.add(Animal.LEON);
        incompatibles.add(Animal.IGUANAS);
        incompatibles.add(Animal.FOCAS);
        compatibles.add(Animal.TUCANES);
        compatibles.add(Animal.DELFINES);
        incompatibles.add(Animal.SERPIENTES);
        compatibles.add(Animal.LOROS);
	}


}
