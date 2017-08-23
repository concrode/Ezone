package com.test.pluto.entity;


import com.test.pluto.algorithm.Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Indoor map has an attribute algorithm. It will call algorithm to create the graph
 * and get the shortest path.
 *
 * @author captain
 */
public class IndoorMap {

    private String building;
    private String floor;
    private List<Vertex> vertex = new ArrayList<>();
    private Algorithm algorithm;

    public IndoorMap(Algorithm algorithm) {
        this.algorithm = algorithm;
    }


    public List<Vertex> findPath(Vertex startVertex, Vertex endVertext) {
        algorithm.createGraph(startVertex);

        return algorithm.getShortestPathTo(endVertext);

    }

    // setters and getters
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public List<Vertex> getVertex() {
        return vertex;
    }

    public void setVertex(List<Vertex> vertex) {
        this.vertex = vertex;
    }


}
