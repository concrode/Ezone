package com.test.pluto.controller;


import com.test.pluto.entity.Vertex;
import com.test.pluto.entity.request.MapDataRequest;
import com.test.pluto.entity.request.RequestData;
import com.test.pluto.entity.response.MapDataResponse;
import com.test.pluto.entity.response.ResponseData;
import com.test.pluto.service.MapService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Description: MapController deal with path finding between two locations.
 *
 * @author captain
 */
@Controller
public class MapController {

    @Autowired
    private MapService mapService;

    @Autowired(required = true)
    public void setUserService(MapService mapService) {
        this.mapService = mapService;
    }

    @RequestMapping("/path")
    @ResponseBody
    public ResponseData pathFinding(@RequestBody RequestData requestData) throws JSONException {

        // Response data
        ResponseData responseData = new ResponseData();
        MapDataResponse mapDataResponse = new MapDataResponse();

        // Get the request data from front
        MapDataRequest mapDataRequest = new MapDataRequest();
        if(null != requestData && null != requestData.getMapDataRequest()) {
            mapDataRequest = requestData.getMapDataRequest();
        }

        //requestData.getAlgorithm() can be empty. default algorithm = "DJ".
        if (!mapDataRequest.getBuilding().isEmpty() && !mapDataRequest.getFloor().isEmpty() &&
                !mapDataRequest.getStartLongitude().isEmpty() && !mapDataRequest.getStartLatitude().isEmpty()
                && !mapDataRequest.getEndLongitude().isEmpty()
                && !mapDataRequest.getEndLatitude().isEmpty()) {

            // Get the result
            List<Vertex> result = mapService.pathFinding(mapDataRequest.getBuilding(), mapDataRequest.getFloor(),
                    mapDataRequest.getStartLongitude(), mapDataRequest.getStartLatitude(),
                    mapDataRequest.getEndLongitude(), mapDataRequest.getEndLatitude(),
                    mapDataRequest.getAlgorithm());

            // Result is not empty
            if (!result.isEmpty() && null != result) {

                mapDataResponse.setBuilding(mapDataRequest.getBuilding());
                mapDataResponse.setFloor(mapDataRequest.getFloor());
                mapDataResponse.setStartLongitude(mapDataRequest.getStartLongitude());
                mapDataResponse.setStartLatitude(mapDataRequest.getStartLatitude());
                mapDataResponse.setEndLongitude(mapDataRequest.getEndLongitude());
                mapDataResponse.setEndLatitude(mapDataRequest.getEndLatitude());

                // Set the path with name/longitude/latitude
                List<HashMap<String, String>> path = new ArrayList<>();
                for (int i = 0; i < result.size(); i++) {
                    HashMap<String, String> pathElement = new HashMap<>();
                    pathElement.put("name", result.get(i).name);
                    pathElement.put("longitude", result.get(i).longitude + "");
                    pathElement.put("latitude", result.get(i).latitude + "");
                    path.add(i, pathElement);
                }

                mapDataResponse.setPath(path);

                // Set the response data
                responseData.setMapDataResponse(mapDataResponse);
                responseData.setResponseMessage("SUCCESS");
                responseData.setResponseCode("0000");


            } else {
                // Result is empty.
                responseData.setResponseMessage("ERROR");
                responseData.setResponseCode("0002");
            }

        } else {
            // Wrong with request data
            responseData.setResponseMessage("ERROR");
            responseData.setResponseCode("0001");
        }

        return responseData;
    }

}
