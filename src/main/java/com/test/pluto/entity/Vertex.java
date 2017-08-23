package com.test.pluto.entity;

/**
 * The vertex in the graph
 *
 * @author captain
 */
public class Vertex implements Comparable<Vertex> {

    public double longitude;

    public double latitude;

    public final String name;

    public Edge[] adjacency;

    public double minDistance = Double.POSITIVE_INFINITY;

    public Vertex previous;

//    public Vertex(String name, double longitude, double latitude){
//        this.name = name;
//        this.longitude = longitude;
//        this.latitude = latitude;
//    }

    public Vertex(String name, double latitude, double longitude){
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }


    public String toString(){
        return name;
    }

    public int compareTo(Vertex other){
        return Double.compare(minDistance, other.minDistance);
    }
}
