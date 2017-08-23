package com.test.pluto.algorithm;


import com.test.pluto.entity.Vertex;

import java.util.List;

/**
 * For different algorithm to implement different algorithm
 *
 * @author captain
 */
public interface Algorithm {

    /**
     * Create the graph topology based on the startVertex, and create the shortest
     *        path from this startVertex to other vertex in this graph topology
     *
     * @param startVertex
     */
    void createGraph(Vertex startVertex);


    /**
     * Return a list contains the vertex from startVertex to endVertex
     *
     * @param endVertex
     * @return
     */
    List<Vertex> getShortestPathTo(Vertex endVertex);
}
