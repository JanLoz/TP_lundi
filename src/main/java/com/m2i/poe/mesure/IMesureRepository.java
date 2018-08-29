package com.m2i.poe.mesure;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;

public interface IMesureRepository {

    void load (String uri) throws IOException;
    List<Double> getTheoricalList(); // liste de double
    List<Double> getMesureList();
    List<Double> getDifferenceList();
    List<Double> getQuadraticList();
    List<Integer> getTimeDifferenceErrorList(double delta);
    List<Integer> getTimeQuadraticErrorList (double delta);

}
