package com.test.pluto.service;

import com.test.pluto.entity.IndoorMap;
import com.test.pluto.entity.Vertex;

import java.util.List;

/**
 * For pathFinding and get shortest path between two vertex
 *
 * @author captain
 */
public interface MapService {

    /**
     * Path finding
     *
     * @param building
     * @param floor
     * @param startLongitude
     * @param startLatitude
     * @param endLongitude
     * @param endLatitude
     * @param algorithm
     * @return
     */
    List<Vertex> pathFinding(String building, String floor, String startLongitude, String startLatitude,
                             String endLongitude, String endLatitude, String algorithm);

    /**
     * Find the nearest vertex based on the longitude and latitude
     *
     * @param map
     * @param longitude
     * @param latitude
     * @return
     */
    Vertex getNearestVertexForLocation(IndoorMap map, String longitude, String latitude);
}
