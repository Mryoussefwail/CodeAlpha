/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codealphatasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author youse
 */
public class Student {
    String name;
    Map<String,Double>subjects;
    public Student(){
        this.subjects=new HashMap<>();
        name="";
    }
    public Student(String name,HashMap<String,Double> subjects){
        this.name=name;
        this.subjects=subjects;
    }

    public Map<String,Double> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String,Double> subjects) {
        this.subjects = subjects;
    }


    public double getAverage(){
        double tot=0;
        for(Map.Entry<String, Double> entry : subjects.entrySet()){
            tot+=entry.getValue();
        }
        double average=tot/this.subjects.size();
        return average;
    }
    public HashMap<String,Double> getLowestScore(){
        double min=999999999;
        String sub="";
        for(Map.Entry<String, Double> entry : subjects.entrySet()){
            
            if(entry.getValue()<min){
                min=entry.getValue();
                sub=entry.getKey();
            }
        }
        HashMap<String,Double> temp=new HashMap<>();
        temp.put(sub, min);
        return  temp;
    }
    public Map<String,Double>getHighestScore(){
        double max=-999999999;
        String sub="";
        for(Map.Entry<String, Double> entry : subjects.entrySet()){
            
            if(entry.getValue()>max){
                max=entry.getValue();
                sub=entry.getKey();
            }
        }
        Map<String,Double> temp=new HashMap<>();
        temp.put(sub, max);
        return  temp;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
