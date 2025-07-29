package com.cdsb.Zoo.animales;

    import com.cdsb.Zoo.enums.Familia;
    import com.cdsb.Zoo.enums.Animales;

    public class Elefante extends AnimalesMamífero {

	public Elefante(String nombre) {
		super(nombre, 12, 22);
		Familia = Familia.Mamífero;
		incompatibles.add(Animales.LEON);
        incompatibles.add(Animales.SERPIENTES);
        incompatibles.add(Animales.IGUANAS);
        incompatibles.add(Animales.FOCAS);
        incompatibles.add(Animales.TUCANES);
        compatibles.add(Animales.DELFINES);
        compatibles.add(Animales.ZEBRAS);
        compatibles.add(Animales.LOROS);
	}

}
