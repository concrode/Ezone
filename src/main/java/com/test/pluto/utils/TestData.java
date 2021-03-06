package com.test.pluto.utils;

import com.test.pluto.algorithm.DjAlgorithm;
import com.test.pluto.entity.Edge;
import com.test.pluto.entity.IndoorMap;
import com.test.pluto.entity.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by captain on 2017/5/27.
 */
public class TestData {

    public static IndoorMap getMapDataStructure(String building, String floor, String algotrithm) {

       /* IndoorMap map = new IndoorMap(new DjAlgorithm());
        Vertex A = new Vertex("A", 1.1, 1.3);
        Vertex B = new Vertex("B", 1.5, 1.8);
        Vertex C = new Vertex("C", 2.1, 2.5);
        Vertex D = new Vertex("D", 2.2, 2.7);
        Vertex E = new Vertex("E", 3.1, 3.6);
        Vertex F = new Vertex("F", 3.4, 3.9);
        Vertex G = new Vertex("G", 4.1, 4.2);
        Vertex H = new Vertex("H", 4.3, 4.7);
        Vertex I = new Vertex("I", 1.2, 1.9);
        Vertex J = new Vertex("J", 3.5, 3.8);
        Vertex K = new Vertex("K", 4.5, 4.1);
        Vertex L = new Vertex("L", 5.1, 5.8);
        Vertex M = new Vertex("M", 6.2, 6.7);

        A.adjacency = new Edge[]{ new Edge(B, 1), new Edge(I, 0)};
        B.adjacency = new Edge[]{ new Edge(A, 1), new Edge(C, 2), new Edge(D, 3)};
        C.adjacency = new Edge[]{ new Edge(B, 2), new Edge(E, 1), new Edge(F, 2)};
        D.adjacency = new Edge[]{ new Edge(B, 3), new Edge(E, 2) };
        E.adjacency = new Edge[]{ new Edge(C, 1), new Edge(D, 2), new Edge(G, 3)};
        F.adjacency = new Edge[]{ new Edge(C, 2), new Edge(G, 1), new Edge(H, 2)};
        G.adjacency = new Edge[]{ new Edge(F, 1), new Edge(E, 3)};
        H.adjacency = new Edge[]{ new Edge(F, 2) };
        I.adjacency = new Edge[]{ new Edge(A, 0), new Edge(J, 2), new Edge(L, 1)};
        J.adjacency = new Edge[]{ new Edge(I, 2), new Edge(K, 2)};
        K.adjacency = new Edge[]{ new Edge(J, 2), new Edge(L, 2), new Edge(M, 1)};
        L.adjacency = new Edge[]{ new Edge(K, 2), new Edge(M, 4), new Edge(I, 1)};
        M.adjacency = new Edge[]{ new Edge(K, 1), new Edge(L, 4)};

        List<Vertex> vertices = new ArrayList<>();
        vertices.add(A);
        vertices.add(B);
        vertices.add(C);
        vertices.add(D);
        vertices.add(E);
        vertices.add(F);
        vertices.add(G);
        vertices.add(H);
        vertices.add(I);
        vertices.add(J);
        vertices.add(K);
        vertices.add(L);
        vertices.add(M);

        map.setVertex(vertices);*/


        IndoorMap map = new IndoorMap(new DjAlgorithm());
        map.setBuilding(building);
        map.setBuilding(floor);

        Vertex A1 = new Vertex("MainEntranceToSecondFloorDoor", -31.97773387, 115.8159912);
        Vertex B2 = new Vertex("RightStairs1", -31.97769092, 115.8163738);
        Vertex C3 = new Vertex("RightStairsSecondToFirst",	-31.97769234,115.81634827);
        Vertex D4 = new Vertex("LeftStairsSecondToFirst"	,-31.97767244,	115.81595801);
        Vertex E5 = new Vertex("StairLinkRoofSecond", -31.97768267,	115.81593890);
        Vertex F6 = new Vertex("StairLinKSecondFirst", -31.97768267,	115.81593890);
        Vertex G7 = new Vertex("LeftStairs1",	-31.97764712,	115.81595700);
        Vertex H8 = new Vertex("LeftStairwellSecondToTopFloor",	-31.97766447,	115.81593823);
        Vertex I9 = new Vertex("2.22Door",	-31.97766163,	115.81625205);
        Vertex J10 = new Vertex("OfficeCorridor6",	-31.97767642,	115.81623662);
        Vertex K11 = new Vertex("OfficeCorridor5",	-31.97767670,	115.81621416);
        Vertex L12 = new Vertex("OfficeCorridor4",	-31.97767755,	115.81617795);
        Vertex M13 = new Vertex("OfficeCorridor3",	-31.97767755,	115.81614107);
        Vertex N14 = new Vertex("OfficeCorridor2",	-31.97767784,	115.81611861);
        Vertex O15 = new Vertex("OfficeCorridor1",	-31.97767784,	115.81610855);
        Vertex P16 = new Vertex("RightCorridor1",	-31.97764542,	115.81609178);
        Vertex Q17 = new Vertex("RightCorridor11",	-31.97767016,	115.81637409);
        Vertex R18 = new Vertex("RightCorridor12",	-31.97767073,	115.81635598);
        Vertex S19 = new Vertex("RightCorridor9",	-31.97764343,	115.81635498);
        Vertex T20 = new Vertex("RightCorridor8",	-31.97764485,	115.81628792);
        Vertex U21 = new Vertex("RightCorridor5",	-31.97764456,	115.81623662);
        Vertex V22 = new Vertex("RightCorridor4", -31.97764428,	115.81617728);
        Vertex W23 = new Vertex("RightCorridor3",	-31.9776448	,   115.81613068);
        Vertex X24 = new Vertex("RightCorridor2",	-31.97764485,	115.81611693);
        Vertex Y25 = new Vertex("HallwayDoor",	-31.97764542,	115.81607703);
        Vertex Z26 = new Vertex("LeftCorridor3",	-31.97764599,	115.81601970);
        Vertex A27 = new Vertex("LeftCorridor2",	-31.97764655,	115.81598449);
        Vertex B28 = new Vertex("RightStairsDoor",	-31.97767841,	115.81637375);
        Vertex C29 = new Vertex("2.09Door",	-31.97764855,	115.81638046);
        Vertex D30 = new Vertex("2.28Door",	-31.97766959,	115.81638582);
        Vertex E31 = new Vertex("2.26Door",	-31.97767187,	115.81633486);
        Vertex F32 = new Vertex("2.20Door",	-31.97768552,	115.81623696);
        Vertex G33 = new Vertex("2.16Door",	-31.97768552,	115.81617862);
        Vertex H34 = new Vertex("2.18Door",	-31.97768552,	115.81621483);
        Vertex I35 = new Vertex("2.14Door",	-31.97768552,	 115.81614107);
        Vertex J36 = new Vertex("2.12Door",	-31.97768609,	115.81610888);
        Vertex K37 = new Vertex("2.10Door",	-31.97766220,	115.81609178);
        Vertex L38 = new Vertex("FemaleToiletDoor",	-31.97766390,	115.81607200);
        Vertex M39 = new Vertex("CleanerDoor",	-31.97766333,	 115.81604719);
        Vertex N40 = new Vertex("MaleToiletDoor",	-31.97768097,	115.81600428);
        Vertex O41 = new Vertex("LeftStairDoor", -31.97764712,	115.81596706);
        Vertex P42 = new Vertex("2.07Door2", 	-31.97763489,	115.81635531);
        Vertex Q43 = new Vertex("2.07Door1",	-31.97763632,	115.81628624);
        Vertex R44 = new Vertex("2.03Door1",	-31.97763774,	 115.81606127);
        Vertex S45 = new Vertex("2.01Door2",	-31.97763717,	115.81601970);
        Vertex T46 = new Vertex("2.01Door1",	-31.97763717,	115.81598483);
        Vertex U47 = new Vertex("2.05Door1",	-31.97763575,	115.81617694);
        Vertex V48 = new Vertex("2.03Door2",	-31.97763603,	115.81613034);
        Vertex W49 = new Vertex("2.05Door2",	-31.97763660,	115.81624433);
        Vertex X50 = new Vertex("Waypoint",	-31.97766333,	115.81623696);
        Vertex Y51 = new Vertex("2.24Door",	-31.97766220,	115.81629127);
        Vertex Z52 = new Vertex("Waypoint",	-31.97766277,	115.81611827);
        Vertex A53 = new Vertex("LeftCorridor1",	-31.97768097,	115.81598684);
        Vertex B54 = new Vertex("LeftCorridor4",	-31.97764599,	115.81604686);
        Vertex C55 = new Vertex("RightCorridor6",	-31.97764456,	115.81624467);
        Vertex D56 = new Vertex("LeftCorridor5",	-31.97764599,	115.81606194);
        Vertex E57 = new Vertex("LeftCorridor6",	-31.97764599,	115.81607066);
        Vertex F58 = new Vertex("RightCorridor10",	-31.97764883,	115.81637207);
        Vertex G59 = new Vertex("LeftLandingBetweenSecondAndFirst1",	-31.97769974,	 115.81595801);
        Vertex H60 = new Vertex("LeftLandingBetweenSecondAndFirst2",	-31.97769945,	115.81593890);
        Vertex I61 = new Vertex("LandingBetweenSecondAndFirst1",	-31.97772021,	115.81637375);
        Vertex J62 = new Vertex("LandingBetweenSecondAndFirst2",	-31.97772050,	115.81634894);
        Vertex K63 = new Vertex("LeftStairs2",	-31.97764684,	115.81593823);
        Vertex L64 = new Vertex("RightCorridor7",	-31.97764456,	115.81625272);
        Vertex M65 = new Vertex("DoorToOfficeHallway1", -31.97763603, 115.81613034);
        Vertex N66 = new Vertex("DoorToOfficeHallway2", -31.97766333, 115.81623696);

        A1.adjacency = new Edge[]{ new Edge(A53, 5.9)};
        B2.adjacency = new Edge[]{ new Edge(I61, 3.3), new Edge(B28, 1.4)};
        C3.adjacency = new Edge[]{ new Edge(J62, 3.1)};
        D4.adjacency = new Edge[]{ new Edge(G59, 3), new Edge(G7, 2.8)};
        E5.adjacency = new Edge[]{ new Edge(H8, 2)};
        F6.adjacency = new Edge[]{ new Edge(H60, 1.9)};
        G7.adjacency = new Edge[]{ new Edge(D4, 2.8), new Edge(O41, 0.9), new Edge(K63, 1.8)};
        H8.adjacency = new Edge[]{ new Edge(K63, 2), new Edge(E5, 2)};
        I9.adjacency = new Edge[]{ new Edge(L64, 1.9)};
        J10.adjacency = new Edge[]{ new Edge(F32, 1), new Edge(K11, 2.1), new Edge(N66, 1.5)};
        K11.adjacency = new Edge[]{ new Edge(H34, 1), new Edge(J10, 2.1), new Edge(L12, 3.5)};
        L12.adjacency = new Edge[]{ new Edge(G33, 0.9), new Edge(K11, 3.4), new Edge(M13, 3.5)};
        M13.adjacency = new Edge[]{ new Edge(I35, 0.9), new Edge(L12, 3.5), new Edge(N14, 2.1)};
        N14.adjacency = new Edge[]{ new Edge(O15, 0.9), new Edge(M13, 2.1), new Edge(M65, 1.7)};
        O15.adjacency = new Edge[]{ new Edge(J36, 0.9), new Edge(N14, 0.9)};
        P16.adjacency = new Edge[]{ new Edge(Y25, 1.4), new Edge(K37, 1.9)};
        Q17.adjacency = new Edge[]{ new Edge(F58, 2.4), new Edge(D30, 1.1), new Edge(B28, 0.9), new Edge(R18, 1.7), new Edge(D30, 1.1), new Edge(B28, 0.9), new Edge(S19, 3.5)};
        R18.adjacency = new Edge[]{ new Edge(F58, 2.9), new Edge(E31, 2), new  Edge(Q17, 1.7), new Edge(S19, 3)};
        S19.adjacency = new Edge[]{ new Edge(T20, 6.3), new Edge(P42, 0.9), new Edge(F58, 1.7), new Edge(Q17, 3.5), new Edge(R18, 3)};
        T20.adjacency = new Edge[]{ new Edge(Q43, 1), new Edge(Y51, 2), new Edge(S19, 6.3), new Edge(L64, 3.3)};
        U21.adjacency = new Edge[]{ new Edge(C55, 0.8), new Edge(V22, 5.6), new Edge(N66,2.1)};
        V22.adjacency = new Edge[]{ new Edge(U47, 0.9), new Edge(U21, 5.6), new Edge(W23, 4.4)};
        W23.adjacency = new Edge[]{ new Edge(V48, 1), new Edge(V22, 4.4)};
        X24.adjacency = new Edge[]{ new Edge(M65, 2)};
        Y25.adjacency = new Edge[]{ new Edge(P16, 1.4), new Edge(E57, 0.6)};
        Z26.adjacency = new Edge[]{ new Edge(S45, 1), new Edge(B54, 2.6), new Edge(A27, 3.3)};
        A27.adjacency = new Edge[]{ new Edge(O41, 1.6), new Edge(A53, 3.8), new Edge(T46, 1), new Edge(Z26, 3.3)};
        B28.adjacency = new Edge[]{ new Edge(B2, 1.4), new Edge(Q17, 0.9)};
        C29.adjacency = new Edge[]{ new Edge(F58, 0.8)};
        D30.adjacency = new Edge[]{ new Edge(Q17, 1.1)};
        E31.adjacency = new Edge[]{ new Edge(R18, 2)};
        F32.adjacency = new Edge[]{ new Edge(J10, 1)};
        G33.adjacency = new Edge[]{ new Edge(L12, 0.9)};
        H34.adjacency = new Edge[]{ new Edge(K11, 1)};
        I35.adjacency = new Edge[]{ new Edge(M13, 0.9)};
        J36.adjacency = new Edge[]{ new Edge(O15, 0.9)};
        K37.adjacency = new Edge[]{ new Edge(P16, 1.9)};
        L38.adjacency = new Edge[]{ new Edge(E57, 2)};
        M39.adjacency = new Edge[]{ new Edge(B54, 1.9)};
        N40.adjacency = new Edge[]{ new Edge(A53, 1.6)};
        O41.adjacency = new Edge[]{ new Edge(A27, 1.6), new Edge(G7, 0.9)};
        P42.adjacency = new Edge[]{ new Edge(S19, 0.9)};
        Q43.adjacency = new Edge[]{ new Edge(T20, 1)};
        R44.adjacency = new Edge[]{ new Edge(D56, 0.9)};
        S45.adjacency = new Edge[]{ new Edge(Z26, 1)};
        T46.adjacency = new Edge[]{ new Edge(A27, 1)};
        U47.adjacency = new Edge[]{ new Edge(V22, 0.9)};
        V48.adjacency = new Edge[]{ new Edge(W23, 1)};
        W49.adjacency = new Edge[]{ new Edge(C55, 0.9)};
        Y51.adjacency = new Edge[]{ new Edge(T20, 2)};
        A53.adjacency = new Edge[]{ new Edge(A1, 5.9), new Edge(N40, 1.6), new Edge(A27, 3.8)};
        B54.adjacency = new Edge[]{ new Edge(M39, 1.9), new Edge(D56, 1.4), new Edge(Z26, 2.6)};
        C55.adjacency = new Edge[]{ new Edge(W49, 0.9), new Edge(L64, 0.8), new Edge(U21, 0.8)};
        D56.adjacency = new Edge[]{ new Edge(B54, 1.4), new Edge(R44, 0.9), new Edge(E57, 0.8)};
        E57.adjacency = new Edge[]{ new Edge(D56, 0.8), new Edge(L38, 2), new Edge(Y25, 0.6)};
        F58.adjacency = new Edge[]{ new Edge(C29, 0.8), new Edge(Q17, 2.4), new Edge(R18, 2.9), new Edge(S19, 1.7)};
        G59.adjacency = new Edge[]{ new Edge(H60, 1.8), new Edge(D4, 3)};
        H60.adjacency = new Edge[]{ new Edge(G59, 1.8), new Edge(F6, 1.9)};
        I61.adjacency = new Edge[]{ new Edge(J62, 2.3), new Edge(B2, 3.3)};
        J62.adjacency = new Edge[]{ new Edge(C3, 3.1), new Edge(I61, 2.3)};
        K63.adjacency = new Edge[]{ new Edge(G7, 1.8), new Edge(H8, 2)};
        L64.adjacency = new Edge[]{ new Edge(C55, 0.8), new Edge(I9,1.9), new Edge(T20, 3.3)};
        M65.adjacency = new Edge[]{ new Edge(X24, 2),  new Edge(N14, 1.7) };
        N66.adjacency = new Edge[]{ new Edge(U21, 2.1), new Edge(J10, 1.5)};


        List<Vertex> vertices = new ArrayList<>();
        vertices.add(A1);
        vertices.add(B2);
        vertices.add(C3);
        vertices.add(D4);
        vertices.add(E5);
        vertices.add(F6);
        vertices.add(G7);
        vertices.add(H8);
        vertices.add(I9);
        vertices.add(J10);
        vertices.add(K11);
        vertices.add(L12);
        vertices.add(M13);
        vertices.add(N14);
        vertices.add(O15);
        vertices.add(P16);
        vertices.add(Q17);
        vertices.add(R18);
        vertices.add(S19);
        vertices.add(T20);
        vertices.add(U21);
        vertices.add(V22);
        vertices.add(W23);
        vertices.add(X24);
        vertices.add(Y25);
        vertices.add(Z26);
        vertices.add(A27);
        vertices.add(B28);
        vertices.add(C29);
        vertices.add(D30);
        vertices.add(E31);
        vertices.add(F32);
        vertices.add(G33);
        vertices.add(H34);
        vertices.add(I35);
        vertices.add(J36);
        vertices.add(K37);
        vertices.add(L38);
        vertices.add(M39);
        vertices.add(N40);
        vertices.add(O41);
        vertices.add(P42);
        vertices.add(Q43);
        vertices.add(R44);
        vertices.add(S45);
        vertices.add(T46);
        vertices.add(U47);
        vertices.add(V48);
        vertices.add(W49);
        vertices.add(X50);
        vertices.add(Y51);
        vertices.add(Z52);
        vertices.add(A53);
        vertices.add(B54);
        vertices.add(C55);
        vertices.add(D56);
        vertices.add(E57);
        vertices.add(F58);
        vertices.add(G59);
        vertices.add(H60);
        vertices.add(I61);
        vertices.add(J62);
        vertices.add(K63);
        vertices.add(L64);


        map.setVertex(vertices);
        return map;

    }
}
