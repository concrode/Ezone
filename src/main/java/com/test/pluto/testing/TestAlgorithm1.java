package com.test.pluto.testing;

import com.test.pluto.entity.Edge;
import com.test.pluto.entity.IndoorMap;
import com.test.pluto.service.MapServiceImpl;
import com.test.pluto.utils.MathUtils;
import com.test.pluto.utils.TestData;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.rules.ExpectedException;
import org.junit.runner.*;
import java.util.*;
import com.test.pluto.entity.Vertex;
import org.junit.runners.Parameterized;
import com.test.pluto.algorithm.DjAlgorithm;

public class TestAlgorithm1 {
	private Vertex startingVertex;
	private Vertex destinationVertex;
	private DjAlgorithm algorithm;

	private TestData testData;
	private MapServiceImpl mapServiceImpl;

//private static Vertex Y25 = new Vertex("HallwayDoor", -31.97764542, 115.81607703);
	private static Vertex B28;
	private static Vertex P42;
	private static Vertex K37 ;
	private static Vertex U21;
	private static Vertex N40;
	private static Vertex J36;
	private static Vertex A1;
	private static Vertex I35;
	private static Vertex G59;
	private static Vertex U47;
	private static Vertex I9;
	IndoorMap indoorMap = testData.getMapDataStructure("computerScience","second","DJ");
	@Before
	public void initialize() {
		algorithm = new DjAlgorithm();

		B28 = indoorMap.getVertex().get(27); //RightStairsDoor
		P42 = indoorMap.getVertex().get(41); //2.07Door2
		K37 = indoorMap.getVertex().get(36); //2.10Door
		U21 = indoorMap.getVertex().get(20); //RightCorridor5
		N40 = indoorMap.getVertex().get(39); //MaleToiletDoor
		J36 = indoorMap.getVertex().get(35); //2.12Door
		A1 = indoorMap.getVertex().get(0); //MainEntrancetoSecondFloorDoor
		I35 = indoorMap.getVertex().get(34); //2.14Door
		G59 = indoorMap.getVertex().get(58); //LeftLandingBetweenSecondAndFirst1
		U47 = indoorMap.getVertex().get(46); //2.05Door1
		I9 = indoorMap.getVertex().get(8); //2.22Door
		testData = new TestData();
		mapServiceImpl = new MapServiceImpl();
	}



	/**Test to see if the path starts at the correct location.
	 * For first 5 testLocations test cases, destination location is static and on second floor.
	*/
	@Test
	public void testStartLocations1() {
		startingVertex = P42; //Start: 2.07Door2
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testStartLocations1(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex,destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

		//List<Vertex> path = new ArrayList<>();
		//Call the algorithm
		//algorithm.createGraph(startingVertex);
		//path = algorithm.getShortestPathTo(destinationVertex);

	}

	@Test
	public void testStartLocations2() {
		startingVertex = U21; //Start: RightCorridor5
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testStartLocations2(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

	}

	@Test
	public void testStartLocations3() {
		startingVertex = K37; //Start: 2.10Door
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testStartLocations3(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

	}

	@Test
	public void testStartLocations4() {
		startingVertex = N40; //Start: MaleToiletDoor
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testStartLocations4(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

	}

	@Test
	public void testStartLocations5() {
		startingVertex = J36; //Start: 2.12Door
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testStartLocations5(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

	}


	/**Test to see if the path starts at the correct location.
	 * For these next 5 testLocations test cases, starting location is static and on second floor.
	 */
	@Test
	public void testStartLocations6() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testStartLocations6(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

	}

	@Test
	public void testStartLocations7() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = I35; //End: 2.14Door
		System.out.println("\n Inside testStartLocations7(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

	}

	@Test
	public void testStartLocations8() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = G59; //End: LeftLandingBetweenSecondAndFirst1
		System.out.println("\n Inside testStartLocations8(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

	}

	@Test
	public void testStartLocations9() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = U47; //End: 2.05Door1
		System.out.println("\n Inside testStartLocations9(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

	}

	@Test
	public void testStartLocations10() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = I9; //End: 2.22Door
		System.out.println("\n Inside testStartLocations10(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the starting location is correct in the path returned
		System.out.println("Checking Correct Starting Location...");
		assertEquals(startingVertex, path.get(0));

	}

	@Test
	public void testEndLocations1() {
		startingVertex = P42; //Start: 2.07Door2
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testEndLocations1(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex,destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));

		//List<Vertex> path = new ArrayList<>();
		//Call the algorithm
		//algorithm.createGraph(startingVertex);
		//path = algorithm.getShortestPathTo(destinationVertex);

	}

	@Test
	public void testEndLocations2() {
		startingVertex = U21; //Start: RightCorridor5
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testEndLocations2(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));
	}

	@Test
	public void testEndLocations3() {
		startingVertex = K37; //Start: 2.10Door
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testEndLocations3(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));
	}

	@Test
	public void testEndLocations4() {
		startingVertex = N40; //Start: MaleToiletDoor
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testEndLocations4(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));
	}

	@Test
	public void testEndLocations5() {
		startingVertex = J36; //Start: 2.12Door
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testEndLocations5(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);


		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));
	}


	/**Test to see if the path starts at the correct location.
	 * For these next 5 testLocations test cases, starting location is static and on second floor.
	 */
	@Test
	public void testEndLocations6() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = B28; //End: Right Stairs door
		System.out.println("\n Inside testEndLocations6(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));
	}

	@Test
	public void testEndLocations7() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = I35; //End: 2.14Door
		System.out.println("\n Inside testEndLocations7(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));
	}

	@Test
	public void testEndLocations8() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = G59; //End: LeftLandingBetweenSecondAndFirst1
		System.out.println("\n Inside testEndLocations8(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));
	}

	@Test
	public void testEndLocations9() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = U47; //End: 2.05Door1
		System.out.println("\n Inside testEndLocations9(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));
	}

	@Test
	public void testEndLocations10() {
		startingVertex = A1; //Start: MainEntranceToSecondFloorDoor
		destinationVertex = I9; //End: 2.22Door
		System.out.println("\n Inside testEndLocations10(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		//Check to see if the destination is correct in the path returned
		System.out.println("Checking Correct Destination Location...");
		assertEquals(destinationVertex, path.get(path.size() - 1));
	}


	//WILL NEED TO ADD TEST CASES FOR DIFFERENT FLOORS and maybe null values



	//Test to see if algorithm gives the same path 
	@Test
	public void testPathFinding() {
		startingVertex = P42; //Start: 2.07Door2
		destinationVertex = B28; //End: Right Stairs door

		System.out.println("\n Inside testPathFinding(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		String[] pathList = new String[] {"2.07Door2", "RightCorridor9","RightCorridor11", "RightStairsDoor"};
		//Check to see if the path is the same
		System.out.println("Checking Correct shortest Path...");
		assertEquals(Arrays.toString(pathList),path.toString());

	}

	/**
	 * Tests to see if the number of vertices is correct.
	 * Might not need this- depends on hwo it is it stored on the backend.
	 */
	@Test
	public void testNumVertices(){
		System.out.println("\n Inside testNumVerticies(): \n" );
		int numVerticies = indoorMap.getVertex().size();

		System.out.println("Checking number of verticies...");
		assertEquals(66,numVerticies);
	}

	//Tests to see if it gets the nearest node
	@Test
	public void testFindsNearestNode(){
		System.out.println("\n Inside testFindsNearestNode(): \n");


		Vertex nearestNode = mapServiceImpl.getNearestVertexForLocation(indoorMap, "-28", "46");

		assertEquals(A1,nearestNode);

	}

	@Test
	public void testShortestDistance(){
		startingVertex = P42; //Start: 2.07Door2
		destinationVertex = B28; //End: Right Stairs door

		System.out.println("\n Inside testShortestDistance(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

		List<Vertex> path = indoorMap.findPath(startingVertex, destinationVertex);//This method creates the graph from the startVertex and then calls getShortestPath in the algorithm class

		System.out.println(path);

		double distance = 0;

		for(int i = 0; i < path.size()-1; i++) {

				for (Edge e : path.get(i).adjacency) {
					Vertex target = e.target;
					double weight = e.weight;
					if(path.get(path.size()-1).toString() != target.name) {
						if ((i + 1) < path.size() - 1 && target == path.get(i + 1)) {
							distance += weight;
						}
					}
					else {
						distance += weight;
						break;

				}
			}
		}


		//Sqrt((lat1-lat2)^2 + (Long1-Long2)^2)
		double actualDistance = 0.9 + 3.3 + 0.8;

		System.out.println("Checking shortestDistance found...");
		assertEquals(actualDistance, distance,0.5);
	}


	//Note to self: check lat and long or long and lat in test cases
}
	
