package com.company;

import com.company.Students.StudentA;
import com.company.Students.StudentB;

import java.util.ArrayList;

public class BeginningLecture {

    public static void main(String[] args) {


        ArrayList<Group> lecture = new ArrayList<Group>();
        lecture.add(new Professor());
        lecture.add(new StudentA(3,5,"Petya"));
        lecture.add(new StudentB(5,7,"Kate"));

        for(Group i:lecture){
            i.doAHeadCount();

        }
    }
}
