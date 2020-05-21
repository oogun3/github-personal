package com.olamide.Apolis;

import java.util.HashSet;
import java.util.Set;

public final class heavenlyBody {
    private final  String name;
    private final double orbitalPeriod;
    private final Set<heavenlyBody> satelites;

    public heavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satelites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public  boolean addMoon(heavenlyBody moon){
        return this.satelites.add(moon);
    }

    public Set<heavenlyBody> getSatelites() {
        return new HashSet<>(this.satelites);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return  true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())){
            return  false;
        }
        String objName = ((heavenlyBody) obj).getName();
        return  this.name.equals(objName);

    }














}
