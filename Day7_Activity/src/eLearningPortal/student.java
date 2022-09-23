package eLearningPortal;

import java.lang.reflect.Array;

public class student {
    String name, college;
    int enroll_id;

    public student (String name, int enroll_id, String college){
        this.name=name;
        this.college= college;
        this.enroll_id= enroll_id;
    }

    public String toString(){
        return(name+"\n"+college+"\n"+ enroll_id);
        }
}
