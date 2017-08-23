package com.test.pluto.algorithm;

import com.test.pluto.entity.Edge;
import com.test.pluto.entity.Vertex;

import java.util.*;


/**
 *
 * DjAlgorithm implements the interface algorithm
 *
 * @author captain
 */
public class DjAlgorithm implements Algorithm {

    /**
     * Create graph topology
     *
     * @param startVertex
     */
    @Override
    public void createGraph(Vertex startVertex) {

        if(null != startVertex) {
            DjAlgorithm(startVertex);
        }
    }

    /**
     * Get shortest path to targetVertex
     *
     * @param target
     * @return
     */
    @Override
    public List<Vertex> getShortestPathTo(Vertex target) {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous) {
            System.out.println("!!!!!!!! vertex.previous=" + vertex.previous);
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }

    /**
     * Create graph topology using Dj algorithm
     *
     * @param startVertex
     */
    public void DjAlgorithm(Vertex startVertex) {

        startVertex.minDistance = 0.;

        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(startVertex);

        while (!vertexQueue.isEmpty()) {

            //Get the first element in the vertexQueue
            Vertex currentVertex = vertexQueue.poll();

            // Visit each edge of currentVertex
            for (Edge e : currentVertex.adjacency) {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = currentVertex.minDistance + weight;

                if (distanceThroughU < v.minDistance) {
                    vertexQueue.remove(v);
                    v.minDistance = distanceThroughU ;
                    v.previous = currentVertex;
                    vertexQueue.add(v);
                }
            }
        }
    }

}