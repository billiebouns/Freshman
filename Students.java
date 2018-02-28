package com.company.Students;

import com.company.Group;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Students extends Group {

    private int averageScore;
    private int visitRating;
    private String name;
    private int totalScore = averageScore+visitRating;

public Students(int averageScore,int visitRating,String name){
    this.averageScore = averageScore;
    this.visitRating = visitRating;
    this.name = name;


}

    @Override
    public void voidClassPresident() {
        ArrayList<Students>classPresident = new ArrayList<Students>();
        classPresident.add(new StudentA(3,5,"Petya"));
        classPresident.add(new StudentB(5,7,"Kate"));
        Random rnd = new Random();
        for(Students i :classPresident);
        if(totalScore>10){
           /*
           Тут должен создаваться новый список студентов у которых totalScore  превишает 10.
           Но я не умею работать со списками, нечего кроме Итерации.
           Из этого списка, рандомно выбираеться староста, и тот студент который выбран,
           переопределяет  метод voidClassPresident  и передает ее в функции main.
            */


        }
return;
    }
}
