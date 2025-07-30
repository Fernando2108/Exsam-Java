package com.cdsb.Zoo;

import com.cdsb.Zoo.enums.Familia;
import com.cdsb.Zoo.enums.Animales;

public interface IAnimales {

    String getNombre();

    Familia getFamilia();
	Animales getAnimales();

    boolean esCompatible(IAnimales animales);
    void plantar(ILugarHabitat LugarHabitat);

}
