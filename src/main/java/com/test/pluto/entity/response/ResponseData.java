package com.test.pluto.entity.response;

/**
 * Give the response to the front. Used in the mapController.
 *
 * ===========================================================
 * {
    "responseMessage": "SUCCESS",
    "responseCode": "0000",
    "mapDataResponse": {
            "building": "computer",
            "floor": "second",
            "startLongitude": "-31.977733",
            "startLatitude": "115.815599",
            "endLongitude": "-31.9774",
            "endLatitude": "115.8154333",
            "algorithm": null,
            "path": [
                {
                    "latitude": "115.8159389",
                    "name": "LeftLandingBetweenSecondAndFirst2",
                    "longitude": "-31.97769945"
                },
                {
                    "latitude": "115.81595801",
                    "name": "LeftLandingBetweenSecondAndFirst1",
                    "longitude": "-31.97769974"
                },
                ]// end path
            }
    }
 * ==================================================================
 *
 *
 * @author captain
 */
public class ResponseData {

    private String responseMessage;
    private String responseCode;
    private MapDataResponse mapDataResponse;

    public ResponseData() {
    }

    public ResponseData(String responseMessage, String responseCode, MapDataResponse mapDataResponse) {
        this.responseMessage = responseMessage;
        this.responseCode = responseCode;
        this.mapDataResponse = mapDataResponse;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public MapDataResponse getMapDataResponse() {
        return mapDataResponse;
    }

    public void setMapDataResponse(MapDataResponse mapDataResponse) {
        this.mapDataResponse = mapDataResponse;
    }

}
