package com.codecool.blazpie;

import java.util.ArrayList;
import java.util.List;

public class Flaterer {

    public List gimmeFlat (List input) {

        List output = new ArrayList();

        for (Object elem : input) {
            if (elem instanceof List) {
                output.addAll(gimmeFlat((List) elem));
            } else {
                output.add(elem);
            }
        }

        return output;
    }
}
