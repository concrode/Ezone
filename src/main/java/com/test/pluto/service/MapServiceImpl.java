package com.test.pluto.service;

import com.test.pluto.entity.IndoorMap;
import com.test.pluto.entity.Vertex;
import com.test.pluto.utils.MathUtils;
import com.test.pluto.utils.TestData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author captain
 */
@Service
public class MapServiceImpl implements MapService {

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
    @Override
    public List<Vertex> pathFinding(String building, String floor, String startLongitude,
                                    String startLatitude, String endLongitude, String endLatitude,
                                    String algorithm) {

        // Create the graph structure
        IndoorMap map = TestData.getMapDataStructure(building, floor, algorithm);

        // Get the nearest vertex based on longitude and latitude
        Vertex startVertex = getNearestVertexForLocation(map, startLongitude, startLatitude);
        Vertex endVertex = getNearestVertexForLocation(map, endLongitude, endLatitude);

        System.out.println("s= " + startVertex.toString());
        System.out.println("e= " + endVertex.toString());

        List<Vertex> result = map.findPath(startVertex, endVertex);

        for(int i = 0; i < result.size(); i ++) {
           System.out.println("!!!!!!!!!" + result.get(i).toString() + result.get(i).longitude + result.get(i).latitude);
       }

        return result;
    }

    /**
     * Get the nearest vertex based on longitude and latitude
     *
     * @param map
     * @param longitude
     * @param latitude
     * @return
     */
    @Override
    public Vertex getNearestVertexForLocation(IndoorMap map, String longitude,
                                              String latitude) {
        Double minDistance = Double.POSITIVE_INFINITY, currentDistance;
        Vertex nearestVertex = null;

        for (int i = 0; i < map.getVertex().size(); i++) {
            currentDistance = MathUtils.getDistanceBetweenTwoVertex(map.getVertex().get(i).longitude, map.getVertex().get(i).latitude,
                    Double.parseDouble(longitude), Double.parseDouble(latitude));

            if (currentDistance <= minDistance) {
                minDistance = currentDistance;
                nearestVertex = map.getVertex().get(i);
            }
        }

        return nearestVertex;
    }

//
//    public static void main(String args[]) {
//        MapServiceImpl m = new MapServiceImpl();
//        m.pathFinding("", "", "1.1", "1.4", "1.6", "1.9", "");
//    }
}
