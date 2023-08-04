package com.example.holamundo;

import java.util.ArrayList;
import java.util.List;

public class NumeroService {

    public Integer obtenerTotal(Integer n) {
        int counter = 0;

        for(int i=0;i<n;i++){
            String str = Integer.toString(i);
            if(!str.startsWith("13")){
               counter+=1;
            }
        }

        n = counter;

        return n;
    }
}
