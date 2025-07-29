package com.cdsb.Zoo.animales;

import com.cdsb.Zoo.enums.Familia;
import com.cdsb.Zoo.enums.Animales;

public class Leon extends AnimalesMamífero {

	public Leon(String nombre) {
		super(nombre, 10, 8);
		Familia = Familia.Mamifero;
		incompatibles.add(Animales.ELEFANTE);
        incompatibles.add(Animales.SERPIENTES);
        incompatibles.add(Animales.IGUANAS);
        incompatibles.add(Animales.FOCAS);
        incompatibles.add(Animales.TUCANES);
        incompatibles.add(Animales.DELFINES);
        incompatibles.add(Animales.ZEBRAS);
        incompatibles.add(Animales.LOROS);
	}
}
