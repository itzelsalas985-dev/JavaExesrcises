package Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Colecciones {
    ArrayList<String> cars;
    String[] bikes;
    Set<String> bicicles;
    public HashMap<Integer, String> transport;

    public Colecciones() {
        this.cars = new ArrayList<>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<>();
        this.transport = new HashMap<>();
    }

    public void inicializar() {
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");

        bikes[1] = "Yamaha V-Star 250";
        bikes[2] = "Royal Enfield Meteor 350";
        bikes[3] = "Kawasaki Eliminator";
        bikes[4] = "Honda CMX500A2 SE Rebel.";

        bicicles.add("TREK MADONE 7 DIAMOND");
        bicicles.add("TREK MADONE 7 DIAMOND");
        bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    public HashMap<Integer, String> obtenerHash() {
        LinkedHashSet<String> elementos = new LinkedHashSet<>();

        elementos.addAll(cars);

        for (String bike : bikes) {
            elementos.add(bike);
        }

        elementos.addAll(bicicles);

        transport.clear();
        int clave = 1;

        for (String elemento : elementos) {
            if (elemento != null && !elemento.trim().isEmpty()) {
                transport.put(clave, elemento);
                clave++;
            }
        }

        return transport;
    }
}