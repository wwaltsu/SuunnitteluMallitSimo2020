package com.kmr;

public class ValkokankaanTestaus {
    public static void main(String[] args){
        Valkokangas lamp = new Valkokangas();
        Command switchUp = new ValkokangasYlösKomento(lamp);
        Command switchDown = new ValkokangasAlasKomento(lamp);
        ValkokankaanPainike up = new ValkokankaanPainike(switchUp);
        ValkokankaanPainike down = new ValkokankaanPainike(switchDown);
        up.paina();
        down.paina();
    }
}
