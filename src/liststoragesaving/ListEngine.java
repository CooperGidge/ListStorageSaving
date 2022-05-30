/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststoragesaving;

import java.util.*;
import java.io.*;

/**
 *
 * @author cogid4775
 */
public class ListEngine {
    
    private ArrayList <String> list;
    
    public ListEngine() {
        list = new ArrayList<String>();
    }
    
    public void addItem(String s) {
        list.add(s);
    }
    
    public String getItem(int n) {
        return list.get(n);
    }
    
}
