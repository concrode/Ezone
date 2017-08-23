package com.test.pluto.entity.request;

import javax.persistence.Entity;

/**
 * Receive the request from the front. Used in the mapController.
 *
 * ==============================================================
 * {
        "requestMessage": "",
        "mapDataRequest":{
                "building": "computer",
                "floor": "second",
                "startLongitude": "-31.977733",
                "startLatitude": "115.815599",
                "endLongitude": "-31.9774",
                "endLatitude": "115.8154333",
                "algorithm": "DJ"
        }

    }
 *==================================================================
 *
 * @author captain
 */
@Entity
public class RequestData {

    private String requestMessage;
    private MapDataRequest mapDataRequest;

    public RequestData(String requestMessage, MapDataRequest mapDataRequest) {
        this.requestMessage = requestMessage;
        this.mapDataRequest = mapDataRequest;
    }

    public RequestData() {
    }

    public String getRequestMessage() {
        return this.requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public MapDataRequest getMapDataRequest() {
        return this.mapDataRequest;
    }

    public void setMapDataRequest(MapDataRequest mapDataRequest) {
        this.mapDataRequest = mapDataRequest;
    }
}
