package com.test.pluto.testing;

import com.test.pluto.entity.Vertex;
import com.test.pluto.entity.request.MapDataRequest;
import com.test.pluto.entity.request.RequestData;
import com.test.pluto.entity.response.MapDataResponse;
import com.test.pluto.service.MapService;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;
import com.test.pluto.controller.MapController;
import com.test.pluto.entity.response.ResponseData;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestMockedMapController{

	//Create instance of the thing you want to test
	//when using the @InjectMocks you must create the instance in the constructor or in the field declaration.
	@InjectMocks
	private MapController mapController = new MapController();
	
	// The @Mock annotation creates the mock instance of the class and
    // automatically injects into the object annotated with @InjectMocks (if
    // possible).
	@Mock
	private MapService mockMapService;

	
	ResponseData responseData = new ResponseData();
	RequestData requestData = new RequestData();


	Vertex A1 = new Vertex("MainEntranceToSecondFloorDoor", -31.97773387, 115.8159912);
	Vertex B2 = new Vertex("RightStairs1", -31.97769092, 115.8163738);
	List<Vertex> path = new ArrayList<>();

	//Verify that pathFinding is called in MapController
	@Test
	public void testMapControllerPathFindingCalled() throws JSONException {

		System.out.println("\n Inside testMapControllerPathFindingCalled: \n");
		path.add(A1);
		path.add(B2);

		requestData.setRequestMessage("hi");
		MapDataRequest mapDataRequest = new MapDataRequest();
		mapDataRequest.setBuilding("computerScience");
		mapDataRequest.setFloor("second");
		mapDataRequest.setStartLongitude("-31.97444473");
		mapDataRequest.setStartLatitude("115.8599");
		mapDataRequest.setEndLongitude("-31.97222274");
		mapDataRequest.setEndLatitude("115.823");
		mapDataRequest.setAlgorithm("DJ");
		requestData.setMapDataRequest(mapDataRequest);

		System.out.println("	Calling mapController.pathFinding()...");
		mapController.pathFinding(requestData);

		System.out.println("	Verifying that mapService.pathFinding() was called...");
		verify(mockMapService).pathFinding("computerScience", "second", "-31.97444473", "115.8599", "-31.97222274", "115.823", "DJ");

		//pathFinding() is only called once when executing mapController
		System.out.println("	Verifying mapService.pathFinding() is called at most once... \n");
		verify(mockMapService, atMost(1)).pathFinding("computerScience", "second", "-31.97444473", "115.8599", "-31.97222274", "115.823", "DJ");
	}

	//Verify that it got back a responseMessage and that is the correct responseMessage
	@Test
	public void testResponseSuccess(){
		System.out.println("\n Inside testResponseSuccess: \n");

		path.add(A1);
		path.add(B2);

		requestData.setRequestMessage(" ");
		MapDataRequest mapDataRequest = new MapDataRequest();
		mapDataRequest.setBuilding("computerScience");
		mapDataRequest.setFloor("second");
		mapDataRequest.setStartLongitude("-31.97444473");
		mapDataRequest.setStartLatitude("115.8599");
		mapDataRequest.setEndLongitude("-31.97222274");
		mapDataRequest.setEndLatitude("115.823");
		mapDataRequest.setAlgorithm("DJ");
		requestData.setMapDataRequest(mapDataRequest);

		try {
			when(mockMapService.pathFinding("computerScience", "second", "-31.97444473", "115.8599", "-31.97222274", "115.823", "DJ")).thenReturn(path);
			responseData = mapController.pathFinding(requestData);
			verify(mockMapService).pathFinding("computerScience", "second", "-31.97444473", "115.8599", "-31.97222274", "115.823", "DJ");
		} catch (JSONException e) {
			e.printStackTrace();
		}

		String message = responseData.getResponseMessage();
		String code = responseData.getResponseCode();

		System.out.println("	Testing for SUCCESS message...");
		assertEquals("SUCCESS", message);

		System.out.println("	Testing for 0000 code...");
		assertEquals("0000", code);
	}

	//test using no paramters i.e empty parameters
	//Would it just return empty things
	@Test
	public void testEmptyRequest() {
		System.out.println("\n Inside testEmptyRequest: \n");
		requestData.setRequestMessage("");
		MapDataRequest mapDataRequest = new MapDataRequest();
		mapDataRequest.setBuilding("");
		mapDataRequest.setFloor("");
		mapDataRequest.setStartLongitude("");
		mapDataRequest.setStartLatitude("");
		mapDataRequest.setEndLongitude("");
		mapDataRequest.setEndLatitude("");
		mapDataRequest.setAlgorithm("");
		requestData.setMapDataRequest(mapDataRequest);


		try {
			responseData = mapController.pathFinding(requestData);

		} catch (JSONException e) {
			e.printStackTrace();
		}

		String message = responseData.getResponseMessage();
		String code = responseData.getResponseCode();
		MapDataResponse mapDataResponse = responseData.getMapDataResponse();

		System.out.println("	Testing for ERROR message...");
		assertEquals("ERROR", message);

		System.out.println("	Testing for 0001 code...");
		assertEquals("0001", code);

		System.out.println("	Testing for null mapDataResponse...");
		assertEquals(null, mapDataResponse);

	}

}