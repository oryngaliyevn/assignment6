package kz.aitu.oop.assignment6.furniture.sofas;

import kz.aitu.oop.assignment6.furniture.sofas.interfaces.Sofa;

public class ArtDecoSofa implements Sofa {

    @Override
    public void createSofa() {
        System.out.println("Sold ArtDeco style Sofa.");
    }
}
