package com.test.pluto.entity;

/**
 * Contains the information Edge
 *
 * @author captain
 */

public class Edge {

    // Linked vertex
    public final Vertex target;

    // Weight to linked vertex
    public final double weight;

    public Edge(Vertex target, double weight) {
        this.target = target;
        this.weight = weight;
    }

}
