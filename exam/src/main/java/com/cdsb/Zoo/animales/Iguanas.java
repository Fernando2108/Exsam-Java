package com.cdsb.Zoo.animales;

import com.cdsb.Zoo.enums.Familia;
import com.cdsb.Zoo.enums.Animales;

public class Iguanas extends AnimalReptiles {


	public Iguanas(String nombre) {
		super(nombre, 10, 20, 35);
		familia = Familia.Reptiles;
        incompatibles.add(Animales.ELEFANTE);
        incompatibles.add(Animales.LEON);
        compatibles.add(Animales.SERPIENTES);
        incompatibles.add(Animales.FOCAS);
        compatibles.add(Animales.TUCANES);
        compatibles.add(Animales.DELFINES);
        incompatibles.add(Animales.SERPIENTES);
        compatibles.add(Animales.LOROS);
	}


}
